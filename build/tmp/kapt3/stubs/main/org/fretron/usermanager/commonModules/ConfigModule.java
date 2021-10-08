package org.fretron.usermanager.commonModules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0004H\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/fretron/usermanager/commonModules/ConfigModule;", "", "()V", "DB_NAME", "", "DB_PORT", "", "DB_SERVER_IP", "SERVER_IP", "SERVER_PORT", "getDatabaseName", "getDatabaseServerIp", "getDatabaseServerPort", "getJacksonObjectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "getServerIp", "getServerPort", "UserManagementSystem"})
@dagger.Module()
public final class ConfigModule {
    private final java.lang.String DB_SERVER_IP = "localhost";
    private final int DB_PORT = 27017;
    private final java.lang.String SERVER_IP = "http://0.0.0.0";
    private final int SERVER_PORT = 8080;
    private final java.lang.String DB_NAME = "UserManager";
    
    public ConfigModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "objectMapper")
    @dagger.Provides()
    public final com.fasterxml.jackson.databind.ObjectMapper getJacksonObjectMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "serverIp")
    @dagger.Provides()
    public final java.lang.String getServerIp() {
        return null;
    }
    
    @javax.inject.Named(value = "serverPort")
    @dagger.Provides()
    public final int getServerPort() {
        return 0;
    }
    
    @javax.inject.Named(value = "dbServerPort")
    @dagger.Provides()
    public final int getDatabaseServerPort() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "dbServerIp")
    @dagger.Provides()
    public final java.lang.String getDatabaseServerIp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "dbName")
    @dagger.Provides()
    public final java.lang.String getDatabaseName() {
        return null;
    }
}