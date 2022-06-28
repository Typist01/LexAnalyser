//package com.sparta.lex;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Analyser {
//    public static void main(String[] args) {
//        String myString = "This is an example string";
////        System.out.println(getWordsCount(myString));
////        System.out.println(getCharNum(myString));
////        System.out.println(myString);
////        getCharMap(myString);
//        HashMap<String, Integer> myCharMap = getCharMap(myString);
//        System.out.println(myCharMap);
//    }
//
//    public static int getCharNum(String inputString) {
//        return inputString.length();
//    }
//
//    //    including space characters
//    public static int getWordsCount(String inputString) {
//        String[] inputArray = inputString.split(" ");
//        return inputArray.length;
//    }
//
//    public static HashMap<String, Integer> getWordMap(String sentence) {
//        sentence = sentence.replaceAll("[^a-zA-Z,0-9]", "");
//        String newString = sentence.replace(",", "");
//        System.out.println("new string = " + newString);
//        System.out.println("hello");
//        String[] split = sentence.split(" ");
//
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//
//        for (int i = 0; i < split.length; i++) {
//            if (map.containsKey(split[i])) {
//                int count = map.get(split[i]);
//                map.put(split[i], count + 1);
//            } else {
//                map.put(split[i], 1);
//            }
//        }
//        return map;
//    }
//
//    public static HashMap<String, Integer> getCharMap(String sentence) {
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//
//        for (int i = 0; i < sentence.length(); i++) {
//            String myCharString = "" + sentence.charAt(i);
//            if (map.containsKey(myCharString)) {
//                int count = map.get(myCharString);
//                map.put(myCharString, count + 1);
//            } else {
//                map.put(myCharString, 1);
//            }
//        }
//        return map;
//    }
//
//    public static int HighestNumberCount(HashMap<String, Integer> inputMap) {
//        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("key = " + key + ", val = " + value);
//            // ...
//        }
//        return 1;
//    }
//
//}
