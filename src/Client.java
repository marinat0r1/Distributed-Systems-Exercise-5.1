import java.rmi.Naming;
import java.util.Date;

public class Client {

    public static void main(String[] args) {

        if (args.length != 1) {
            throw new IllegalArgumentException("Syntax: DateClient <hostname>");
        }

        try {
            Server server = (Server) Naming.lookup("rmi://" + args[0] + "/Server");
            Date when = server.getDate();
            System.out.println("Datum: " + when);
        } catch (Exception e) {
            System.out.println("Client: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
