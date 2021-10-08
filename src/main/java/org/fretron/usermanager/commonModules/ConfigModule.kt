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

}