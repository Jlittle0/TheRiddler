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
        for (int i = 0; i < encrypted.length(); i++) {
            char temp = encrypted.charAt(i);
            if (temp >= 113 || temp > 81 && temp < 97) {
                decrypted += (char)(temp - 17);
            } else if (temp < 65) {
                decrypted += temp;
            } else {
                decrypted += (char)(temp + 9);
            }
        }
        for (int i = 0; i < decrypted.length(); i++) {
            char temp = decrypted.charAt(i);
            if (temp < 91 && temp > 64 && i > 1) {
                System.out.println();
                System.out.print(temp);
            } else
                System.out.print(temp);
        }
        // TODO: Complete the decryptOne() function.

        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            int temp = 0;
            while (encrypted.charAt(i + temp) != ' ') {
                temp++;
            }
            decrypted += (char)Integer.parseInt(encrypted.substring(i, i + temp));
            i += temp;
        }
        System.out.println(decrypted);
        // TODO: Complete the decryptTwo() function.

        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        for (int i = 0; i < encrypted.length() / 8; i++) {
            decrypted += (char)Integer.parseInt(encrypted.substring(i * 8, (i + 1) * 8), 2);
        }
        // TODO: Complete the decryptThree() function.
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        for (int i = 0; i < encrypted.length(); i++)
        {

        }
        String decrypted = "";
        encrypted.codePoints().mapToObj(Integer::toHexString).forEach(System.out::println);

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
