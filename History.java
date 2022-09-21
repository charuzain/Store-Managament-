
public class History extends StoreItem {
  String puchaseTime;

  public History(String productName, int quantity, double price, String purchaseTime) {
    super(productName, quantity, price);
    this.puchaseTime = purchaseTime;
  }
  
}
