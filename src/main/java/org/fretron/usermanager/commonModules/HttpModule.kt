package org.fretron.usermanager.commonModules

import dagger.Module
import org.freton.usermanager.resource.UserResource
import org.fretron.usermanager.component.DaggerAppComponent
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import javax.inject.Inject
import javax.ws.rs.core.UriBuilder

@Module
class HttpModule @Inject constructor(private val userResource: UserResource,
                                     private val serverIp:String,
                                     private val port:Int)
{
        fun server():HttpServer{
            val baseUri = UriBuilder.fromUri(serverIp).port(port).build()
            val config = ResourceConfig(userResource::class.java)
            val server = GrizzlyHttpServerFactory.createHttpServer(baseUri,config)

            return server
        }


}