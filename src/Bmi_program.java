import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.lang.Math;

class Bmi_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("pls enter weight(kg) : ");
        double weight = sc.nextDouble();
        System.out.print("Pls enter height(m) : ");
        double height = sc.nextDouble();

        double bmi = weight / (Math.pow(height, 2));
        System.out.print("BMI = " + bmi);

        if (bmi > 30) {
            System.out.println("อ้วนมาก / โรคอ้วนระดับ 3");
        } else if ((bmi >= 25) && (bmi <= 29.90)) {
            System.out.println("อ้วน / โรคอ้วนระดับ 2");
        } else if ((bmi >= 23) && (bmi <= 24.90)) {
            System.out.println("ท้วม / โรคอ้วนระดับ 1");
        } else if ((bmi >= 18.50) && (bmi <= 22.90)) {
            System.out.println("ปกติ (สุขภาพดี)");
        } else {
            System.out.println("น้ำหนักน้อย / ผอม");
        }
    }
}