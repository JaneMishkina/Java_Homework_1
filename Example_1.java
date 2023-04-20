/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
package Homework_1;

import java.util.Scanner;
public class Example_1 {

    public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.println("Введите число n: ");
       int n = iScanner.nextInt();
       int result = 0;
       int multiplication = 1;
       for (int i = 1; i <= n; i++) {
        result +=i;
       }
       for (int i = 1; i <= n; i++) {
        multiplication *=i;
       }
       System.out.print("Сумма чисел от 1 до n: ");
       System.out.println(result);
       System.out.print("Произведение чисел от 1 до n: ");
       System.out.println(multiplication);
       iScanner.close();
    }
}