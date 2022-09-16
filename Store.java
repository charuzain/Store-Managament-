import java.util.ArrayList;

public class Store {

  public Store() {
    ArrayList<StoreItem> itemsInStore = new ArrayList<StoreItem>();
    StoreItem item1 = new StoreItem("Pants", 10, 100);
    StoreItem item2 = new StoreItem("Shoes", 40, 400);
    StoreItem item3 = new StoreItem("Shirt", 50, 99);

    itemsInStore.add(item1);
    itemsInStore.add(item2);
    itemsInStore.add(item3);
    System.out.println("List of all the items in store is as: ");
     for(int i = 0 ; i <itemsInStore.size();i++){
            System.out.println("--" +(i + 1)+ "-" + itemsInStore.get(i).quantity +  " " + itemsInStore.get(i).productName + " at price " + itemsInStore.get(i).price + " each");
        }

  }
}