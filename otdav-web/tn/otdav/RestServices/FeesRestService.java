import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Stateless
@Path("otdav_fesses")
public class FeesRestService {
	@EJB
	private FeesService metier;
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response AjouterFees(Fees fees) {

		if (metier.addFSSees(fees) != 0) {

			return Response.status(Status.CREATED).entity("fees added").build();
		}

		return Response.status(Status.NOT_ACCEPTABLE).build();

	}
}
