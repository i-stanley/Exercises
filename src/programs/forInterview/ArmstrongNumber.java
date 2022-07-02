package programs.forInterview;
import java.util.Scanner;
//Is a number that is equal to the sum of cubes of its digits.
// 0, 1, 153, 370

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int orig_number = number;
        int cubed_number = 0;

        while(number>0){  ///153
            int remainder = number % 10;
            cubed_number += (remainder*remainder*remainder);
            number = number/10;
        }
        if(orig_number == cubed_number){
            System.out.println(orig_number+" is a Armstrong number.");
        } else{
            System.out.println(orig_number+" isn't a Armstrong number.");
        }
    }
}
