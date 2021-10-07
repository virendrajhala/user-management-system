package org.freton.usermanager.repository

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.mongodb.BasicDBObject
import com.mongodb.DBObject
import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Filters
import com.mongodb.util.JSON
import org.bson.Document
import org.bson.json.JsonObject
import org.fretron.usermanager.model.UserModel

class UserRepository {

    private val mongo : MongoClient
    private val db : MongoDatabase
    private val mapper : ObjectMapper
    init{

        mongo = MongoClient("localhost", 27017)
        db = mongo.getDatabase("UserManager")
        mapper = jacksonObjectMapper()
    }

    fun getUsers() : MutableList<UserModel>{

        val dbCursor = db.getCollection("User").find().iterator()
        val userList = mutableListOf<UserModel>()

        while(dbCursor.hasNext()){
            val dbObject1 = dbCursor.next()

            val user = mapper.readValue(JsonObject(JSON.serialize(dbObject1)).toString(),UserModel::class.java)
            userList.add(user)
        }

        return userList
    }

    fun getUserById(id:Long?) : UserModel {

        val userList = mutableListOf<UserModel>()
        val filter = Filters.eq("_id",id)
        val cursor = db.getCollection("User").find(filter).iterator()

        while(cursor.hasNext()) {
            val dbObject1 = cursor.next()

            val user = mapper.readValue(JsonObject(JSON.serialize(dbObject1)).toString(),UserModel::class.java)

            userList.add(user)
        }

      return userList.first()

    }

    fun getUsersByName(userName : String?): MutableList<UserModel> {

        val userList = mutableListOf<UserModel>()
        val filter = Filters.eq("name",userName)
        val cursor = db.getCollection("User").find(filter).iterator()

        while(cursor.hasNext()){
            val dbObject1 = cursor.next()

            val user = mapper.readValue(JsonObject(JSON.serialize(dbObject1)).toString(),UserModel::class.java)

            userList.add(user)
        }

        return userList
    }

    fun getUsersByNameAndAge(userName : String?, upperAge : Int, lowerAge:Int): MutableList<UserModel> {

        val filter = Filters.and(Filters.eq("name",userName),Filters.gte("age",lowerAge),Filters.lte("age",upperAge))
        val dbCursor = db.getCollection("User").find(filter).iterator()

        val userList = mutableListOf<UserModel>()

        while(dbCursor.hasNext()){
            val dbObject1 = dbCursor.next()

            val user = mapper.readValue(JsonObject(JSON.serialize(dbObject1)).toString(),UserModel::class.java)

            userList.add(user)
        }

        return userList
    }

    fun addUser(user:UserModel):UserModel{

        val collection = db.getCollection("User")
        val d = Document.parse(user.toString())

        try {
            collection.insertOne(d)
        } catch (e: Exception) {
            println("Exception occured")
        }
        return UserModel()

    }

    fun updateUser(user:UserModel):UserModel{

        val collection = db.getCollection("User")
        val filter = Filters.eq("_id",user.`id$1`)

        val doc = Document.parse(user.toString())

        // set doc id = our object id
      //  doc["_id"] = user.`id$1`
        val updateDoc = BasicDBObject()
        updateDoc["\$set"] = doc

        collection.updateOne(filter,updateDoc)

        val dbCursor = collection.find(filter).iterator()
        val userList = mutableListOf<UserModel>()
        while(dbCursor.hasNext()){

            val dbObject1 = dbCursor.next()

            val user = mapper.readValue(JsonObject(JSON.serialize(dbObject1)).toString(),UserModel::class.java)

            userList.add(user)
        }
        return userList.first()
    }

    fun deleteUser(id:Long?): Boolean {

        val collection = db.getCollection("User")
        val filter = Filters.eq("_id",id)

        val result = collection.deleteOne(filter)

        return result != null
    }

    fun getUserModel(dbObject1: DBObject) : UserModel{
        val id = dbObject1["_id"]
        val name = dbObject1["name"].toString()
        val address = dbObject1["address"].toString()
        val email = dbObject1["email"].toString()
        val age = dbObject1["age"]

        val user = UserModel(id as Int?,name,address,email, age as Int?)
        return user
    }
}