package com.example.XYZ.controller;

import com.example.XYZ.Service.XYZService;
import com.example.XYZ.model.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XYZController {

    @Autowired
    XYZService service;

    @GetMapping("/perform-operation")
    public ResponseEntity<String> performOperation()
    {
        return service.getExtendedServiceAuthorizationResponse();

    }

    @GetMapping("/perform-operation1")
    public ResponseEntity<String> getResponseWithoutStatusCode2000()
    {
        return service.getResponseWithoutStatusCode2000();

    }


    @GetMapping("/perform-operation2")
    public ResponseEntity<String> getSuccessResponse()
    {
        return service.getSuccessResponse();

    }



    @GetMapping("/perform-operation3")
    public ResponseEntity<String> getErrorResponseWithout3000()
    {
        return service.getExtendedServiceAuthorizationResponse();

    }

}
