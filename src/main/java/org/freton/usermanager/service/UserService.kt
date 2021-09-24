package org.freton.usermanager.service

import org.freton.usermanager.model.UserModel
import org.freton.usermanager.repository.UserRepository
import org.freton.usermanager.userexception.UserException

val userRepo = UserRepository()

class UserService {

    fun getUsers() : MutableList<UserModel>{

        var userList = userRepo.getUsers()
        return userList
    }

    fun addUser(user:UserModel):UserModel{

        try {
           val addedUser = userRepo.addUser(user)
            return addedUser
        }

        catch(e: UserException){
            throw e
        }
    }

    fun updateUser(user:UserModel):UserModel?{

        try {
            val updatedUser = userRepo.updateUser(user)
            return updatedUser
        }

        catch(e: UserException){
            throw e
        }
    }

    fun deleteUser(id:Long): Boolean{

        try {
          val isUserDeleted = userRepo.deleteUser(id)
            return isUserDeleted
        }

        catch(e: UserException){
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