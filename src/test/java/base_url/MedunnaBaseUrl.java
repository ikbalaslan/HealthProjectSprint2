package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import static utilities.AuthenticationMedunna.generateToken;

public class MedunnaBaseUrl {
    public static RequestSpecification spec;


    public static void medunnaSetUp2(){
        spec = new RequestSpecBuilder().
                setBaseUri(ConfigReader.getProperty("medunna_api_url")).
                build();
    }
}
