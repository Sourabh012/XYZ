package com.example.XYZ.Service;

import com.example.XYZ.model.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class XYZService {

    public ResponseEntity<String> xyService(){
        try {
            throw new RuntimeException("An error occurred during the operation");
        } catch (RuntimeException e) {
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),HttpStatus.BAD_REQUEST.getReasonPhrase(),"Bad request Error! Bad request Error! Bad request Error! Bad request Error!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse.toString());
        }
    }


}
