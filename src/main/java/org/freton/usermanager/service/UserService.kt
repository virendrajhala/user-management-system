package org.freton.usermanager.service

import org.freton.usermanager.model.UserModel
import org.freton.usermanager.repository.UserRepository

val user = UserRepository()

class UserService {

    fun getUsers() : MutableList<UserModel>{

        var userList = user.getUsers()

    }
}