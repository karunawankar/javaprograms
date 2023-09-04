import java.util.Scanner;
class cordinateaTwo
{
public static void main(String[] args)
{
int x, y;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the coordinate of point");
x = sc.nextInt();
y = sc.nextInt();
if(x>0 && y>0)
System.out.println("point lies in first quadrant");
if(x<0 && y>0)
System.out.println("point lies in second quadrant");
if(x<0 && y<0)
System.out.println("point lies in third quadrant");
if(x>0 && y<0)
System.out.println("point lies in fourth quadrant");
if(x!=0 && y==0)
System.out.println("point lies in X- quadrant");
if(x==0 && y!=0)
System.out.println("point lies in Y- quadrant");
if(x==0 && y==0)
System.out.println("point is origin");

sc.close();
}
}