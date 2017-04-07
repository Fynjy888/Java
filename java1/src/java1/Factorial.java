package java1;

public class Factorial { //факториал числа при помощи рекурсии
    public static int recursion(int n) {
        if (n == 1) {    // условие выхода из рекурсии
            return 1;
        }
        return recursion(n - 1) * n;   // шаг рекурсии или рекурсивное условие
    }
    public static void main(String[] args) {
        int n = 5; //число от которого берем факториал
    	System.out.println(n + "! = " + recursion(n)); // вызов рекурсивной функции
    }
}