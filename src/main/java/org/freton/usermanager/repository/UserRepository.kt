package org.freton.usermanager.repository

import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.freton.usermanager.model.UserModel
import org.freton.usermanager.userexception.UserException

class UserRepository {

    var userList : MutableList<UserModel>
    companion object UserCount{
        var idCount = 10000L
    }

    init{
        userList  = mutableListOf<UserModel>()
    }

    fun getUsers() : MutableList<UserModel>{

        return userList
    }

    fun addUser(user:UserModel):UserModel{

        user.id = UserRepository.idCount++
        val isUserAdded = userList.add(user)

        try {
            if(isUserAdded == false) {
                throw UserException("There was some error in addding the user to the system")
            }

            return user
        }

        catch(e:UserException){
            throw e
        }
    }

    fun updateUser(user:UserModel):UserModel?{

        try {
            var existingUser = userList.firstOrNull { u -> u.id == user.id }
            if (existingUser == null)
                throw UserException("User with id : ${user?.id} does not exist")

            existingUser?.name = user.name
            existingUser?.email = user.email
            existingUser?.age = user.age
            existingUser?.address = user.address

            return existingUser
        }

        catch(e:UserException){
            throw e
        }
    }

    fun deleteUser(id:Long): Boolean{

        var isRemoved : Boolean = false
        try {
            val user = userList.firstOrNull { u -> u.id == id }
            if (user == null)
                throw UserException("User with id : $id does not exist")

            isRemoved = userList.removeIf { u->u.id == id }

            if(isRemoved == false){
                throw UserException("There was some error in deleting the user with id : $id, please try again later")
            }

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
    }
}