import java.util.Scanner;
class HomeInsuPriCal
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter value of home");
double homevalue=sc.nextDouble();

System.out.println("Enter type of home(apartment/bungalow");
String hometype=sc.next().toLowerCase();
double premiumrate;
if(hometype.equals("appartment"))
{
premiumrate=0.02;
}
else if(hometype.equals("bungalow"))
{
premiumrate=0.04;
}

else 
{
System.out.println("Invalid home type. Please enter appartment or bungalow");
return;
}
double insurancePremium= homevalue*premiumrate;
System.out.println("Insurance premium for the"+hometype+"is:$"+insurancePremium);
sc.close();
}
}