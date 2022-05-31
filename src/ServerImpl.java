import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject {

    // Start rmi-registry in out/production/Exercise-5.1
    public ServerImpl() throws RemoteException {}


    public static void main(String[] args) {

        try {
            ServerImpl Server = new ServerImpl();
            Naming.rebind("Server", Server);
            System.out.println("Server started");

            ShoppingBasketImpl shoppingBasketImpl1 = new ShoppingBasketImpl();
            Naming.rebind("Basket1", shoppingBasketImpl1);

            ShoppingBasketImpl shoppingBasketImpl2 = new ShoppingBasketImpl();
            Naming.rebind("Basket2", shoppingBasketImpl1);


        } catch (Exception e) {
            System.out.println("ServerImpl: " + e.getMessage());
            e.printStackTrace();
        }
    }


}
