import java.util.Scanner;
class smallestOfTwo
{
public static void main(String[] args)
{
int x, y;
Scanner sc = new Scanner(System.in);
System.out.println("enter any two numbers");
x = sc.nextInt();
y = sc.nextInt();
if(x<y)
{
System.out.println(x+ "is smaller");
}
else
{
System.out.println(y+ "is smaller");
}
sc.close();
}
}