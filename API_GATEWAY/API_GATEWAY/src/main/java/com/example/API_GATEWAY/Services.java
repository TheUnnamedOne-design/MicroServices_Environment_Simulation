package com.example.API_GATEWAY;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services {

    @PostMapping("/process")
    public ProcessorResponse processRequest(Payload payload)
    {
        return payload.ProcessResponse();
    }
}
