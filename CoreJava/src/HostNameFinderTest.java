public class HostNameFinderTest {

    public static void main(String[] args) {

        /* get the host name for local machine */
        HostNameFinder.getMyHostName();

        /* get the IP for local machine */
        HostNameFinder.getMyIPAddress();

        /* get the host name for localhost */
        HostNameFinder.getHostNameByAdress("localhost");

        /* get the IP for localhost */
        HostNameFinder.getIPByAddress("localhost");

        /* get the host name for www.google.com */
        HostNameFinder.getHostNameByAdress("www.google.com");

        /* get the IP for www.google.com */
        HostNameFinder.getIPByAddress("www.google.com");

    }

}