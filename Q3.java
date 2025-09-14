import java.util.Scanner;

public class Q3
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value=");
        Double cent = input.nextDouble();
        Double inch = (cent/2.54);
        System.out.println("inches:"+inch);
        Double feet = (inch/12);
        System.out.println("Feets:"+feet);
    }

}
