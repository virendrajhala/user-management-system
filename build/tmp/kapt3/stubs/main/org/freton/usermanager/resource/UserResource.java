package org.freton.usermanager.resource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0019\u0010\u000b\u001a\u00020\b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\bH\u0007J\u0014\u0010\u0011\u001a\u00020\b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0007J(\u0010\u0013\u001a\u00020\b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0007J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/freton/usermanager/resource/UserResource;", "", "userService", "Lorg/freton/usermanager/service/UserService;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lorg/freton/usermanager/service/UserService;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "addUser", "Ljakarta/ws/rs/core/Response;", "userJson", "", "deleteUser", "id", "", "(Ljava/lang/Long;)Ljakarta/ws/rs/core/Response;", "getUserById", "getUsers", "getUsersByName", "userName", "getUsersByNameAndAge", "lowerAge", "", "upperAge", "updateUser", "UserManagementSystem"})
@jakarta.ws.rs.Path(value = "/user")
public final class UserResource {
    private final org.freton.usermanager.service.UserService userService = null;
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    
    @javax.inject.Inject()
    public UserResource(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "userService")
    org.freton.usermanager.service.UserService userService, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "objectMapper")
    com.fasterxml.jackson.databind.ObjectMapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @jakarta.ws.rs.Produces(value = {"application/json"})
    @jakarta.ws.rs.GET()
    @jakarta.ws.rs.Path(value = "/getUsers")
    public final jakarta.ws.rs.core.Response getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @jakarta.ws.rs.Produces(value = {"application/json"})
    @jakarta.ws.rs.GET()
    @jakarta.ws.rs.Path(value = "/getuserbyid/{uid}")
    public final jakarta.ws.rs.core.Response getUserById(@org.jetbrains.annotations.Nullable()
    @jakarta.ws.rs.PathParam(value = "uid")
    java.lang.Long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @jakarta.ws.rs.Produces(value = {"application/json"})
    @jakarta.ws.rs.GET()
    @jakarta.ws.rs.Path(value = "/getusersbyname/{username}")
    public final jakarta.ws.rs.core.Response getUsersByName(@org.jetbrains.annotations.Nullable()
    @jakarta.ws.rs.PathParam(value = "username")
    java.lang.String userName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @jakarta.ws.rs.Produces(value = {"application/json"})
    @jakarta.ws.rs.GET()
    @jakarta.ws.rs.Path(value = "/getusersbynameandage")
    public final jakarta.ws.rs.core.Response getUsersByNameAndAge(@org.jetbrains.annotations.Nullable()
    @jakarta.ws.rs.QueryParam(value = "name")
    java.lang.String userName, @jakarta.ws.rs.QueryParam(value = "lowerage")
    int lowerAge, @jakarta.ws.rs.QueryParam(value = "upperage")
    int upperAge) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @jakarta.ws.rs.Produces(value = {"application/json"})
    @jakarta.ws.rs.Consumes(value = {"application/json"})
    @jakarta.ws.rs.POST()
    @jakarta.ws.rs.Path(value = "/addUser")
    public final jakarta.ws.rs.core.Response addUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userJson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @jakarta.ws.rs.Produces(value = {"application/json"})
    @jakarta.ws.rs.Consumes(value = {"application/json"})
    @jakarta.ws.rs.PUT()
    @jakarta.ws.rs.Path(value = "/updateUser")
    public final jakarta.ws.rs.core.Response updateUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userJson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @jakarta.ws.rs.Produces(value = {"text/plain"})
    @jakarta.ws.rs.DELETE()
    @jakarta.ws.rs.Path(value = "/deleteUser/{id}")
    public final jakarta.ws.rs.core.Response deleteUser(@org.jetbrains.annotations.Nullable()
    @jakarta.ws.rs.PathParam(value = "id")
    java.lang.Long id) {
        return null;
    }
}