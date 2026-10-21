import java.util.Scanner;

public class Exercise1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        boolean isEqual = str1.equals(str2);
        System.out.println("The two given strings are equal: " + isEqual);
        
        char first1 = str1.charAt(0);
        char first2 = str2.charAt(0);
        System.out.println("First character of first string: " + first1);
        System.out.println("First character of second string: " + first2);
        System.out.println("First characters are equal: " + (first1 == first2));
        
        scanner.close();
    }
}
