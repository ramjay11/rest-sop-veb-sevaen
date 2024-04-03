package com.ramjava.saabunpraimar.endpoint;

import com.ramjava.saabubpaimar.GetUserRequest;
import com.ramjava.saabubpaimar.GetUserResponse;
import com.ramjava.saabunpraimar.service.UpayogakartaSeva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@Endpoint
public class UserEndpoint {
    private UpayogakartaSeva upayogakartaSeva;

    public UserEndpoint(UpayogakartaSeva upayogakartaSeva) {
        this.upayogakartaSeva = upayogakartaSeva;
    }
    // SOAP Request payload
    @PayloadRoot(namespace = "http://ramjava.com/saabubpaimar", localPart = "getUserRequest")
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(upayogakartaSeva.getUsers(request.getName()));
        return response;
    }
}
