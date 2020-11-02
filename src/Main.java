import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //CustomerManager customerManager = new CustomerManager();
        //customerManager.Add();

        Scanner scanner = new Scanner(System.in);

        System.out.println("IP adresini giriniz:");
        String ip = scanner.nextLine();

        //String message = Ip4Validator.validate(ip);
        String message =ipValidator.validate(ip);
        System.out.println(message);

        scanner.close();

        //Toplammethod toplammethod = new Toplammethod();
        //toplammethod.topla3();



    }
}
