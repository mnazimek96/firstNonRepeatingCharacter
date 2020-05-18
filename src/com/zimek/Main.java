package com.zimek;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(method("aaffbbccdeeegg"));
    }

    public static char method(String a){
        HashMap<Character, Integer> letters = new HashMap<>();
        int value = 1;

        for(char letter : a.toCharArray()){
            if (!letters.containsKey(letter)) {
                value = 1;
            }
            letters.put(letter, value);
            value++;

        }
        for (char letter : a.toCharArray()){
            if(letters.get(letter).equals(1)){
                return letter;
            }
        }
        return '_';
    }
}
