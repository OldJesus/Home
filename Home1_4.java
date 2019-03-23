package homework;

import java.util.Scanner;

public class Home1_4 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Введите два не целых числа n и m");
       double n = scan.nextDouble();
       double m = scan.nextDouble();
       int a = 10;
       double x = Math.abs(a-n);
       double z = Math.abs(a-m);

       if (x>z){
           System.out.println(+m+ "ближек " +a);
       }
       else if (z>x){
           System.out.println( +n+ "ближе к" +a);
       }
       else if (z==x){
           System.out.println("Числа"+n+" и "+m+"равны");
       }
    }
}
