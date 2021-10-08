package org.freton.usermanager.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0015\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/freton/usermanager/repository/UserRepository;", "", "mongo", "Lcom/mongodb/MongoClient;", "db", "Lcom/mongodb/client/MongoDatabase;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/mongodb/MongoClient;Lcom/mongodb/client/MongoDatabase;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "addUser", "Lorg/fretron/usermanager/model/UserModel;", "user", "deleteUser", "", "id", "", "(Ljava/lang/Long;)Z", "getUserById", "(Ljava/lang/Long;)Lorg/fretron/usermanager/model/UserModel;", "getUserModel", "dbObject1", "Lcom/mongodb/DBObject;", "getUsers", "", "getUsersByName", "userName", "", "getUsersByNameAndAge", "upperAge", "", "lowerAge", "updateUser", "UserManagementSystem"})
public final class UserRepository {
    private final com.mongodb.MongoClient mongo = null;
    private final com.mongodb.client.MongoDatabase db = null;
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.mongodb.MongoClient mongo, @org.jetbrains.annotations.NotNull()
    com.mongodb.client.MongoDatabase db, @org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.fretron.usermanager.model.UserModel> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.fretron.usermanager.model.UserModel getUserById(@org.jetbrains.annotations.Nullable()
    java.lang.Long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.fretron.usermanager.model.UserModel> getUsersByName(@org.jetbrains.annotations.Nullable()
    java.lang.String userName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.fretron.usermanager.model.UserModel> getUsersByNameAndAge(@org.jetbrains.annotations.Nullable()
    java.lang.String userName, int upperAge, int lowerAge) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.fretron.usermanager.model.UserModel addUser(@org.jetbrains.annotations.NotNull()
    org.fretron.usermanager.model.UserModel user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.fretron.usermanager.model.UserModel updateUser(@org.jetbrains.annotations.NotNull()
    org.fretron.usermanager.model.UserModel user) {
        return null;
    }
    
    public final boolean deleteUser(@org.jetbrains.annotations.Nullable()
    java.lang.Long id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.fretron.usermanager.model.UserModel getUserModel(@org.jetbrains.annotations.NotNull()
    com.mongodb.DBObject dbObject1) {
        return null;
    }
}