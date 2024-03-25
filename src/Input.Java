import java.util.Scanner; //import scanner for typing input

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("pls enter your name : ");
        String name = sc.nextLine();
        System.out.println("your name is : "+name);

        System.out.print("pls enter yout name (use next scanner) : ");
        String nameNext = sc.next();
        System.out.println("your name is : "+ nameNext);

        System.out.print("pls enter your age : ");
        int age = sc.nextInt();
        System.out.print("your age is : "+age);
    }
}