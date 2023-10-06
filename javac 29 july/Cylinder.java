import java.util.Scanner;
class Cylinder
{
public static void main(String[] args)
{
double radius, height, volume, CSA, TSA;
double pi = 3.1412;
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius and height of cylinder");

radius = sc.nextDouble();
height = sc.nextDouble();
volume = pi*radius*radius*height;
CSA = 2*pi*radius*height;
TSA = 2*pi*radius*height+2*pi*radius*radius;
System.out.println("volume="+volume);
System.out.println("CSA="+CSA);
System.out.println("TSA"+TSA);
sc.close();
}
}