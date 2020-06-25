package io.rafaeljpc.quarkus.simple.rest

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class MyResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/user")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

}