import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter odd length word :");
        String  odd=input.next();
        int length = odd.length();
        System.out.println(odd.substring(length/2,(length/2)+1));
    }
}