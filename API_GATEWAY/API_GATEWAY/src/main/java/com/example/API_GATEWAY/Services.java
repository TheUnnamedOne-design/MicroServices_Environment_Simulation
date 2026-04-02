package com.example.API_GATEWAY;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.Payload;
import org.example.ProcessorResponse;
import java.util.Map;
import java.util.HashMap;

@RestController
public class Services {

    @PostMapping("/process")
    public ProcessorResponse processRequest(Payload payload)
    {
        Map<Character, Integer> charCountMap = new HashMap<>();
        charCountMap.put('a', 5);
        ProcessorResponse response = new ProcessorResponse(charCountMap);
        return response;
    }
}
