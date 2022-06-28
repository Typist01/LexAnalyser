package com.sparta.lex;

import java.util.HashMap;
import java.util.Map;

public class LexAnalyser {



    public String removeExtraCharacters(String sentence){
        return sentence.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
    }
    public int getCharNum(String inputString) {
        return inputString.length();
    }

    //    including space characters
    public int getWordsCount(String inputString) {
        String[] inputArray = inputString.split(" ");
        return inputArray.length;
    }

    public HashMap<String, Integer> getWordMap(String sentence) {

        sentence=removeExtraCharacters(sentence);
        String[] split = sentence.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count + 1);
            } else {
                map.put(split[i], 1);
            }
        }
        return map;
    }

    public HashMap<String, Integer> getCharMap(String sentence) {
        sentence=removeExtraCharacters(sentence);
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < sentence.length(); i++) {
            String myCharString = "" + sentence.charAt(i);
            if (map.containsKey(myCharString)) {
                int count = map.get(myCharString);
                map.put(myCharString, count + 1);
            } else {
                map.put(myCharString, 1);
            }
        }
        return map;
    }

    public String getHighestCount(HashMap<String, Integer> inputMap) {
        int tempVal = 0;
        String tempChar = "";
        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value.equals(" ")){
                continue;
            }
            if (value > tempVal){
                tempVal = value;
                tempChar = key;
            }
        }
        return tempChar + " was the most frequent character with a frequency of " + tempVal ;
    }

}
