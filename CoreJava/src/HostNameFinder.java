import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameFinder {

    public static String getMyHostName() {
        String hostname = null;
        try {
            InetAddress addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
            System.out.println("Host Name = " + hostname);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return hostname;
    }

    public static String getMyIPAddress() {
        String ipAddress = null;
        try {
            InetAddress addr = InetAddress.getLocalHost();
            String ipAddr = addr.getHostAddress();
            System.out.println("IP Address = " + ipAddr.toString());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return ipAddress;
    }

    public static String getIPByAddress(String address) {
        String ipAddress = null;
        try {
            InetAddress addr = InetAddress.getByName(address);
            String ipAddr = addr.getHostAddress();
            System.out.println("IP Address = " + ipAddr.toString());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return ipAddress;
    }

    public static String getHostNameByAdress(String address) {
        String hostname = null;
        try {
            InetAddress addr = InetAddress.getByName(address);
            hostname = addr.getHostName();
            System.out.println("Host Name = " + hostname);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return hostname;
    }

}
