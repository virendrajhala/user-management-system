import jakarta.ws.rs.core.UriBuilder
import org.freton.usermanager.resource.UserResource
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI

fun main(){
    val baseUri:URI = UriBuilder.fromUri("http://0.0.0.0").port(8000).build()
    val config = ResourceConfig(UserResource::class.java)
    GrizzlyHttpServerFactory.createHttpServer(baseUri,config)

}