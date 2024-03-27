package OOP;
class Error{
    public static void main(String[] args) {
        try {
            System.out.println("server loading...");
            int a = 1/0;
            System.out.println("server connected😊😊😊");
        }catch (Exception e){
            System.out.println("server error!!!!");
        }finally {
            System.out.println("server closed");
        }
        System.out.println("--------------------------------------------");

        Throw();
    }

    static void Throw(){
        int a = 12;
        try {
            if (a < 200){
                throw new Exception("number over load");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


}