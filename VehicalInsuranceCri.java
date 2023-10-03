import java.util.Scanner;
class VehicalInsuranceCri
{
public static void main(String[] args)
{
int a;
String type;

Scanner sc = new Scanner(System.in);
System.out.println("Enter type of vehical");
type = sc.next();
System.out.println("Enter age of vehical");
a= sc.nextInt();
if(type.equals("car") && a<=5)
{
 System.out.println("premium is rs 8000");
}
else if(type.equals("car") && a>5)
{
 System.out.println("premium is rs 6000");
}

else if(type.equals("bike") && a<=3)

{
 System.out.println("premium is rs 3000");
}
else
{
 System.out.println("premium is rs 2000");
}
sc.close();
}
}

