import java.util.Scanner;
class RtAngTria
{
public static void main(String[] args)
{
double base, height, hypotenuse, area, perimeter;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of base, height and hypotenuse");
base = sc.nextDouble();
height = sc.nextDouble();
hypotenuse = sc.nextDouble();
area = 0.5*base*height;
perimeter = base+hypotenuse+height;
System.out.println("area="+area);
System.out.println("perimeter="+perimeter);
sc.close();
}
}
