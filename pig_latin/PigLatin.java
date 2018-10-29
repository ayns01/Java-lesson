package pig_latin;

import java.util.Scanner;

public class PigLatin {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        final String consonants      = "bcdfghjklmnpqrstvwxyz";
        final String closest_vowel   = "aaeeiiiiioooouuuuuuuu";
        final String next_consonants = "cdfghjklmnpqrstvwxyzz";

        String vowels = "aeiou";
        String converted = "";

        System.out.println("Enter word that you like! We are gonna transelate in Pig Latin words.");
        final String userInput = scan.nextLine();
        scan.close();

        for (char ch : userInput.toCharArray()) {
            String c = String.valueOf(ch);
            if (vowels.indexOf(c) != -1) {
                converted += c;
            }else {
                converted += c;
                int index = consonants.indexOf(c);
                converted += closest_vowel.charAt(index);
                converted += next_consonants.charAt(index);
            }
        }

        System.out.println(converted);

    }
}
