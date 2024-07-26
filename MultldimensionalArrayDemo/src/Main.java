public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Bingöl";
        sehirler[0][1] = "Elazığ";
        sehirler[0][2] = "Diyarbakır";
        sehirler[1][0] = "İzmir";
        sehirler[1][1] = "Aydın";
        sehirler[1][2] = "Denizli";
        sehirler[2][0] = "İstanbul";
        sehirler[2][1] = "Bursa";
        sehirler[2][2] = "Bilecik";

        for (int i = 0; i<=2;i++ ) {
            System.out.println("-------------------");
            for (int j = 0; j<=2;j++ ) {
                System.out.println(sehirler[i][j]);
            }

        }


    }
}