import java.util.Scanner;
class cordinate
{
public static void main(String[] args)
{
int x,y;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the coordinate of point");
x =sc.nextInt();
y = sc.nextInt();
if (x > 0)
if (y > 0 )
System.out.println("Point lies in first quadrant");
if ( x < 0)
if ( y > 0)
System.out.println("Point lies in second quadrant");
if ( x < 0)
if ( y < 0)
System.out.println("Point lies in third quadrant");
if ( x > 0)
if ( y < 0)
System.out.println("Point lies in forth quadrant");

if ( x == 0)
if ( y ! = 0)
System.out.println("Point lies in y axis");

if ( x ! = 0)
if ( y == 0)
System.out.println("Point lies in x axis");
sc.close();
}
}

