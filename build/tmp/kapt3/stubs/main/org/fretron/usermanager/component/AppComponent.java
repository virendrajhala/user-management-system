package org.fretron.usermanager.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/fretron/usermanager/component/AppComponent;", "", "getHttpServer", "Lorg/glassfish/grizzly/http/server/HttpServer;", "UserManagementSystem"})
@dagger.Component(modules = {org.fretron.usermanager.commonModules.ConfigModule.class, org.fretron.usermanager.commonModules.DatabaseModule.class, org.fretron.usermanager.commonModules.HttpModule.class, org.fretron.usermanager.commonModules.ServiceModule.class, org.fretron.usermanager.commonModules.RepositoryModule.class})
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.glassfish.grizzly.http.server.HttpServer getHttpServer();
}