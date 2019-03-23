package homework;

public class Home1_2 {
    public static void main(String[] args) {
        int s = 10;
        int a = 15;
        int b = 25;
        s *= 100;
        int x = s % (a*b);
        System.out.println(x + "метров, осталось не занято");
    }
}
