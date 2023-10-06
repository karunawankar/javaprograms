import java.util.Scanner;
class AreaC
{
public static void main(String[] args)
{
double area, circ, radius;
double pi = 3.1412;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius of circle");
radius = sc.nextDouble();
 
area = pi*radius*radius;
circ = 2*pi*radius;

System.out.println("Area =" +area);
System.out.println("circumference =" +circ);
sc.close();
}
}