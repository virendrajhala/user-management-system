package org.freton.usermanager.repository

import org.freton.usermanager.model.UserModel
import org.freton.usermanager.userexception.UserException

class UserRepository {

    private val userList : MutableList<UserModel>
    companion object UserCount{
        var idCount = 10000L
    }

    init{
        userList  = mutableListOf(
            UserModel(9997,"Mark","vpsj@gmail.com",23,"Auckland, New Zealand"),
            UserModel(9998,"Joe","joe123@gmail.com",21,"Sydney, Australia"),
            UserModel(9999,"Morgan","morgan.123@gmail.com",24,"London, UK"),
            UserModel(10000,"John","john.wick@gmail.com",28,"Washington, USA")
        )
    }

    fun getUsers() : MutableList<UserModel>{
        return userList
    }

    fun getUserById(id:Long?) : UserModel{

        val user = userList.firstOrNull { u -> u.id == id }

        try{
            if(user == null){
                throw UserException("User with id : $id is not present, please check the id and try again")
            }

            return user
        }

        catch(e:UserException){
            throw e
        }

    }

    fun getUsersByName(userName : String?): MutableList<UserModel> {

        val usersList = userList.filter { u-> u.name.equals(userName,ignoreCase = true)}
        try {

            if(usersList == null){
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

        val usersList = userList.filter { u-> u.name.equals(userName,ignoreCase = true) && u.age!! >= lowerAge && u.age!! <= upperAge}
        try {

            if(usersList == null){
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

    fun addUser(user:UserModel):UserModel{

        user.id = ++idCount
        val isUserAdded = userList.add(user)

        try {
            if(isUserAdded) {
                return user
            }
            throw UserException("There was some error in adding the user to the system")
        }

        catch(e:UserException){
            throw e
        }
        catch (e : Exception){
            throw e
        }
    }

    fun updateUser(user:UserModel):UserModel{

        val existingUser = userList.firstOrNull { u -> u.id == user.id }
        try {
            if (existingUser == null)
                throw UserException("User with id : ${user.id} does not exist")

            existingUser.name = user.name
            existingUser.email = user.email
            existingUser.age = user.age
            existingUser.address = user.address

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
        val user = userList.firstOrNull { u -> u.id == id }
        try {
            if (user === null)
                throw UserException("User with id : $id does not exist")

            isRemoved = userList.removeIf { u->u.id == id }

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