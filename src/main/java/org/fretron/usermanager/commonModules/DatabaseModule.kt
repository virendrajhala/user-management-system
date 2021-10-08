package org.fretron.usermanager.commonModules

import com.mongodb.MongoClient
import com.mongodb.client.MongoDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named

@Module
class DatabaseModule {

    @Provides
    @Named("mongoClient")
    fun getMongoClient(@Named("dbServerIp") databaseServerIp : String,
                       @Named("dbServerPort") databaseServerPort : Int):MongoClient{

        return MongoClient(databaseServerIp,databaseServerPort)
    }

    @Provides
    @Named("mongoDatabase")
    fun getMongoDatabase( @Named("dbName") databaseName : String,
                          @Named("mongoClient") mongoClient: MongoClient):MongoDatabase{

        return mongoClient.getDatabase(databaseName)
    }
}