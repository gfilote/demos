package server.exceptions;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ClientExceptionMapper implements ExceptionMapper<ClientErrorException> {
    @Override
    public Response toResponse(ClientErrorException e) {
        //return Response.status(Response.Status.NOT_FOUND).header("Content-Type", "application/json").entity(new String("NOT FOUND")).build();
        return Response.status(Response.Status.NOT_FOUND).header("Content-Type", "application/json").entity(new String("{\"exception\":\"ClientErrorException\",\"message\":\"Please verify the URL\"}")).build();
    }
}
