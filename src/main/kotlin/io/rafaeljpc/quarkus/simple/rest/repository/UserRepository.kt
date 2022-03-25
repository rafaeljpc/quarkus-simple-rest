package io.rafaeljpc.quarkus.simple.rest.repository

import io.quarkus.mongodb.panache.PanacheMongoRepository
import io.rafaeljpc.quarkus.simple.rest.model.User
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository : PanacheMongoRepository<User>