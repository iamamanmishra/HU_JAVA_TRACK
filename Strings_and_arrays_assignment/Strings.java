import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First string:");
        String str1 = sc.nextLine();
        System.out.println("Enter Second string:");
        String str2 = sc.nextLine();
        System.out.println("Enter Third string:");
        String str3 = sc.nextLine();
        System.out.println("The given string is interleaving: " + checkInterleaved(str1, str2, str3));
    }
    private static boolean checkInterleaved(String str1, String str2, String CheckInString) {
        int i = 0, j = 0, k = 0;
        if (str1.length() + str2.length() != CheckInString.length()) {
            return false;
        }
        while (k < CheckInString.length()) {
            if (i < str1.length() && str1.charAt(i) == CheckInString.charAt(k)) {
                i++;
            } else if (j < str2.length() && str2.charAt(j) == CheckInString.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        if (!(i == str1.length() && j == str2.length() && k == CheckInString.length())) {
            return false;
        }
        return true;
    }
}