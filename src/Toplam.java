class Toplammethod {

    int a = 5, b = 4;
    double c = 5.5, d = 4.6;
    int sayi = topla(a, b);
    String mesaj = "";


    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("guncellendi");
    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static double topla2(double... sayilar) {
        double toplam = 0;
        for (double sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public void topla3() {
        double sayi2 = topla2(c, d, a, b);

        System.out.println(" ");
        System.out.println("topla2 fonk.. hesapladi, Class calisti;");
        System.out.println("Toplama islemi gerceklesti : " + sayi2);
    }

}
