package org.fretron.usermanager.commonModules

import com.fasterxml.jackson.databind.ObjectMapper
import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import dagger.Module
import dagger.Provides
import org.freton.usermanager.repository.UserRepository
import javax.inject.Named

@Module
class RepositoryModule {

    @Provides
    @Named("userRepo")
    fun getUserRepository(@Named("mongoClient") mongoClient : MongoClient,
                          @Named("mongoDatabase") mongoDatabase: MongoDatabase,
                          @Named("objectMapper") objectMapper: ObjectMapper):UserRepository{
        return UserRepository(mongoClient,mongoDatabase,objectMapper)
    }
}