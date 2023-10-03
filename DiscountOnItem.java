import java.util.Scanner;
class DiscountOnItem
{
public static void main(String[] args)
{
int quantity, totalcost, discount, TotalExpence;
int price;
Scanner sc = new Scanner(System.in);
System.out.println("Enter quantity");
quantity = sc.nextInt();
System.out.println("Enter price");
price = sc.nextInt();
totalcost= quantity*price;
discount= (totalcost*10/100);
TotalExpence= totalcost-discount;
if(totalcost>=1000)
{
System.out.println("discount="+discount);

System.out.println("TotalExpence="+TotalExpence);
}
else
{
System.out.println("TotalExpence="+totalcost);
}
sc.close();
}
}

