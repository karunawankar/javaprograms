import java.util.Scanner;
class Sphere
{
public static void main(String[] args)
{
double radius, volume, CSA, TSA;
double pi = 3.1412;
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius of the sphere");
radius = sc.nextDouble();
volume = 1.3333*pi*radius*radius*radius;
CSA = 4*pi*radius*radius;
TSA = 4*pi*radius*radius;
System.out.println("volume="+volume);
System.out.println("CSA="+CSA);
System.out.println("TSA="+TSA);
sc.close();
}
}
