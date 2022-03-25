package io.rafaeljpc.quarkus.simple.rest.model

import io.quarkus.mongodb.panache.PanacheMongoEntity
import io.quarkus.mongodb.panache.common.MongoEntity

@MongoEntity(collection = "user")
class User: PanacheMongoEntity() {
    lateinit var name: String
    lateinit var email: String
}
