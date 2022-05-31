import java.rmi.RemoteException;

public interface ShoppingItem {

    public String getName() throws RemoteException;

    public int getPrice() throws RemoteException;

    public int getQuantity() throws RemoteException;

    public void setQuantity(int quantity) throws RemoteException;

}
