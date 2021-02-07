import java.net.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String host;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input nama Host: ");
        host = input.next();
        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println("IP address: " + address.toString());
        } catch (UnknownHostException e) {
            System.out.println("Tidak bisa mendapatlan " + host + "atau jaringan terputus");
        }
        input.close();
    }
}
