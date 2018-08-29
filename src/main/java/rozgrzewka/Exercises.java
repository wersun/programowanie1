package rozgrzewka;

public class Exercises {
    public static void main(String[] args) {


        for (int i=10; i == 0 ; i--) {
            System.out.println("sratatat");
        }

        int x = 1;
        int y = 10;
        Math math = new Math();

        String word = "civic";
        String nowyString = word.substring(1, word.length() - 1);
        boolean isEq = word.charAt(0)==word.charAt(word.length()-1);

        math.dodaj(x,y);

        int[] tab = {1, 4, 5, 123};
        Exercises ex = new Exercises();
        ex.sort(tab);
    }


    int[] sort(int[] tab){
        return null;
    }


}
