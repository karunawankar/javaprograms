import java.util.Scanner;
class AccountType
{
public static void main(String[] args)
{
String accounttype;
Scanner sc = new Scanner(System.in);
System.out.println("Enter account type");
accounttype = sc.next();
if(accounttype.equals("current"))
{
System.out.println("Account is valid");
}
else if(accounttype.equals("Current"))
{
System.out.println("Account is valid");
}

else if(accounttype.equals("savings"))
{
System.out.println("Account is valid");
}
else if(accounttype.equals("Savings"))
{
System.out.println("Account is valid");
}
else
{
System.out.println("Account is invalid");
}
sc.close();
}
}
