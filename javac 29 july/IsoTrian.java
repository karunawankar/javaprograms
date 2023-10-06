import java.util.Scanner;
class IsoTrian
{
public static void main(String[] args)
{
double base, height, side, area, perimeter;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of base, height and side of triangle");
base = sc.nextDouble();
height =  sc.nextDouble();
side = sc.nextDouble();
area = 0.5*base*height;
perimeter = 2*side+base;
System.out.println("area=" +area);
System.out.println("perimeter=" +perimeter);
sc.close();
}
}
