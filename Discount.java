import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        double quantity, price, discount, totalcost, costToPaid;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity and price of purchase");

        quantity = sc.nextDouble();
        price = sc.nextDouble();
        totalcost = quantity * price;
        discount = 0.00; // Initialize the discount

        costToPaid = totalcost - discount;

        if (price > 1000) {
            discount = (quantity * price * 0.1);
            System.out.println("Enter total cost");
            System.out.println("Discount on total cost = " + discount);
            
        }
            else if (price >= 500 && price <= 1000)
           {
            discount = (quantity * price * 0.05);
            System.out.println("Enter total cost");
            System.out.println("Discount on total cost = " + discount);
}
            
         costToPaid = totalcost - discount;
        System.out.println("Cost to paid = " + costToPaid);
        
        sc.close();

}
}