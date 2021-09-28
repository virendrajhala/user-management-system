package org.freton.usermanager.repository

import com.sun.xml.internal.ws.encoding.soap.SerializationException
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import kotlinx.serialization.json.encodeToStream
import org.freton.usermanager.model.UserModel
import org.freton.usermanager.userexception.UserException
import java.io.*

class UserRepository {

    private var userList : MutableList<UserModel>

    init{
        userList = mutableListOf()
    }

    companion object UserCount{
        var idCount = 10000L
        var userCount = 0

        fun serializeUser(userList : MutableList<UserModel>){
            try {
                val fos = FileOutputStream("User.txt")
                val oos = ObjectOutputStream(fos)
                Json.encodeToStream(userList, oos)
            }
            catch(e : FileNotFoundException){
                throw UserException("The File where data is stored is not found, please check the existence of the file")
            }
            catch(e : StreamCorruptedException){
                throw UserException("The File stream is corrupted, please check the file")
            }
            catch(e : NullPointerException ){
                throw UserException("Null Pointer Exception")
            }
            catch(e : SerializationException ){
                throw UserException("The system suffered error while deserializing the file, please try again")
            }
            catch(e : SecurityException){
                throw UserException("There is a security violation, please adhere to the security guidelines while operating with the file")
            }
            catch(e : IOException){
                throw UserException("The system suffered an I/O Exception, please check the I/O compatibility")
            }
            catch(e : Exception){
                throw UserException("There was an error while deserializing the file, please try again")
            }
        }

        fun deserialiseUser() : MutableList<UserModel>{
            try {

                val fis = FileInputStream("User.txt")
                val ois = ObjectInputStream(fis)
                return Json.decodeFromStream<MutableList<UserModel>>(ois)
            }

            catch(e : FileNotFoundException){
                throw UserException("The File where data is stored is not found, please check the existence of the file")
            }
            catch(e : StreamCorruptedException){
                throw UserException("The File stream is corrupted, please check the file")
            }
            catch(e : NullPointerException ){
                throw UserException("Null Pointer Exception")
            }
            catch(e : SerializationException ){
                throw UserException("The system suffered error while deserializing the file, please try again")
            }
            catch(e : SecurityException){
                throw UserException("There is a security violation, please adhere to the security guidelines while operating with the file")
            }
            catch(e : IOException){
                throw UserException("The system suffered an I/O Exception, please check the I/O compatibility")
            }
            catch(e : Exception){
                throw UserException("There was an error while deserializing the file, please try again")
            }
        }
    }

    fun getUsers() : MutableList<UserModel>{
        try {
            userList = deserialiseUser()
        }
        catch(e:UserException){
            throw e
        }
        catch (e : Exception){
            throw e
        }
        return userList
    }

    fun getUserById(id:Long?) : UserModel{

        try{
            userList = deserialiseUser()
            val user = userList.firstOrNull { u -> u.id == id }

            if(user == null){
                throw UserException("User with id : $id is not present, please check the id and try again")
            }

            return user
        }

        catch(e:UserException){
            throw e
        }
        catch (e : Exception){
            throw e
        }

    }

    fun getUsersByName(userName : String?): MutableList<UserModel> {

        try {
            userList = deserialiseUser()
            val usersList = userList.filter { u-> u.name.equals(userName,ignoreCase = true)}
            if(usersList.size == 0){
                throw UserException("There are no users with the specified name : $userName, please check the name and try again")
            }

            return usersList.toMutableList()

        } catch (e: UserException) {
           throw e
        }
        catch (e : Exception){
            throw e
        }
    }

    fun getUsersByNameAndAge(userName : String?, upperAge : Int, lowerAge:Int): MutableList<UserModel> {

        try {
            userList = deserialiseUser()
            val usersList = userList.filter { u-> u.name.equals(userName,ignoreCase = true) && u.age!! >= lowerAge && u.age!! <= upperAge}
            if(usersList.size == 0){
                throw UserException("There are no users with the specified name : $userName, and age range $lowerAge - $upperAge, please check the name and try again")
            }

            return usersList.toMutableList()

        } catch (e: UserException) {
            throw e
        }
        catch (e : Exception){
            throw e
        }
    }

    fun addUser(user:UserModel):UserModel{

        try {
            if(userCount != 0){
                userList = deserialiseUser()
                val existingUser = userList.firstOrNull { u -> u.email.equals(user.email,ignoreCase = false) }
                if(existingUser != null)
                {
                    throw UserException("User already exists with email id ${user.email}, please enter a different valid email id")
                }
            }
            user.id = ++idCount
            val isUserAdded = userList.add(user)
            ++userCount

            serializeUser(userList)

            if(isUserAdded) {
                return user
            }

            throw UserException("There was a problem in storing the user record in the system, please try again later")
        }

        catch(e:UserException){
            throw e
        }
        catch (e : Exception){
            throw e
        }
    }

    fun updateUser(user:UserModel):UserModel{

        try {
            userList = deserialiseUser()
            val existingUser = userList.firstOrNull { u -> u.id == user.id }
            if (existingUser == null)
                throw UserException("User with id : ${user.id} does not exist")

            existingUser.name = user.name
            existingUser.email = user.email
            existingUser.age = user.age
            existingUser.address = user.address

            serializeUser(userList)

            return existingUser
        }

        catch(e:UserException){
            throw e
        }
        catch (e : Exception){
            throw e
        }
    }

    fun deleteUser(id:Long?): Boolean{

        val isRemoved : Boolean

        try {
            userList = deserialiseUser()
            val user = userList.firstOrNull { u -> u.id == id }
            if (user == null)
                throw UserException("User with id : $id does not exist")

            isRemoved = userList.removeIf { u->u.id == id }
            userCount--
            // write the list to the file after the changes
            serializeUser(userList)

            return isRemoved
        }

        catch(e:UserException){
            throw e
        }

        catch(e:NullPointerException){
            throw e
        }

        catch(e:UnsupportedOperationException)
        {
            throw e
        }
        catch (e : Exception){
            throw e
        }
    }
}