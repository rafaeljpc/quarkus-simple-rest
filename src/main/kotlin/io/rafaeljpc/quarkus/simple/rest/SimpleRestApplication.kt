package io.rafaeljpc.quarkus.simple.rest

import io.quarkus.runtime.Quarkus
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition
import org.eclipse.microprofile.openapi.annotations.info.Info
import javax.ws.rs.core.Application

@OpenAPIDefinition(info = Info(title = "Employee API", version = "1.0"))
class SimpleRestApplication : Application()

fun main(args: Array<String>) {
    Quarkus.run(*args)
}