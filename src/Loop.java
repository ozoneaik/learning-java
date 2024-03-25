import java.util.Scanner;

class Loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int number = 1;
        while (number <= 12){
            System.out.println("number is "+ number);
            number++;
        }

        for (int i=1;i<=12;i++){
            System.out.println(i + "* 2 = "+ i*2);
        }

        do {
            System.out.print("enter number : ");
            number = sc.nextInt();
            if (number != 12){
                System.out.println("number is not 12");
            }
        }while (number != 12);
        System.out.println("number is 12");
    }
}