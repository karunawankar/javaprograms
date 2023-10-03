import java.util.Scanner;
class Hemesphere
{
public static void main(String[] args)
{
double radius, volume, CSA, TSA;
double pi = 3.1412;
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius of the hemesphere");
radius = sc.nextDouble();
volume = 0.6666*pi*radius*radius*radius;
CSA = 2*pi*radius*radius;
TSA = 3*pi*radius*radius;
System.out.println("volume="+volume);
System.out.println("CSA="+CSA);
System.out.println("TSA="+TSA);
sc.close();
}
}