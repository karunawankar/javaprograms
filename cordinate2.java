import java.util.Scanner;
class cordinate2
{
public static void main(String[] args)
{
int x,y;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the coordinate of point");
x =sc.nextInt();
y = sc.nextInt();
if (x > 0 && y> 0)
System.out.println("Point lies in first quadrant");
else if (x < 0 && y< 0)
System.out.println("Point lies in second quadrant");
else if (x < 0 && y< 0)

System.out.println("Point lies in third quadrant");
else if (x > 0 && y< 0)

System.out.println("Point lies in forth quadrant");
else if (x == 0 && y!= 0)

if ( x == 0)
if ( y ! = 0)
System.out.println("Point lies in y axis");

if ( x ! = 0)
if ( y == 0)
System.out.println("Point lies in x axis");
sc.close();
}
}

