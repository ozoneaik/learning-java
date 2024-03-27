package OOP;

class Array {
    public static void main(String[] args) {

        // แบบกำหนดขนาดเอาไว้
        int[] A = new int[4];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        System.out.println("length of A => " + A.length);

        // แบบกำหนดสามชิก
        int[] Arr = {1, 2, 3, 4};

        // loop ไว้ใช้วน Arr
        for (int j : Arr) {
            System.out.println(j);
        }


        //array 2 มิติ
        String[][] Products = {
                {"เก้าอี้","table","fire"},
                {"keyboard","mouse","CPU"}
        };
        for (int i=0;i< Products.length;i++){
            System.out.print("ชุด Product ที่ : " +(i) + " : ");
            for(int j=0; j< Products[i].length ;j++){
                System.out.print(Products[i][j] + " ");
            }
            System.out.println();
        }

    }
}