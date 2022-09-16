import java.util.Date;

public class History extends StoreItem {
  Date puchaseTime;

  public History(String productName, int quantity, double price, Date purchaseTime) {
    super(productName, quantity, price);
    this.puchaseTime = purchaseTime;
  }
  
}
