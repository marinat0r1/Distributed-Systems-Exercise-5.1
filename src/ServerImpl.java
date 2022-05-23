import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ServerImpl extends UnicastRemoteObject implements Server {

    public ServerImpl() throws RemoteException {}

    @Override
    public Date getDate() throws RemoteException {
        System.out.println("Call of getDate()");
        return new Date();
    }

    public static void main(String[] args) {
        try {
            ServerImpl Server = new ServerImpl();
            Naming.rebind("Server", Server);
            System.out.println("Server started");
        } catch (Exception e) {
            System.out.println("ServerImpl: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
