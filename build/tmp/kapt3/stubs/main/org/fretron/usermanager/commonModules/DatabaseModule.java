package org.fretron.usermanager.commonModules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u001c\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lorg/fretron/usermanager/commonModules/DatabaseModule;", "", "()V", "getMongoClient", "Lcom/mongodb/MongoClient;", "databaseServerIp", "", "databaseServerPort", "", "getMongoDatabase", "Lcom/mongodb/client/MongoDatabase;", "databaseName", "mongoClient", "UserManagementSystem"})
@dagger.Module()
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "mongoClient")
    @dagger.Provides()
    public final com.mongodb.MongoClient getMongoClient(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "dbServerIp")
    java.lang.String databaseServerIp, @javax.inject.Named(value = "dbServerPort")
    int databaseServerPort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "mongoDatabase")
    @dagger.Provides()
    public final com.mongodb.client.MongoDatabase getMongoDatabase(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "dbName")
    java.lang.String databaseName, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "mongoClient")
    com.mongodb.MongoClient mongoClient) {
        return null;
    }
}