package com.denys;

public class Decoder {

    public static String vowelsToLetters(String input) {
        String vowels = "12345";
        String replacement = "aeiou";
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            int index = vowels.indexOf(ch);
            if (index != -1) {
                result.append(replacement.charAt(index));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String lettersToPrevious(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char decodedChar = ch == 'a' ? 'z' : (char) (ch - 1);
                result.append(decodedChar);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String decode(String encodedMessage) {
        if (encodedMessage.matches(".*[a-zA-Z].*\\d.*")) {
            return vowelsToLetters(encodedMessage);
        } else if (encodedMessage.matches("\\D*")) {
            return lettersToPrevious(encodedMessage);
        } else {
            return encodedMessage;
        }
    }

    public static void main(String[] args) {
        String encodedMessage = "t2st3ng uftujoh t2ST3Ng 1237832548 UftUjOH";
        String[] encodedWords = encodedMessage.split("\\s+");
        StringBuilder decodedMessage = new StringBuilder();

        for (String word : encodedWords) {
            String decodedWord = decode(word);
            decodedMessage.append(decodedWord).append(" ");
        }

        System.out.println("Decoded Message: " + decodedMessage.toString().trim());
    }
}