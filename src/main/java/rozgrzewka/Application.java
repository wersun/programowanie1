package rozgrzewka;

import java.util.Arrays;

import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {


        int[] tab = new int[]{1, 5, 3, 76, -81, 23, 54};
        Arrays.sort(tab);
        printArray(tab);
        int[] reverseArray = reverseArray(tab);
        printArray(reverseArray);
        int tabMin = getMin(tab);

        Sort sort = new Sort();
        sort.bubbleSort(tab, false);
    }


    static int getMin(int[] input) {
        int min = input[0];
        for (int number : input) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    static void printArray(int[] input) {
        IntStream.of(input).forEach((number) -> System.out.print(number + " "));
        System.out.println();
//        IntStream.of(input).forEach(System.out::println);  referencja do metody
    }

    static int[] reverseArray(int[] input) {
        int[] result=new int[input.length];
        for(int x= input.length-1;x>=0;x--){
            result[input.length-x-1]=input[x];
        }
        return result;
    }




}
