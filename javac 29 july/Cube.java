
import java.util.Scanner;
class Cube
{
public  static void main(String[] args)
{
double volume, CSA, TSA, side;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of the side of cube");
side = sc.nextDouble();
volume = side*side*side;
CSA = 4*side*side;
 TSA = 6*side*side;
System.out.println("volume="+volume);
System.out.println("CSA="+CSA);
System.out.println("TSA="+TSA);
sc.close();
}
}


