import java.util.Scanner;
public class ProductApp {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Product myProd = new Product();

        System.out.print("Enter Product ID : ");
        int pId = scnr.nextInt();
        myProd.setProductId(pId);

        System.out.print("Enter Product Name : ");
        String pName = scnr.nextLine();
        String pName1 = scnr.nextLine();
        myProd.setProductName(pName1);

        System.out.print("Enter Product Quantity: ");
        int pQuan = scnr.nextInt();
        myProd.setQuantity(pQuan);

        System.out.print("Enter Product Price: ");
        int Price = scnr.nextInt();
        myProd.setPrice(Price);

        myProd.displayDetails();

        myProd.calculateTotalValue();
    }
}
