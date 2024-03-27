package OOP;

class MultiMethod{
    public static void main(String[] args) {
        calculation(1,2);
        calculation(1,2,3);
        calculation(1,2,3,4);
    }

    static void calculation(int a,int b){
        System.out.println(a+b);
    }
    static void calculation(int a,int b,int c){
        System.out.println(a+b+c);
    }

    static void calculation(int...num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        System.out.println(sum);
    }

}