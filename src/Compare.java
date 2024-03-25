import java.util.Scanner;

class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("pls enter a number : ");
        a = sc.nextInt();
        System.out.print("pls enter b number : ");
        b = sc.nextInt();

        boolean c = (a == b);

        System.out.println("ตัวดำเนินการทางเครื่องหมาย");
        System.out.println("a == b ? => " + (a == b));
        System.out.println("a > b ? => " + (a > b));
        System.out.println("a < b ? => " + (a < b));
        System.out.println("a >= b ? => " + (a >= b));
        System.out.println("a <= b ? => " + (a <= b));
        System.out.println("a != b ? => " + (a != b));
        System.out.println("---------------------------------------------------");

        //ตัวดำเนินการทาง ตรรกศาสตร์
        int number1 = 12;
        int number2 = 23;
        System.out.println("number1=12 AND number2=23 => "+ ((number1 == 12) && number2 == 23));
        System.out.println("number1=12 เป็นจริง AND number2=23 เป็นเท็จ => "+ ((number1 == 12) && number2 == 22));
        System.out.println("number1 เป็นเท็จ OR number2 เป็นเท็จ => "+ ((number1 == 2) || number2 == 2));
        System.out.println("---------------------------------------------------");


        //การบวกและลบค่า โดยใช้ ++ และ --
        int A = 1;
        int B = 1;
        System.out.println("ก่อน A++ => " + (A++));
        System.out.println("หลัง A++ => " + A);
        System.out.println("ก่อน A-- => " + (A--));
        System.out.println("หลัง A-- => " + A);

        System.out.println("ก่อน ++B => " + (++B));
        System.out.println("หลัง ++B => " + B);
        System.out.println("ก่อน --B => " + (--B));
        System.out.println("หลัง --B => " + B);

    }
}