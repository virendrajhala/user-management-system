package org.freton.usermanager.model

import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import kotlinx.serialization.Serializable
import org.json.JSONObject

@Serializable
data class UserModel(
    var id: Long?,
    var name: String?,
    var email: String?,
    var age: Int?,
    var address: String?
    ){
    override fun toString(): String {
        return JSONObject()
            .put("id",this.id ?: JSONObject.NULL)
            .put("name",this.name?: JSONObject.NULL)
            .put("email",this.email?: JSONObject.NULL)
            .put("age",this.age?: JSONObject.NULL)
            .put("address",this.address?: JSONObject.NULL)
            .toString()
//       val mapper = ObjectMapper()
//        val jsonString = mapper.writeValueAsString(this)
//        return jsonString
    }
}