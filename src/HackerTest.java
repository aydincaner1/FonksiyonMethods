public class HackerTest {

    public static String validated(int degree){

        if (degree>20)
            return "Gecersiz sayi !! ";

        if (degree%2==1){
            System.out.println("weird");
        }
        else if (1<degree && degree<6 || degree>20){
            System.out.println("not weird");
        }
        else if(5<degree && degree<21){
            System.out.println("weird");
        }
        String mesaj = "Girilen sayi : " + degree;
        return mesaj;
    }
}
