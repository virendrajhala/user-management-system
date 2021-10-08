package org.fretron.usermanager.component

import dagger.Component
import org.freton.usermanager.repository.UserRepository
import org.freton.usermanager.resource.UserResource
import org.freton.usermanager.service.UserService
import org.fretron.usermanager.commonModules.ConfigModule
import org.fretron.usermanager.commonModules.DatabaseModule

@Component (
    modules = [
        ConfigModule::class,
        DatabaseModule::class
    ]
)
interface AppComponent {

    fun getUserResource() : UserResource
    fun getUserService() : UserService
    fun getUserRepository() : UserRepository
}