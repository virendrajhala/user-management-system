package org.freton.usermanager.repository

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.freton.usermanager.model.UserModel



@Path("/user")
class UserRepository {

    var userList : List<UserModel>

    init{
        userList  = mutableListOf()
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getUsers(){

    }
}