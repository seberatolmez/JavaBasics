public class Main {
    public static void main(String[] args) {

        int[] sayıList = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int aranacak = 5;

        boolean varMi = false;

        for (int sayı:sayıList){
            if (sayı==aranacak){

            varMi = true;
            break;

            }
        }
        if (varMi){
            System.out.println("sayı mevcuttur");
        }else{
            System.out.println("sayı mevcut değildir");
        }
    }

}