import java.util.Scanner;
class Trapezium
{
public static void main(String[] args)
{
double area, perimeter, height, side1, side2, side3, side4; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of height, side1, side2, side3 and side4 of trapezium");

height  = sc.nextDouble();
side1 = sc.nextDouble();
side2 = sc.nextDouble();
side3 = sc.nextDouble();
side4 = sc.nextDouble();

area = 0.5*height*(side3+side1);
perimeter = side1+side2+side3+side4;

System.out.println("area="+area);
System.out.println("perimeter="+perimeter);
sc.close();
}
}