package io.rafaeljpc.quarkus.simple.rest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/user")
class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"
}