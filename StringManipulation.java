import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Concatenation and Substring (String)
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        String concatenatedString = firstString.concat(secondString);
        System.out.println("Concatenated string: " + concatenatedString);

        System.out.println("Enter the starting index for substring:");
        int startIndex = scanner.nextInt();

        System.out.println("Enter the ending index for substring:");
        int endIndex = scanner.nextInt();

        if (startIndex >= 0 && endIndex <= concatenatedString.length() && startIndex <= endIndex) {
            String substring = concatenatedString.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("Invalid indices for substring.");
        }

        // Reverse and Replace (StringBuffer)
        StringBuffer stringBuffer = new StringBuffer("playing cricket");

        // Reverse the content of StringBuffer
        stringBuffer.reverse();
        System.out.println("Reversed content: " + stringBuffer);

        // Replace a specific substring within StringBuffer
        stringBuffer.replace(6, 11, "raju");
        System.out.println("Modified content: " + stringBuffer);

        // String Comparison without using equals()
        String str1 = "playing";
        String str2 = "cricket";
        boolean isEqual = compareStrings(str1, str2);
        System.out.println("Are the strings equal? " + isEqual);

        // StringBuffer Append and Insert
        StringBuffer sb1 = new StringBuffer("I am ");
        StringBuffer sb2 = new StringBuffer("playing cricket");

        // Append content of sb2 to sb1
        sb1.append(sb2);
        System.out.println("Appended StringBuffer: " + sb1);

        // Insert a new substring into sb1 at index 5
        sb1.insert(5, "not ");
        System.out.println("Inserted StringBuffer: " + sb1);

        // Palindrome Check
        System.out.println("Enter a string to check for palindrome:");
        String inputString = scanner.next();
        palindromeCheck(inputString);

        scanner.close();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void palindromeCheck(String str) {
        boolean isPalindromeString = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println("Using String class: Input is a palindrome? " + isPalindromeString);
    }
}