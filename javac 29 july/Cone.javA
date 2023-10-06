import java.util.Scanner;
class Cone
{
public static void main(String[] args)
{
double radius, height, length, volume, CSA, TSA;
double pi = 3.1412;
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius, height and length of cone");
radius = sc.nextDouble();
height = sc.nextDouble();
length = sc.nextDouble();
volume = 0.3333*pi*radius*radius*height;
CSA = pi*radius*length;
TSA = pi*radius*(radius+length);
System.out.println("volume="+volume);
System.out.println("CSA="+CSA);
System.out.println("TSA="+TSA);
sc.close();
}
}
