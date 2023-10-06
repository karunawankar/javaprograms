import java.util.Scanner;
class AreaPeri
{
public static void main(String[] args)
{
double area, perimeter, length, width;
 
Scanner sc = new Scanner(System.in);
System.out.println.("Enter the length and width of rectangle");
length = sc.nextDouble();
width = sc.nextDouble();

area = length * width ;
perimeter = 2*(length + width );
 System.out.println("Area =" +area);
 System.out.println("perimeter =" +perimeter);
sc.close();
}

