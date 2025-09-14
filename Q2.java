import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first name:");
        String firstname =input.next();
        System.out.println("Enter your middle name:");
        String middlename = input.next();
        System.out.println("Enter your last name:");
        String lastlename = input.next();
        System.out.println(lastlename+","+firstname+ middlename.substring(0,1));

    }
}
