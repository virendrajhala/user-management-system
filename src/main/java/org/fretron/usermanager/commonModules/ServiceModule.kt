package org.fretron.usermanager.commonModules

import dagger.Module
import dagger.Provides
import org.freton.usermanager.repository.UserRepository
import org.freton.usermanager.service.UserService
import javax.inject.Named

@Module
class ServiceModule {

    @Provides
    @Named("userService")
    fun getUserService(@Named("userRepo") userRepository: UserRepository):UserService{

        return UserService(userRepository)
    }
}