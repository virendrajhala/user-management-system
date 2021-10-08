import jakarta.ws.rs.core.UriBuilder
import org.freton.usermanager.resource.UserResource
import org.fretron.usermanager.component.DaggerAppComponent
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import java.net.URI

fun main(){

    val component = DaggerAppComponent.create()
    val server = component.getHttpServer()
    server.start()
}