/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Josh Little
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        // For loop to iterate through each character in the encrypted message
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            // Attempt at making the line breaks correct but doesn't really work
            if (Character.isUpperCase(c)) {
                if (c != 'T' || encrypted.charAt(i + 1) == 'T')
                    decrypted += "\n";
                // Add the character if it's uppercase by wrapping back if adding 9 goes past Z
                decrypted += (char) ((encrypted.charAt(i) - 'A' + 9) % 26 + 'A');
            } else if (Character.isLowerCase(c))
                // Add the character if it's lowercase by wrapping back if adding 9 goes past z
                decrypted += (char)((encrypted.charAt(i) - 'a' + 9) % 26 + 'a');
            else
                // Don't change the character if not alphabetical
                decrypted += encrypted.charAt(i);
        }
        // Print decrypted message
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // Interate through the entire encrypted message until hitting a space
        for (int i = 0; i < encrypted.length(); i++) {
            int temp = 0;
            while (encrypted.charAt(i + temp) != ' ') {
                temp++;
            }
            // Substring encrypted part of the message before the space
            decrypted += (char)Integer.parseInt(encrypted.substring(i, i + temp));
            // Increase I by temp so that it goes past the section already decrypted
            i += temp;
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        // Iterate through the message and separate it into chunks of length 8
        for (int i = 0; i < encrypted.length() / 8; i++) {
            // Parse through the 8 number binary codes using parseInt and moving through 1
            // chunk of 8 at a time
            // Tried finding out if parseInt utilized shifting but couldn't find the answer but was
            // unable to use shifting as I didn't know how it was formatted so had to go with the
            // potentially worse but accurate solution.
            decrypted += (char)Integer.parseInt(encrypted.substring(i * 8, (i + 1) * 8), 2);
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        // Iterates through the encrypted message and shifts with a key of 9919
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++)
            decrypted += ((char)(encrypted.charAt(i) - 9919));
        System.out.println(decrypted);
        return decrypted;
    }
}
