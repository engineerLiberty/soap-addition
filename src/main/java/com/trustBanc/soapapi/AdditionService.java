package com.trustBanc.soapapi;

import com.soap_api.trustbanc.soapapi.AdditionRequest;
import com.soap_api.trustbanc.soapapi.AdditionResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class AdditionService {
    static final String NAMESPACE_URI = "http://soap-api.com/trustBanc/soapapi";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AdditionRequest")
    @ResponsePayload
    public com.soap_api.trustbanc.soapapi.AdditionResponse addNumbers(@RequestPayload AdditionRequest additionRequest) {

        int result = additionRequest.getNum1() + additionRequest.getNum2();
        AdditionResponse response = new AdditionResponse();
        response.setResult(result);
        return response;
    }
}
