package org.fretron.usermanager.commonModules

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ConfigModule {

    private val DB_SERVER_IP = "localhost"
    private val DB_PORT = 27017
    private val SERVER_IP = "http://0.0.0.0"
    private val SERVER_PORT = 8080
    private val DB_NAME = "UserManager"

    @Provides
    @Named("objectMapper")
    fun getJacksonObjectMapper(): ObjectMapper {

        return jacksonObjectMapper()
    }

    @Provides
    @Named("serverIp")
    fun getServerIp():String{

        return SERVER_IP
    }

    @Provides
    @Named("serverPort")
    fun getServerPort():Int{

        return SERVER_PORT
    }

    @Provides
    @Named("dbServerPort")
    fun getDatabaseServerPort():Int{

        return DB_PORT
    }

    @Provides
    @Named("dbServerIp")
    fun getDatabaseServerIp():String{
        return DB_SERVER_IP
    }

    @Provides
    @Named("dbName")
    fun getDatabaseName():String{
        return DB_NAME
    }
}