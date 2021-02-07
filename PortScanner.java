import java.net.*;
import java.util.Scanner;

public class PortScanner {
   public static void main(String []args) throws UnknownHostException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("IP Address target: ");
        String host = input.next(); 
        
        System.out.print("Scan dari port ke: ");
        int portStarted = input.nextInt(); 
        System.out.print("Hingga port ke: ");
        int portEnded = input.nextInt();
        
        input.close();
        
        InetAddress inetAddress = InetAddress.getByName(host);
        System.out.println("IP Address : " + inetAddress);
        String hostName = inetAddress.getHostName();
        System.out.println("Host Name : " + hostName);
        
        for (int port = portStarted; port <= portEnded; port++) {
            try {
            Socket socket = new Socket(hostName, port);
            String text = hostName + " is listening on port " + port;
            System.out.println(text);
            socket.close();
            } catch (Exception e) {
            }
        }
   }
