package OOP;

class Method {
    public static void main(String[] args) {
        showName();
        System.out.println("a+b = " + calculate(12, 12));
        int[] Ar = {12, 23, 43};
        int[] Ar1;
        getArr(Ar);
        copyArr(Ar);
    }

    //create method
    static void showName() {
        System.out.println("hello Phuwadech");
    }

    static int calculate(int a, int b) {
        return a + b;
    }

    // method get Array
    static void getArr(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    //copy array
    static int[] copyArr(int[] a) {
        int [] newArr = new int[a.length];
        //System.arraycopy(a, 0, newArr, 0, a.length); ย่อโค้ด
        for (int i =0;i<a.length;i++){
            newArr[i] = a[i];
        }
        return newArr;
    }

}