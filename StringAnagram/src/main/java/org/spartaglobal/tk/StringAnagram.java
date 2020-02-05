package org.spartaglobal.tk;

public class StringAnagram {
    public boolean isAnagram(String firstWord, String secondWord) {
        int counter = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            char first = firstWord.toLowerCase().charAt(i);
            for (int j = 0; j < secondWord.length(); j++) {
                char second = secondWord.toLowerCase().charAt(j);
                if (first == second) {
                    counter++;
                    break;
                }
            }
        }
        if (counter == firstWord.length()) {
            return true;
        }
        return false;
    }
}


