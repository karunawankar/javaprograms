import java.util.Scanner;
class SwitchGeoShape
{
public static void main(String[] args)
{
int n; 
double radius, height, base, side, pie, area1, area2, area3;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the given number to find the area of that shape:"+"\nPress \n 1=cicle \n 2 = triangle \n 3 = square\n");
 n = sc.nextInt();
switch(n)
{
case 1:
System.out.println(" you are finding area of circle, please Enter radius of circle=");
radius = sc.nextDouble();
pie=3.1412;
area1= 3.1412*radius*radius;
System.out.println("Area of circle="+area1);
break;
case 2:
System.out.println(" you are finding area of triangle, please Enter base and height of triangle=");
height = sc.nextDouble();
base = sc.nextDouble();
area2= base*height*0.5;
System.out.println("Area of triangle="+area2);
break;
case 3:
System.out.println("you are finding area of square, please Enter side of square=");
side =sc.nextDouble();
area3 = side*side;
System.out.println("Area of square="+area3);
break;
default :
System.out.println("Invalid number");
break;

}
sc.close();
}
}








