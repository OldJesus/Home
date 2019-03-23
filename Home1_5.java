package homework;

import java.util.Scanner;

public class Home1_5 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три числа a b c");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = (b*b)-4*a*c;
        double x1;
        double x2;

        if(d==0){
            x1 = -1*(b/(2*a));
            System.out.println("В уравнение 1 корень" +" "+ "x1");}
        else if(d>0){
            x1 = ((-1*b)+(double)Math.sqrt(d))/(2*a);
            x2 = ((-1*b)-(double)Math.sqrt(d))/(2*a);
            System.out.println("В уравнении 2 корня"+" "+"x1"+" "+"x2");}
        else{
            System.out.println("В уравнении нет корней");}
        }

    }

