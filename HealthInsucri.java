import java.util.Scanner;
class HealthInsucri
{
public static void main(String[] args)
{
int a;
String healthcond;

Scanner sc = new Scanner(System.in);
System.out.println("Enter age of the person");
a= sc.nextInt();
System.out.println("Enter health condition of the person");
healthcond = sc.next();

if(a>=18 && a<=60 && healthcond.equals("Excellent"))
{
System.out.println("person is eligible for health insurance");
}
else if(a>=18 && a<=60 && healthcond.equals("poor"))
{
System.out.println("person is not eligible for health insurance");
}
else if(a>60 && healthcond.equals("Excellent"))
{
System.out.println("person is not eligible for health insurance");
}
else
{

System.out.println("person is  not eligible for health insurance");
}
sc.close();
}
}
