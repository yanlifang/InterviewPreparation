
https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#axzz7b6fSSe1q

Interface VendingMachine: public API of a vending machine, all high level funtionality 
public interface VendingMachine{
public long selectItemAndGetPrice(Item item);
public void insertCoin(Coin coin);
public List<Coin> refund();
public Bucket<Item, List<Coind>> collectItemAndChange();
public void reset();
}

VendingMachineImpl: a sample implementation of vending machine 

VendingMachineFactory: a factory class to create different kidns of vending machine 

Ite: Enum served by vending machine 

Inventory: java class to represent an inventory, used for creating the case and item inventory inside vending machine

Coin: enum to present coins supported by vending machine 

Bucket: class to hold two objects, pair class 

NotFullPaidException:
NotSufficientChangeException
SoldOutException