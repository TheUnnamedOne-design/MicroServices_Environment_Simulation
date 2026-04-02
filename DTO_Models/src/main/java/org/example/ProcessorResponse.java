package org.example;
import java.util.*;

public class ProcessorResponse {

    Map<Character, Integer> charCountMap;

    public ProcessorResponse(Map<Character,Integer> mp)
    {
        this.charCountMap = mp;
    }

    public Map<Character, Integer> getCharCountMap() {
        return charCountMap;
    }

    public void setCharCountMap(Map<Character, Integer> charCountMap) {
        this.charCountMap = charCountMap;
    }
}
