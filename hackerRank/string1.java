import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);          
        String A = scan.next();
        String B = scan.next();         
        scan.close();                                                       //* Finish to scan
        System.out.println(A.length() + B.length());                        //* Total letters
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");              //* A is greater than B
        System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));    //* Both words are concatenated
    }
    private static String capFirstLetter(String str) {                      //* Capitalize the first letter
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }
}
