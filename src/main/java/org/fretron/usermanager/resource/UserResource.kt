package org.freton.usermanager.resource

import com.fasterxml.jackson.databind.DeserializationConfig
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.freton.usermanager.service.UserService
import org.fretron.usermanager.model.UserModel
import org.fretron.usermanager.userexception.UserException
import org.json.JSONObject
import java.io.FileNotFoundException
import java.io.IOException
import java.io.StreamCorruptedException
import javax.inject.Inject
import javax.print.attribute.standard.JobOriginatingUserName

////val userService = UserService()
//val mapper : ObjectMapper
////val mapper = ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false)
////val gsonmapper = Gson().newBuilder().serializeNulls().create()
//
@Path("/user")
class UserResource @Inject constructor(private val userService: UserService, private val mapper: ObjectMapper){

    @Path("/getUsers")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getUsers(): Response {
        try {
            var userList = userService.getUsers()
            return Response.ok(userList.toString()).build()
        }

        catch(e : Exception){
            when(e){
                is UserException ->
                {
                    return Response.ok(e.message).build()
                }

                else ->
                {
                    return Response.serverError().build()
                }
            }

        }

//        println(userList)
//        return Response.ok().entity(userList).toString()
    }

    @Path("/getuserbyid/{uid}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getUserById(
        @PathParam("uid") id : Long?
    ): Response {

        try {
            if (id == null) {
                throw UserException("id can not be null, please supply a valid id")
            }

            val user = userService.getUserById(id)

            return Response.ok(user.toString()).build()

        } catch (e: Exception) {
            when (e) {
                is UserException -> {
                    return Response.ok(e.message).build()
                }
                else -> {
                    return Response.serverError().build()
                }
            }
        }
    }

    @Path("/getusersbyname/{username}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getUsersByName(
        @PathParam("username") userName : String?
    ): Response {

        try {
            if (userName == null) {
                throw UserException("User name can not be null, please supply a valid name")
            }

            val userList = userService.getUsersByName(userName)

            return Response.ok(userList.toString()).build()

        } catch (e: Exception) {
            when (e) {
                is UserException -> {
                    return Response.ok(e.message).build()
                }
                else -> {
                    return Response.serverError().build()
                }
            }
        }
    }

    @Path("/getusersbynameandage")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getUsersByNameAndAge(
        @QueryParam ("name") userName : String?,
        @QueryParam ("lowerage") lowerAge:Int,
        @QueryParam ("upperage") upperAge : Int
    ): Response {

        try {
            val usersList = userService.getUsersByNameAndAge(userName,upperAge,lowerAge)
            return Response.ok(usersList.toString()).build()

        } catch (e: Exception) {
            when (e) {
                is UserException -> {
                    return Response.ok(e.message).build()
                }
                else -> {
                    return Response.serverError().build()
                }
            }
        }
    }

    @Path("/addUser")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun addUser(userJson: String): Response {

        var user = mapper.readValue(userJson, UserModel::class.java)
//        var user = gsonmapper.fromJson(userJson,UserModel::class.java)
//        println(user)

        try {
            if(user.getName() == null || user.getName() == ""){
                throw UserException("User name is mandatory, please mention the user name")
            }
            val addedUser = userService.addUser(user)
            return Response.ok(addedUser.toString()).build()

        } catch (e: Exception) {
            when (e) {
                is UserException -> {
                    return Response.ok(e.message).build()
                }
                else -> {
                    return Response.serverError().build()
                }
            }
        }
    }

    @Path("/updateUser")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun updateUser(userJson: String): Response {
        val user = mapper.readValue(userJson, UserModel::class.java)
        try {
            if(user.getName() === null || user.getName() == ""){
                throw UserException("User name is mandatory, please mention the user name")
            }
            val updatedUser = userService.updateUser(user)
            return Response.ok(updatedUser.toString()).build()
        } catch (e: Exception) {
            return when (e) {
                is UserException -> {
                    Response.ok(e.message).build()
                }
                else -> {
                    Response.serverError().build()
                }
            }
        }
    }

    @Path("/deleteUser/{id}")
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    fun deleteUser(
        @PathParam("id") id : Long?,
    ): Response {

        try {
            if(id == null) {
                throw UserException("id can not be null, please supply a valid id")
            }

            val isUserDeleted = userService.deleteUser(id)

            if (isUserDeleted)
                return Response.ok("User with id : ${id} is deleted successfully").build()

            else {
                throw UserException("There was some error in deleting the user with id : ${id} , please try again later")
            }
        }
        catch (e: Exception) {
            when (e) {
                is UserException -> {
                    return Response.ok(e.message).build()
                }

                is NullPointerException -> {
                    return Response.ok(e.message).build()
                }

                is UnsupportedOperationException -> {
                    return Response.ok(e.message).build()
                }

                else -> {
                    return Response.serverError().build()
                }
            }
        }


    }
}
