import java.util.Scanner;

public class Odd_Numbers_for_ODD_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        if (a % 2 == 0)
            a = a - 1;

        int count = (a + 1) / 2;
        int num = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(num + " ");
            num += 2;
        }
    }
}
