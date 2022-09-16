class StoreItem {
  String productName;
  int quantity;
  double price;

  StoreItem(String productName, int quantity, double price) {
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
  }

  void setName(String productName) {
    this.productName = productName;
  }
  
  String getName() {
    return productName;
  }

    void setQuantity(int quantity) {
     this.quantity = quantity;
  }
  
  int getQuantity() {
    return quantity;
  }

  void setPrice(double price) {
     this.price = price;
  }
  
  double getPrice() {
    return price;
  }
}