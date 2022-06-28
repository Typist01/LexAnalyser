package com.sparta.lex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.sparta.lex.LexAnalyser;

public class LexAnalyserTest {
    LexAnalyser analyser = new LexAnalyser();

    @Test
    void numbersOfCharTest(){
        Assertions.assertEquals(21,analyser.getCharNum("This is a test string"));
    }

    @Test
    void countingWordsTest(){
        Assertions.assertEquals(12,analyser.getWordsCount("Spartan have raise their kids in small village to become furious warriors"));
    }

    @Test
    void removeCharactersTest(){
        Assertions.assertEquals("this is a string without commas",analyser.removeExtraCharacters("this, is, a string, without commas,"));

    }


}
