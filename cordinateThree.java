
import java.util.Scanner;
class cordinateThree
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
else if(x<0 && y>0)
System.out.println("point lies in second quadrant");
else if(x<0 && y<0)
System.out.println("point lies in third quadrant");
else if(x>0 && y<0)
System.out.println("point lies in fourth quadrant");
else if(x!=0 && y==0)
System.out.println("point lies in X- quadrant");
else if(x==0 && y!=0)
System.out.println("point lies in Y- quadrant");
else
System.out.println("point is origin");

sc.close();
}
}