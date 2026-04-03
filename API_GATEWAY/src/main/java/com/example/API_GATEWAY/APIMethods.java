package com.example.API_GATEWAY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Component;
import org.example.Payload;
import org.example.ProcessorResponse;

@Component
public class APIMethods {

    @Autowired
    private RestTemplate restTemplate;

    public ProcessorResponse ProcessData(Payload payload) {

        String url="http://localhost:9091/process";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Payload> request = new HttpEntity<>(payload, headers);
        ResponseEntity<ProcessorResponse> response = restTemplate.postForEntity(url, request, ProcessorResponse.class);

        return response.getBody();
    }
}

