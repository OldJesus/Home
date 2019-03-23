package homework;

import java.util.Scanner;

public class Home1_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину, длину, высоту параллелепипеда");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        int s = 2*(a*b+a*h+b*h);
        System.out.println("площадь параллелепипеда будет равна" +s);

        if(b>h)
        {
            System.out.println("Ширина больше высоты");
        }
        else if(b<h)
            {
                System.out.println("Ширина меньше высоты");
            }
            else
             {
                System.out.println("Ширина равна высоте");
            }
        }
}


