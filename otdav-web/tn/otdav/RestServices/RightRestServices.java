package tn.otdav.RestServices;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import pi.esprit.entities.Test_Users;
import tn.esprit.services.ImplServices;

@Stateless
@Path("otdav_rights")
public class RightRestServices {
	@EJB
	private WorkService metier;
	
	

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response AjouterRight(Right right) {

		if (metier.addWork(right) != 0) {

			return Response.status(Status.CREATED).entity("right added").build();
		}

		return Response.status(Status.NOT_ACCEPTABLE).build();

	}
			
	
}
