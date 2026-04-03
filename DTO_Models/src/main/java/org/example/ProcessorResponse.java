package org.example;
import java.util.*;

public class ProcessorResponse {

    Map<String, Integer> charCountMap;

    public ProcessorResponse()
    {
    }

    public ProcessorResponse(Map<String,Integer> mp)
    {
        this.charCountMap = mp;
    }

    public Map<String, Integer> getCharCountMap() {
        return charCountMap;
    }

    public void setCharCountMap(Map<String, Integer> charCountMap) {
        this.charCountMap = charCountMap;
    }
}
