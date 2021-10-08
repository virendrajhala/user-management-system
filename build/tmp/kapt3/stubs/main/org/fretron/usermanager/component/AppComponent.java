package org.fretron.usermanager.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/fretron/usermanager/component/AppComponent;", "", "getUserRepository", "Lorg/freton/usermanager/repository/UserRepository;", "getUserResource", "Lorg/freton/usermanager/resource/UserResource;", "getUserService", "Lorg/freton/usermanager/service/UserService;", "UserManagementSystem"})
@dagger.Component(modules = {org.fretron.usermanager.commonModules.ConfigModule.class, org.fretron.usermanager.commonModules.DatabaseModule.class})
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.freton.usermanager.resource.UserResource getUserResource();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.freton.usermanager.service.UserService getUserService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.freton.usermanager.repository.UserRepository getUserRepository();
}