package org.freton.usermanager.service

import org.freton.usermanager.repository.UserRepository
import org.fretron.usermanager.model.UserModel
import org.fretron.usermanager.userexception.UserException
import javax.inject.Inject

//val userRepo = UserRepository()

class UserService @Inject constructor(private val userRepo: UserRepository){

    fun getUsers() : MutableList<UserModel>{

        try {
            return userRepo.getUsers()
        }
        catch(e:UserException){
            throw e
        }
        catch (e : Exception){
            throw e
        }

    }

    fun getUserById(id:Long?): UserModel {

        try {
            return userRepo.getUserById(id)

        } catch (e: UserException) {
            throw e
        }
        catch (e : Exception){
            throw e
        }
    }

    fun getUsersByName(userName : String?): MutableList<UserModel> {

        try {
            return userRepo.getUsersByName(userName)
        }
        catch (e: UserException) {
            throw e
        }
        catch (e : Exception){
            throw e
        }
    }

    fun getUsersByNameAndAge(userName : String?, upperAge : Int, lowerAge:Int): MutableList<UserModel> {

        try {
            val usersList = userRepo.getUsersByNameAndAge(userName,upperAge,lowerAge)
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
            return userRepo.addUser(user)
        }

        catch(e: UserException){
            throw e
        }
        catch (e : Exception){
            throw e
        }
    }

    fun updateUser(user:UserModel):UserModel{

        try {
            return userRepo.updateUser(user)
        }

        catch(e: UserException){
            throw e
        }
        catch (e : Exception){
            throw e
        }
    }

    fun deleteUser(id:Long?): Boolean{

        try {
            return userRepo.deleteUser(id)
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
        catch (e : Exception){
            throw e
        }
    }
}