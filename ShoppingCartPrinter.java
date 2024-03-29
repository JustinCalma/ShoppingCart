import java.util.Scanner;

public class ShoppingCartPrinter {
	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ItemToPurchase item1 = new ItemToPurchase(); 
      ItemToPurchase item2 = new ItemToPurchase();

      /* Type your code here. */
      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      item1.setName(scnr.nextLine());
      System.out.println("Enter the item price:");
      item1.setPrice(scnr.nextInt());
      System.out.println("Enter the item quantity:");
      item1.setQuantity(scnr.nextInt());
      scnr.nextLine();

      System.out.println("\nItem 2");
      System.out.println("Enter the item name:");
      item2.setName(scnr.nextLine());
      System.out.println("Enter the item price:");
      item2.setPrice(scnr.nextInt());
      System.out.println("Enter the item quantity:");
      item2.setQuantity(scnr.nextInt());

      System.out.println("\nTOTAL COST");

      int item1Total = (item1.getPrice() * item1.getQuantity());
      int item2Total = (item2.getPrice() * item2.getQuantity());

      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ " + "$" + item1.getPrice() + " = " + "$" + (item1.getPrice() * item1.getQuantity())); 
      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ " + "$" +item2.getPrice() + " = " + "$" + (item2.getPrice() * item2.getQuantity()));
      System.out.println("\nTotal: " + "$" + (item1Total + item2Total));
   }
}
