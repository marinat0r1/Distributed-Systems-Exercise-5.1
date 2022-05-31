import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashSet;

public interface ShoppingBasket extends Remote {


    ShoppingItem searchItem(String basketName, String itemName) throws RemoteException;

    public void addItemToBasket(String name, int price, int quantity) throws RemoteException;

    public HashSet<ShoppingItem> getItemsFromBasket(String basketName) throws RemoteException;

    public String getShoppingBasketName() throws RemoteException;

    public void print() throws RemoteException;

}
