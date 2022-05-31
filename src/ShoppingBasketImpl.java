import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.HashSet;

// On ShoppingBasket & ShoppingItem only work with the Interface!
public class ShoppingBasketImpl extends UnicastRemoteObject implements ShoppingBasket {

    // Make items remote objects
    private String name;
    private HashSet<ShoppingItemImpl> items;

    public ShoppingBasketImpl(String name, HashSet<ShoppingItemImpl> items) throws RemoteException {
        super();
        this.name = name;
        this.items = items;
        items = new HashSet<ShoppingItemImpl>();
    }

    public ShoppingBasketImpl() throws RemoteException {
        super();
        items = new HashSet<ShoppingItemImpl>();
    }

    @Override
    public ShoppingItemImpl searchItem(String basketName, String itemName) throws RemoteException {
        for (ShoppingItemImpl item : items) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public HashSet<ShoppingItem> getItemsFromBasket(String basketName) throws RemoteException {
        return null;
        //return items;
    }

    @Override
    public String getShoppingBasketName() throws RemoteException {
        return name;
    }

    @Override
    public void addItemToBasket(String name, int price, int quantity) throws RemoteException {
        items.add(new ShoppingItemImpl(name, price, quantity));
    }

    public void print() {
        System.out.println(items);
    }

}
