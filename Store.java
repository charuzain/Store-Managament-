import java.util.ArrayList;
import java.util.Scanner;

public class Store {

  public Store() {

    // ArrayList<StoreItem> itemsInStore = new ArrayList<StoreItem>();
    StoreItem item1 = new StoreItem("Pants", 10, 100);
    StoreItem item2 = new StoreItem("Shoes", 40, 400);
    StoreItem item3 = new StoreItem("Shirt", 50, 99);

   ArrayList<StoreItem> itemsInStore = new ArrayList<StoreItem>();
    itemsInStore.add(item1);
    itemsInStore.add(item2);
    itemsInStore.add(item3);

    System.out.println("List of all the items in store is as: ");
    System.out.println("====================================");
    for (int i = 0; i < itemsInStore.size(); i++) {
      System.out.println("--" + (i + 1) + "-" + itemsInStore.get(i).quantity + " " + itemsInStore.get(i).productName
          + " at price " + itemsInStore.get(i).price + " each");
    }
    System.out.println("====================================");
    System.out.println("What would you like to purchase ?");
    System.out.println("Enter : \n 1 for Pants \n 2 for Shoes \n 3 for Shirts ");

    Scanner sc = new Scanner(System.in);
    int productId = sc.nextInt();

    System.out.println("How many " + itemsInStore.get(productId - 1).productName + " would you like to buy ?");

    int orderQuantity = sc.nextInt();

    if (orderQuantity <= itemsInStore.get(productId - 1).quantity) {
      int quantityLeft = itemsInStore.get(productId - 1).quantity - orderQuantity;
      itemsInStore.get(productId - 1).quantity = quantityLeft;
      double totalCost = itemsInStore.get(productId - 1).price * orderQuantity;
      System.out.println("Your total cost is " + totalCost + " $");
    }
    else {
      System.out.println("Not sufficient inventory");

    }
    



    


  }
}