import java.util.Scanner;

class EvenAndOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("pls enter number : ");
        int num = sc.nextInt();
        if (num%2 != 0){
            System.out.println("number is Odd");
        }else{
            System.out.println("number is Even");
        }
    }
}