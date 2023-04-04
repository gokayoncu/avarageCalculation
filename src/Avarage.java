import java.util.Scanner;
public class Avarage {
    public static void main(String[] args) {

        int num, k = 0, div = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        for (int j = 0; j <= num; j++) {
            if (j % 3 == 0 && j % 4 == 0) {
                k += j;
                div++;
            }
        }
        System.out.println("The sum of its components divisible by 3 and 4 = " + k);
        System.out.println("Since 0 is included in these numbers " + div + " pieces.");
        System.out.println("The average of these numbers=> " + k + " / " + div + " = " + k/div);
    }

}
