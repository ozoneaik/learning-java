import java.util.Scanner;

class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("pls enter money : ");
        int money = sc.nextInt();
        int amout = 0;

        if (money % 2 != 0) {
            System.out.println("กรุณาป้อนเงินมากกว่า 20 และห้ามมีเศษ");
        }else{
            amout = money/1000;
            System.out.println("bank 1,000 => " + amout);
            money = money - (amout*1000);

            amout = money/500;
            System.out.println("bank 500 => " + amout);
            money = money-(amout*500);

            amout = money/100;
            System.out.println("bank 100 => " + amout);
            money = money-(amout*100);

            amout = money/50;
            System.out.println("bank 50 => " + amout);
            money = money-(amout*50);

            amout = money/20;
            System.out.println("bank 20 => " + amout);
            money = money-(amout*20);

        }
    }
}