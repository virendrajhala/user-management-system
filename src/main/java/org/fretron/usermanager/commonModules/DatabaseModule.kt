package org.fretron.usermanager.commonModules

import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun getMongoClient():MongoClient{

        val host = "localhost"
        val port = 27017
        return MongoClient(host,port)
    }

    @Provides
    fun getMongoDatabase():MongoDatabase{

        val databaseName = "UserManager"
        return getMongoClient().getDatabase(databaseName)
    }
}