public class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    Product()
    {
        this.price=price;
        this.productName=productName;
        this.productId=productId;
        this.quantity=quantity;
    }

    int getProductId(){
        return this.productId;
    }
    String getProductName(){
        return this.productName;
    }
    double getPrice(){
        return this.price;
    }
    int getQuantity(){
        return this.quantity;
    }

    void setProductId(int productId){
        this.productId=productId;
    }

    void setProductName(String productName){
        this.productName=productName;
    }
    void setPrice(double price){
        if (price>0){
            this.price=price;
        }else{
            System.out.println("Price must be greater than 0  ");
        }
    }
    void setQuantity(int quantity){
        if(quantity>0){
            this.quantity=quantity;
        }else{
            System.out.println("Quantity should be positive");
        }
    }

    public void displayDetails(){
        System.out.println(" ");
        System.out.println("-Product information-");
        System.out.println(" ");
        System.out.println("Product Name : "+ productName);
        System.out.println("Product Price : "+ price);
        System.out.println("Product Quantity : "+ quantity);

    }
    public void calculateTotalValue(){
        System.out.println(" ");
       System.out.println("Total cost : LKR"+price*quantity+"/=");
    }

}
