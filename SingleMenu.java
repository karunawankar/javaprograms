import java.util.Scanner;
class SingleMenu
{
public static void main(String[] args)
{
int number;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
number = sc.nextInt();
switch(number)
{
case 1:
System.out.println("Print");
break;
case 2:
System.out.println("Save");
break;
case 3:
System.out.println("Exit");
break;
default:
System.out.println("invalid number");
break;
}
sc.close();
}
}


