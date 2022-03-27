import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public ArrayList<Integer> getTenRolls() {

        ArrayList<Integer> randomList = new ArrayList<Integer>();
        Random random = new Random();
        
        for (int i = 0; i < 11; i ++) {
            int randomNum = random.nextInt(20); 
            randomList.add(randomNum);
        }

        return randomList;

    }

    public String getRandomLetter() {

        // 1. Create an array within the method that contains all 26 letters of the alphabet 
        // (this array must have 26 values).
        // 2. Generate a random index between 0-25, and use it to pull a random letter out of the array.
        // 3. Return the random letter.

        Random random = new Random();
        String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] alphabet = new String[26];

        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }

        return alphabet[random.nextInt(26)];

    }

    // Write a method that uses the previous method to create a random string of eight characters, 
    // and return that string.
    public String getRandomPassword() {
        String password = "";

        for (int i = 1; i < 9; i++) {
            
            password =  password + getRandomLetter();
            
        }

        return password;

    }

    // Write a method that takes an int length as an argument and creates an array of random eight character words. 
    // The array should be the length passed in as an int.

    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> newPasswordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            newPasswordSet.add(getRandomPassword());

        }

        return newPasswordSet;

    }

}