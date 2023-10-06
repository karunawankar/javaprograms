import java.util.Scanner;
class ProfitLossIfElse
{
public static void main(String[] args)
{
double CostPrice, SellingPrice, profit, loss;
Scanner sc= new Scanner(System.in);
System.out.println("Enter cost price of an item");
CostPrice= sc.nextDouble();
System.out.println("Enter selling price of an item");
SellingPrice= sc.nextDouble();
profit=SellingPrice-CostPrice;
loss= CostPrice-SellingPrice;

if(SellingPrice>CostPrice)
{
System.out.println("Profit has booked");
System.out.println("profit="+profit);
}
else
{
System.out.println("Loss occured");
System.out.println("loss="+loss);
}
sc.close();
}
}


