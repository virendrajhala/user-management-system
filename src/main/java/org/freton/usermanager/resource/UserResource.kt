package org.freton.usermanager.resource

import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.freton.usermanager.model.UserModel
import org.freton.usermanager.service.UserService
import org.freton.usermanager.service.user

val userService = UserService()

class UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getUsers() : List<UserModel>{

        var userList = userService.getUsers()
        return userList
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.te)
    fun addUser(user: UserModel): Response {

    }
}