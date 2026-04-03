package com.example.Processor;

import org.example.Payload;
import org.example.ProcessorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Process;

@RestController
public class ProcessorService {


    @PostMapping("/process")
    public ProcessorResponse processor(@RequestBody Payload payload)
    {
        ProcessMethods obj=new ProcessMethods();
        ProcessorResponse response=obj.processData(payload);
        return response;
    }

    @GetMapping("/health")
    public String healthCheck()
    {
        return "Processor is running";
    }
}
