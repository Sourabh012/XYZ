package com.example.XYZ.model;


public class ErrorResponse {
    private  int httpCode;
    private  String httpMessage;
    private  String moreInformation;

    public ErrorResponse(int httpCode, String httpMessage, String moreInformation) {
        this.httpCode = httpCode;
        this.httpMessage = httpMessage;
        this.moreInformation = moreInformation;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "httpCode=" + httpCode +
                ", httpMessage='" + httpMessage + '\'' +
                ", moreInformation='" + moreInformation + '\'' +
                '}';
    }
}

