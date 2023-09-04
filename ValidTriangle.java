import java.util.Scanner;
class ValidTriangle
{
public static void main(String[] args)
{
double side1, side2, side3;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a b and c of triangle");
side1= sc.nextDouble();
side2 =sc.nextDouble();
side3=sc.nextDouble();
if((side1+side2)>side3)
{
System.out.println("It form valid triangle");
}
else
{
System.out.println("It does not valid triangle");
}
sc.close();
}
}
