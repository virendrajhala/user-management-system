package org.freton.usermanager.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0015\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/freton/usermanager/service/UserService;", "", "userRepo", "Lorg/freton/usermanager/repository/UserRepository;", "(Lorg/freton/usermanager/repository/UserRepository;)V", "addUser", "Lorg/fretron/usermanager/model/UserModel;", "user", "deleteUser", "", "id", "", "(Ljava/lang/Long;)Z", "getUserById", "(Ljava/lang/Long;)Lorg/fretron/usermanager/model/UserModel;", "getUsers", "", "getUsersByName", "userName", "", "getUsersByNameAndAge", "upperAge", "", "lowerAge", "updateUser", "UserManagementSystem"})
public final class UserService {
    private final org.freton.usermanager.repository.UserRepository userRepo = null;
    
    @javax.inject.Inject()
    public UserService(@org.jetbrains.annotations.NotNull()
    org.freton.usermanager.repository.UserRepository userRepo) {
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
}