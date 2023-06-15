package ruan.nunes.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;

@QuarkusTest
public class LivenessCheckTest {
    @Test
    public void testHealth() {
        given()
          .when().get("/q/health")
          .then()
             .statusCode(200)
             .body(containsStringIgnoringCase("up"));
    }
}