import java.util.Scanner;
class SwitchStudentMark
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the students marks between 0-100");
int score= sc.nextInt();
char grade;
if(score<0 || score>100)
{
System.out.println("Invalid input, please enter marks between 0-100");
}
int gradevalue= score/10;
switch (gradevalue)
{
case 10:
case 9:
System.out.println("A grade");
break;
case 8:
System.out.println("B grade");
break;
case 7:
System.out.println("C grade");
break;
case 6:
System.out.println("D grade");
break;
default:
System.out.println("Fail");
break;
}
sc.close();
}
}





