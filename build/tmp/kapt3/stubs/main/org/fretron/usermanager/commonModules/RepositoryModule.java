package org.fretron.usermanager.commonModules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lorg/fretron/usermanager/commonModules/RepositoryModule;", "", "()V", "getUserRepository", "Lorg/freton/usermanager/repository/UserRepository;", "mongoClient", "Lcom/mongodb/MongoClient;", "mongoDatabase", "Lcom/mongodb/client/MongoDatabase;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "UserManagementSystem"})
@dagger.Module()
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "userRepo")
    @dagger.Provides()
    public final org.freton.usermanager.repository.UserRepository getUserRepository(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "mongoClient")
    com.mongodb.MongoClient mongoClient, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "mongoDatabase")
    com.mongodb.client.MongoDatabase mongoDatabase, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "objectMapper")
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        return null;
    }
}