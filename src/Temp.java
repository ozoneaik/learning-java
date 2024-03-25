import java.util.Scanner;

class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter temp (c) : ");
        double temp = sc.nextDouble();

        double f = (temp * 9 / 5) + 32;

        System.out.println("f temp = "+ f);
    }
}