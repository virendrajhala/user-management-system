package org.fretron.usermanager.commonModules

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import dagger.Module
import dagger.Provides

@Module
class ConfigModule {

    @Provides
    fun getJacksonObjectMapper(): ObjectMapper {

        return jacksonObjectMapper()
    }

    @Provides
    fun getServerIp():String{

        val host = "http://0.0.0.0"
        return host
    }

    @Provides
    fun getPort():Int{

        val host = 8080
        return host
    }

}