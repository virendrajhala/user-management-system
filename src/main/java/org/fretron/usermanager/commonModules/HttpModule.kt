package org.fretron.usermanager.commonModules

import dagger.Module
import dagger.Provides
import org.freton.usermanager.resource.UserResource
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import javax.inject.Named
import javax.ws.rs.core.UriBuilder

@Module
class HttpModule
{
    @Provides
        fun server(@Named("serverIp")  serverIp:String,
                   @Named("serverPort") serverPort:Int,
                   userResource: UserResource):HttpServer{

            val baseUri = UriBuilder.fromUri(serverIp).port(serverPort).build()
            val config = ResourceConfig(userResource::class.java)
            val server = GrizzlyHttpServerFactory.createHttpServer(baseUri,config)

            return server
        }


}