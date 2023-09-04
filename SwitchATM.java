import java.util.Scanner;
class SwitchATM
{
public static void main(String[] args)
{
int balance=20000, withdraw, deposit, balance1; 
Scanner sc = new Scanner(System.in);
{
 System.out.println("Automated teller Machine");
System.out.println("Choose 1 to withdraw");
System.out.println("Choose 2 for deposit");
System.out.println("Choose 3 for balance inquary");

int choice=sc.nextInt();
switch(choice)


{
case 1:
System.out.println("Enter the amount to withdraw");
withdraw= sc.nextInt();
if(withdraw<=balance)
{
balance1= balance-withdraw;
balance=sc.nextInt();

System.out.println("Please collect your money");
}
else
{
System.out.println("Insufficient balance");
}
System.out.println("Your balance is="+balance1);
balance1=sc.nextInt();

break;
case 2:
System.out.println("Enter the amount to be deposited");
deposit= sc.nextInt();
balance1= balance+deposit;
System.out.println("Your money is successfully deposited");
System.out.println("Your balance is="+balance1);
balance1=sc.nextInt();

break;
case 3:
System.out.println("balance="+balance);
System.out.println("");
break;
default:
System.out.println("invalid");
break;
}
}
}
}















