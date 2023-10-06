import java.util.Scanner;
class Rhombus
{
public static void main(String[] args)
{
double area, perimeter, diagonal1, diagonal2, side;
Scanner sc = new Scanner(System.in);
System.out.println("Enter diagonal1, diagonal2 and side of rhombus");

diagonal1 = sc.nextDouble();
diagonal2 = sc.nextDouble();
side = sc.nextDouble();
area = 0.5*diagonal1*diagonal2;
perimeter = 4*side;
System.out.println("area =" + area);
System.out.println("perimeter =" + perimeter);
sc.close();
}
}