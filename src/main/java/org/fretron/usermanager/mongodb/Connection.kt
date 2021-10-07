package org.fretron.usermanager.mongodb

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.mongodb.MongoClient
import com.mongodb.util.JSON
import org.bson.json.JsonObject
import org.fretron.usermanager.model.UserModel

class Connection {


}

fun main(){
    val mongo = MongoClient("localhost", 27017)
    val db = mongo.getDatabase("UserManager")

    val mapper = jacksonObjectMapper()

    val dbCursor = db.getCollection("User").find().iterator()
    val userList = mutableListOf<UserModel>()

    while(dbCursor.hasNext()){
        val dbObject1 = dbCursor.next()
        val jsonOutput = JsonObject(JSON.serialize(dbObject1))

        val user = mapper.readValue(jsonOutput.toString(), UserModel::class.java)
        userList.add(user)
    }

    println(userList)
}