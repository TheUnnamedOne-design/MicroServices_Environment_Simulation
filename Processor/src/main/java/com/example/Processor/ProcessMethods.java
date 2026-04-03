package com.example.Processor;
import org.example.Payload;
import org.example.ProcessorResponse;
import java.util.Map;
import java.util.HashMap;

public class ProcessMethods {

    public ProcessorResponse processData(Payload payload)
    {
        String s=payload.getText();

        Map<String,Integer> mp=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            mp.put(String.valueOf(c),mp.getOrDefault(String.valueOf(c),0)+1);
        }

        ProcessorResponse response=new ProcessorResponse(mp);
        return response;
    }
}
