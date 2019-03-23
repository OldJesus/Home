package homework;

import java.util.Scanner;

public class Home1_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите трёхзначное число");

        int three = scan.nextInt();
        int a = three%10;
        int b = (three/10)%10;
        int c = (three/100)%10;
        if (a>b&&a>c){
            System.out.println("Наибольшая цифра "+ a);
        } else if (b>a&&b>c){
            System.out.println("Наибольшая цифра "+b);
        } else if (c>a&&c>b){
            System.out.println("Наибольшая цифра "+c);
        }
    }
}
