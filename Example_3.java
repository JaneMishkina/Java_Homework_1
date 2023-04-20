// Реализовать простой калькулятор
/**
 * Example_3
 */
package Homework_1;

 import java.util.Scanner;
public class Example_3 {

    public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("Введите первое число a ");
       float a = iScanner.nextFloat();
       System.out.printf("Введите первое число b ");
       float b = iScanner.nextFloat();
       System.out.printf("Введите знак ");
       char c = iScanner.next().charAt(0);
       switch (c) {
        case '+':
            System.out.println(a+b);
            break;
        case '-':
            System.out.println(a-b);
            break;
        case '*':
            System.out.println(a*b);
            break;
        case '/':
            if (b == 0) {
                System.out.println("Делить на 0 нельзя!");
            } else{
            System.out.println(a/b);
            }
            break;
       }
       iScanner.close();
    }
}