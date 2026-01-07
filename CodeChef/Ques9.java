// Write a program to print the length of each word of the sentence given below as well as the length of the whole sentence.

// Note - Make sure to give a space after every word or "-" when printing



public class Ques9 {
    public static void main(String[] args) {
        String sentence = "Coding on CodeChef";

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Print length of each word
        for (String word : words) {
            System.out.println(word + " - " + word.length());
        }

        // Print full sentence length
        System.out.println(sentence + " - " + sentence.length());
    }
}


