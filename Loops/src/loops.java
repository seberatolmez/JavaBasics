public class Main {
    public static void main(String[] args) {
        // for
        for (int i = 0 ; i < 10 ; i++) { // i++ = i+1 i
            System.out.println(i);
        }
        System.out.println("Döngü bitti");


        for (int i = 0 ; i < 11 ; i= i+2) {

            System.out.println(i);
        }
        System.out.println("Loops finished");

        //while
        int i = 1;    //infinitive loops
        while (i<10){
            System.out.println(i);
            i++;

        }
        // do while döngüsü
        int j = 1;
        do {
            System.out.println(j);
            j+=2;

        }while (j<10);
        System.out.println("Do-While Döngüsü bitti");



    }


    }
