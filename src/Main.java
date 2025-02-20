import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        exe1();
        exe2();
        exe3();
    }
    public static void exe1(){
        System.out.println("задание 1");
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("enter " + (i+1) + " array`s element");
            int input = sc.nextInt();
            arr[i] = input;
        }
        int lastpositive = 0;
        for (int i =0; i < 5; i++){
            if(arr[i] >0){
                lastpositive = i;
            }}
            int sum = 0;
            for (int i = 0; i < lastpositive; i++)
            {
                sum = sum + arr[i];
            }
            System.out.println("sum of elements before last positive" + sum);

}

    /*Выведите все числа от 1 до 20 кроме
    чисел от 2 до 4 включительно. Предусмотреть
    между числами знак табуляции.*/
    public static void exe2(){
        System.out.println("заданае 2");
        for(int i = 0; i < 20; i++){
        if(i!= 2 && i!=3 && i!=4){
            System.out.printf(i+"    ");
        }
        }
        System.out.println(" ");
    }
        /*Выведите на экран числа в
        диапазоне от 110 до 137 включительно
        с помощью функций while и break в столбик.*/
    public static void exe3(){
        System.out.println("задание 334" +
                "");
        int i = 109;
        while (true){
            if(i < 137){
                i = i + 1;
                System.out.println(i);
            }else {break;}
        }
    }
}