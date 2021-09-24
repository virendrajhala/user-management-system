package org.freton.usermanager.model

data class UserModel(
    var id: Long?,
    var name: String?,
    var email: String?,
    var age: Int?,
    var address: String?
    ){
    override fun toString(): String {
        return super.toString()
    }
}