import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Client {

    public static void main(String[] args) {

        if (args.length != 1) {
            throw new IllegalArgumentException("Syntax: DateClient <hostname>");
        }

        try {
            //ServerImpl server = (ServerImpl) Naming.lookup("Server");

            ShoppingBasket shoppingBasket1 = (ShoppingBasket) Naming.lookup("Basket1");

            shoppingBasket1.addItemToBasket("freezer", 550, 30);
            shoppingBasket1.print();

        } catch (Exception e) {
            System.out.println("Client: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
