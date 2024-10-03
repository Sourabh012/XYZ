package com.example.XYZ.Service;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XYZService {

    // Endpoint 1: Response contains statusCode "3000"
    public ResponseEntity<String> getExtendedServiceAuthorizationResponse() {
        String response = "{\"getExtendedServiceAuthorizationResponse\": {\"status\": {\"statusCode\": \"3000\","
                + "\"detail\": \"Backend Service Error\",\"severity\": \"ERROR\","
                + "\"additionalStatus\": {\"statusCode\":\"B-3025\","
                + "\"detail\": \"Service Auth not found\",\"severity\": \"ERROR\","
                + "\"serviceName\": \"GetAuthDetails-GET API\"}}}}";

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Endpoint 2: Response does not contain statusCode "3000"
    public ResponseEntity<String> getResponseWithoutStatusCode2000() {
        String response = "{\"getExtendedServiceAuthorizationResponse\": {\"status\": {"
                + "\"detail\": \"Operation Successful\",\"severity\": \"INFO\","
                + "\"additionalStatus\": {\"statusCode\":\"5445\","
                + "\"detail\": \"Additional details found\",\"severity\": \"INFO\","
                + "\"serviceName\": \"GetAuthDetails-GET API\"}}}}";

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Endpoint 3: Response with success message and a different status code
    public ResponseEntity<String> getSuccessResponse() {
        String response = "{\"getExtendedServiceAuthorizationResponse\": {\"status\": {\"statusCode\": \"1\","
                + "\"detail\": \"Request processed successfully\",\"severity\": \"INFO\"}}}";

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Endpoint 4: Response simulating a server error but without statusCode 3000

    public ResponseEntity<String> getErrorResponseWithout3000() {
        String response = "{\"getExtendedServiceAuthorizationResponse\": {\"status\": {\"statusCode\": \"5000\","
                + "\"detail\": \"Unexpected Server Error\",\"severity\": \"ERROR\"}}}";

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

