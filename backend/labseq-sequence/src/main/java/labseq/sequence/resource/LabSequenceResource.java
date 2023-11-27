package labseq.sequence.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import labseq.sequence.service.LabseqSequenceService;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.math.BigInteger;

@Path("v1")
@RegisterRestClient
public class LabSequenceResource {

    @Inject
    LabseqSequenceService labseqSequenceService;

    @GET
    @Path("/labseq/{n}")
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(summary = "Labseq-Sequence", description = "Receive a simple and positive integer, calculates based on " +
            "labseq-sequence and returns the result")
    @APIResponse(responseCode = "200", description = "Successful operation")
    public BigInteger calculate(@PathParam("n") Long n){
        return labseqSequenceService.calcule(n);
    }

}
