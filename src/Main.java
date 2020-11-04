import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("bir deger giriniz ?");
        int n = scanner.nextInt();
        //String test = scanner.nextLine();

        String message =HackerTest.validated(n);
        System.out.println(message);

        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("IP adresini giriniz:");
//        String ip = scanner.nextLine();
//
//        //String message = Ip4Validator.validate(ip);
//        String message =ipValidator.validate(ip);
//        System.out.println(message);
//
//        scanner.close();



        //CustomerManager customerManager = new CustomerManager();
        //customerManager.Add();

//        Toplammethod toplammethod = new Toplammethod();
//        toplammethod.topla3();



    }
}
