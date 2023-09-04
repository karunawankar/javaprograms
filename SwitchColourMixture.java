import java.util.Scanner;
class SwithchColourMixture
{
public static void main(String[] args)
{
String blue, yellow, red;
Scanner sc = new Scanner(System.in);
System.out.println("Enter first primary colour");
String colour1= sc.nextLine();
System.out.println("Enter second primary colour");
String colour2= sc.nextLine();
String mixture= mixcolour(colour1,colour2);
System.out.println("Mixture of:"+colour1+""+"and"+""+colour2+""+"is"+""+mixture);

}
public static String mixcolours(String colour1,String colour2)
{
switch(colour1.toLowercase()+colour2.toLowercase())
{

case "redblue":
case "bluered":
return "purple";

case "yellowblue":
case "blueyellow":
return "green";

case "redyellow":
case "yellowred":
return "orange";

default:
return "invalid";
}

sc.close();
}
}

