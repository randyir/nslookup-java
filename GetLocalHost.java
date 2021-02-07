import java.net.*;

public class GetLocalHost {
    public static void main(String[] args) throws Exception {
        InetAddress host = null;
        host = InetAddress.getLocalHost();
        System.out.println("Nama Komputer : " + host.getHostName());
        System.out.println("Identitas Komputer Lengkap : " + host);
    } 
}
