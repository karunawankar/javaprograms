import java.util.Scanner;
class ConverCelToDeg
{
public static void main(String[] args)
{
double celcius, fahrenheit;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the temperature in celcius");
celcius  = sc.nextDouble();
fahrenheit = (celcius*1.8)+32;
System.out.println("fahrenheit="+fahrenheit);
sc.close();
}
}