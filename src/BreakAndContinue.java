class BreakAndContinue {
    public static void main(String[] args) {
        for (int i=0;i< 12;i++){
            if (i == 4) continue;
            if (i == 6) break;
            System.out.println(i);
        }
    }
}