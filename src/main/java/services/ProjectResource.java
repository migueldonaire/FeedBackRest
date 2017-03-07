package services;

import domain.Project;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by miguel on 06/03/2017.
 */
@Stateless
@Path("/Project")
public interface ProjectResource {

    @GET
    @Produces("text/plain")
    Response prueba();

    @POST
    @Consumes("application/xml")
    Response createProject(Project project);

}
