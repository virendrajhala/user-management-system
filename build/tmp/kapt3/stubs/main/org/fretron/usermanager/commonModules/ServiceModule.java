package org.fretron.usermanager.commonModules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lorg/fretron/usermanager/commonModules/ServiceModule;", "", "()V", "getUserService", "Lorg/freton/usermanager/service/UserService;", "userRepository", "Lorg/freton/usermanager/repository/UserRepository;", "UserManagementSystem"})
@dagger.Module()
public final class ServiceModule {
    
    public ServiceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "userService")
    @dagger.Provides()
    public final org.freton.usermanager.service.UserService getUserService(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "userRepo")
    org.freton.usermanager.repository.UserRepository userRepository) {
        return null;
    }
}