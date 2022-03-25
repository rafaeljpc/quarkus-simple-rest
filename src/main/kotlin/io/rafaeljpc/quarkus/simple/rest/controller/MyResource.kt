package io.rafaeljpc.quarkus.simple.rest.controller

import io.rafaeljpc.quarkus.simple.rest.model.User
import io.rafaeljpc.quarkus.simple.rest.repository.UserRepository
import javax.validation.Valid
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/user")
class MyResource(
    val userRepository: UserRepository
) {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun listUsers(): List<User> = userRepository.listAll()

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun addUser(@Valid user: User) {
        userRepository.persist(user)
    }
}