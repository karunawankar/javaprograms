import java.util.Scanner;
class Paragm
{
public static void main(String[] args)
{
double base, height, length, area, perimeter;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of base, height and length");
base = sc.nextDouble();
height = sc.nextDouble();
length = sc.nextDouble();
area = base*height;
perimeter = 2*(length+base);
 
System.out.println("area=" + area);
System.out.println("perimeter" + perimeter);
sc.close();
}
}