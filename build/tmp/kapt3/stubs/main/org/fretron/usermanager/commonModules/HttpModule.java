package org.fretron.usermanager.commonModules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lorg/fretron/usermanager/commonModules/HttpModule;", "", "()V", "server", "Lorg/glassfish/grizzly/http/server/HttpServer;", "serverIp", "", "serverPort", "", "userResource", "Lorg/freton/usermanager/resource/UserResource;", "UserManagementSystem"})
@dagger.Module()
public final class HttpModule {
    
    public HttpModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.glassfish.grizzly.http.server.HttpServer server(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "serverIp")
    java.lang.String serverIp, @javax.inject.Named(value = "serverPort")
    int serverPort, @org.jetbrains.annotations.NotNull()
    org.freton.usermanager.resource.UserResource userResource) {
        return null;
    }
}