import java.util.Scanner;
class bankStatement
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

double accountBal;
System.out.println("Enter your account balance");
accountBal = sc.nextDouble();

if(accountBal>0)
{
System.out.println("Account is in credit state");
}

else if(accountBal<0)
{
System.out.println("Account is in overdraft state");
}
else
{
System.out.println("Account balance is zero");
}
sc.close();
}
}