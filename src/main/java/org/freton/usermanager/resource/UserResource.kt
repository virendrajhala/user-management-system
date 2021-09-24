package org.freton.usermanager.resource

import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.freton.usermanager.model.UserModel
import org.freton.usermanager.service.UserService
import org.freton.usermanager.service.userRepo
import org.freton.usermanager.userexception.UserException

val userService = UserService()

@Path("/user")
class UserResource {

    @Path("/getUsers")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getUsers() : List<UserModel>{

        var userList = userService.getUsers()
        return userList
    }

    @Path("/addUser")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun addUser(user:UserModel):UserModel{

        try {
            val addedUser = userRepo.addUser(user)
            return addedUser
        }

        catch(e: UserException){
            throw e
        }
    }

    @Path("/updateUser")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun updateUser(user:UserModel):UserModel?{

        try {
            val updatedUser = userRepo.updateUser(user)
            return updatedUser
        }

        catch(e: UserException){
            throw e
        }
    }

    @Path("/deleteUser")
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    fun deleteUser(id:Long): String{

        try {
            val isUserDeleted = userRepo.deleteUser(id)

            if(isUserDeleted)
              return "User with id : $id is deleted successfully"

            else{
                throw UserException("There was some error in deleting the user with id : $id, please try again later")
            }
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