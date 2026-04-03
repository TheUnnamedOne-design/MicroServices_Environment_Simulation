package com.example.API_GATEWAY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.example.Payload;
import org.example.ProcessorResponse;

@RestController
public class Services {

    @Autowired
    private APIMethods apiMethods;




    @PostMapping("/process")
    public ProcessorResponse processRequest(@RequestBody Payload payload)
    {
        ProcessorResponse response = apiMethods.ProcessData(payload);
        return response;
    }
}
