package rozgrzewka;

public class Sort {

    int[] bubbleSort(int[] input, boolean isAscending) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length-i; j++) {
                if (isAscending) {
                    if(input[j-1]>input[j]){
                        swap(input, j-1, j);
                    }
                }else{
                    if(input[j-1]<input[j]){
                        swap(input, j-1, j);
                    }
                }
            }
        }
        return input;
    }

    void swap(int[] tab, int index1, int index2) {
        int temp = tab[index1];
        tab[index1] = tab[index2];//1 zamiana
        tab[index2] = temp;//2 zamiana
    }

    boolean isPalindrome(String word){
        //sprawdzamy rekurencyjnie czy słowo jest palindromem
        // civic
        return true;
    }

}
