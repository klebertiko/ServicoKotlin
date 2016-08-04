package org.kotlin.api

import org.springframework.stereotype.Component
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

/**
 * Created by Kleber on 04/08/2016.
 */
@Component
@Path("/jersey")
class JerseyAPI {

    @GET
    @Path("/ola")
    @Produces(MediaType.APPLICATION_JSON)
    fun ola(@QueryParam("nome") nome: String): String {
        return "Olá, $nome, sou um ENDPOINT Jersey /GET"
    }
}