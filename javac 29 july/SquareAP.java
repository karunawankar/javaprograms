import java.util.Scanner;
class SquareAP
{
public static void main(String[] args)ja
{
double Area, perimeter, side;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the side of square");
side = sc.nextDouble();
Area = side*side;
perimeter = 4*side;
 System.out.println("Area =" + Area);
System.out.println("perimeter =" + perimeter);
sc.close();
}
}
