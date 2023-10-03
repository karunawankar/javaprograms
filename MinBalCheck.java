import java.util.Scanner;
class MinbalCheck
{
public static void main(String[] args)
{
double accountbalance;
Scanner sc = new Scanner(System.in);
System.out.println("Enter account balance");
accountbalance = sc.nextDouble();
if(accountbalance==1000)
{
System.out.println("Account has minimum balance ");
}
else
{
System.out.println("Account does not have minimum balance ");
}
sc.close();
}
}
