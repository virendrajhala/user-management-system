package org.fretron.usermanager.component

import dagger.Component
import org.freton.usermanager.repository.UserRepository
import org.freton.usermanager.resource.UserResource
import org.freton.usermanager.service.UserService
import org.fretron.usermanager.commonModules.ConfigModule
import org.fretron.usermanager.commonModules.DatabaseModule
import org.fretron.usermanager.commonModules.HttpModule
import org.glassfish.grizzly.http.server.HttpServer

@Component (
    modules = [
        ConfigModule::class,
        DatabaseModule::class,
        HttpModule::class
    ]
)
interface AppComponent {

    fun getHttpServer(): HttpServer

}