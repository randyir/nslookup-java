import java.net.*;
import java.util.Scanner;

public class IPtoLocalHost {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input IP Address lokal ataupun Komputer di Jaringan");
        System.out.print("IP Address : ");
        String host = input.next();
        input.close();
        
        InetAddress address = null;
        try {
            address = InetAddress.getByName(host);
        } catch (Exception e){
            System.out.println("invalid IP");
            System.exit(0);
        }
        System.out.println(address.getHostName());
    }
}
