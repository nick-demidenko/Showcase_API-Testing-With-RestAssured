package api;

import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.apache.commons.configuration2.ex.ConfigurationException;
import util.ApiConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestForCountriesAPI {

    private ApiConfig apiConfig;

    @BeforeEach
    void setup() throws ConfigurationException
    {
        this.apiConfig = new ApiConfig();
    }

    @Test
    public void testCountryNamesEndpoint() throws ConfigurationException {

        ValidatableResponse response =
                RestAssured.given()
                        .baseUri(apiConfig.getBaseUrl())

                        .when()
                        .get(apiConfig.getCountryNameEndpoint() + apiConfig.getUsa())

                        .then()
                        .statusCode(200)
                        .body("", hasSize(greaterThanOrEqualTo(1)))
                        .body("[0]", hasKey("name"))
                        .body("[0].name", is(notNullValue()));
    }

    @Test
    public void testCountryCurrenciesEndpoint() throws ConfigurationException {

        ValidatableResponse response =
                RestAssured.given()
                        .baseUri(apiConfig.getBaseUrl())

                        .when()
                        .get(apiConfig.getCountryCurrencyEndpoint() + apiConfig.getUsd())

                        .then()
                        .statusCode(200)
                        .body("", hasSize(greaterThanOrEqualTo(1)))
                        .body("[0]", hasKey("currencies"))
                        .body("[0].currencies", is(notNullValue()));
    }

    @Test
    public void testCountryLanguagesEndpoint() throws ConfigurationException {

        ValidatableResponse response =
                RestAssured.given()
                        .baseUri(apiConfig.getBaseUrl())

                        .when()
                        .get(apiConfig.getCountryLanguageEndpoint() + apiConfig.getEnglish())

                        .then()
                        .statusCode(200)
                        .body("", hasSize(greaterThanOrEqualTo(1)))
                        .body("[0]", hasKey("languages"))
                        .body("[0].languages", is(notNullValue()));
    }

    @Test
    public void testCountryCapitalsEndpoint() throws ConfigurationException {

        ValidatableResponse response =
                RestAssured.given()
                        .baseUri(apiConfig.getBaseUrl())

                        .when()
                        .get(apiConfig.getCountryCapitalEndpoint() + apiConfig.getParis())

                        .then()
                        .statusCode(200)
                        .body("", hasSize(greaterThanOrEqualTo(1)))
                        .body("[0]", hasKey("capital"))
                        .body("[0].capital", is(notNullValue()));
    }

    @Test
    public void testCountryRegionEndpoint() throws ConfigurationException {

        ValidatableResponse response =
                RestAssured.given()
                        .baseUri(apiConfig.getBaseUrl())

                        .when()
                        .get(apiConfig.getCountryRegionEndpoint() + apiConfig.getAmerica())

                        .then()
                        .statusCode(200)
                        .body("", hasSize(greaterThanOrEqualTo(1)))
                        .body("[0]", hasKey("region"))
                        .body("[0].region", is(notNullValue()));
    }

    @Test
    public void testCountrySubregionEndpoint() throws ConfigurationException {

        ValidatableResponse response =
                RestAssured.given()
                        .baseUri(apiConfig.getBaseUrl())

                        .when()
                        .get(apiConfig.getCountrySubregionEndpoint() + apiConfig.getNorthAmerica())

                        .then()
                        .statusCode(200)
                        .body("", hasSize(greaterThanOrEqualTo(1)))
                        .body("[0]", hasKey("subregion"))
                        .body("[0].subregion", is(notNullValue()));
    }
}
