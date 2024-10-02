package com.example.XYZ.Service;

import com.example.XYZ.model.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class XYZService {

        public ResponseEntity<String> getExtendedServiceAuthorizationResponse() {
            // Simulated response with a statusCode and nested data structure
            String response = "{\"getExtendedServiceAuthorizationResponse\": {\"status\": {\"statusCode\": \"3000\","
                    + "\"detail\": \"Backend Service Error\",\"severity\": \"ERROR\","
                    + "\"additionalStatus\": {\"statusCode\":\"B-3025\","
                    + "\"detail\": \"Service Auth not found\",\"severity\": \"ERROR\","
                    + "\"serviceName\": \"GetAuthDetails-GET API\"}}}}";

            // Returning the response with the specified HTTP status (500 Internal Server Error)
            return new ResponseEntity<>(response, HttpStatus.OK); // Adjust HTTP status as per your needs
        }
    }

