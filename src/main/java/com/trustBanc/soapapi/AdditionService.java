package com.trustBanc.soapapi;

import org.springframework.stereotype.Service;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class AdditionService {
    static final String NAMESPACE_URI = "http://soap-api.com/trustBanc/soapapi";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AdditionRequest")
    @ResponsePayload
    public AdditionResponse addNumbers(@RequestPayload AdditionRequest additionRequest) {

        int result = additionRequest.getNum1() + additionRequest.getNum2();
        return AdditionResponse.
        builder()
                .result(result)
                .build();
    }
}
