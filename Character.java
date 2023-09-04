import java.util.Scanner;
class Character
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character");
char ch = sc.next().charAt(0);
if(Character.isUpperCase(ch))
{
System.out.println("Character is in upper case");
}
else if(Character.isLowerCase(ch))
{
System.out.println("Character is in lower case");
}
sc.close();
}
}