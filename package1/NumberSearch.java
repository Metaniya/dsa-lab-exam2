package package1;

import javax.print.attribute.standard.MediaSize;
import java.util.Arrays;
import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter sequence of numbers:" );
        String input;
        input = scanner.nextLine();
        String[] numbers = input.split(",");
        int[]array=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            array[i] = Integer.parseInt(numbers[i].trim());

        }
        System.out.println("enter the number to be searched");
         int input2;
        input2=scanner.nextInt();
       int Numtosearch;
        Numtosearch = input2;
        int count = 0;

    }
}

