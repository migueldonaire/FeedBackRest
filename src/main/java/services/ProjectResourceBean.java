package services;
import domain.Project;
import persistence.ProjectPersistence;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by miguel on 07/03/2017.
 */


public class ProjectResourceBean implements ProjectResource{

    @Inject
    private ProjectPersistence projectPersistence;

    @Override
    public Response prueba() {
        Project project = new Project();
        project.setName("Un proyecto");
        projectPersistence.persist(project);
        System.out.println(project);
        Project projectReceived = projectPersistence.find(project.getId());
        return Response.ok().entity("recibes datos de prueba/n Nombre Proyecto:"+projectReceived.getName()).build();
    }

    @Override
    public Response createProject(Project project) {
        return Response.ok().build();
    }


}
