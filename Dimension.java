package Graphics;
import java.util.Scanner;
interface calculation{
public void rectangle();
public void triangle();
public void circle();
public void square();
}
public class Dimension implements calculation {
public void main(String args[])
{
double area;
Scanner obj1=new Scanner(System.in);
public void rectangle() 
{
int l,b;
System.out.println("Enter the length of the 
rectangle:");
l=obj1.nextInt();
System.out.println("Enter the Breath of the 
rectangle:");
b=obj1.nextInt();
area=l*b;
System.out.println("Area:"+area+"\n");
}
public void triangle() {
int h,b;
System.out.println("Enter the base of the Triangle:");
b=obj1.nextInt();
System.out.println("Enter the height of the 
Triangle:");
h=obj1.nextInt();
area=(h*b)/2;
System.out.println("Area:"+area+"\n");
}
public void circle() {
float r;
System.out.println("Enter the Radius of the 
Circle:");
r=obj1.nextInt();
area=3.14*r*r;
System.out.println("Area:"+area+"\n");
}
public void square() {
int s;
System.out.println("Enter the Side of the Square:");
s=obj1.nextInt();
area=s*s;
System.out.println("Area:"+area+"\n");
}
}
interface calculation{
public void rectangle();
public void triangle();
public void circle();
public void square();
}
package TestPK;
import java.util.Scanner;
import Graphics.Dimension;
//test.java
public class Test {
public static void main(String[] args) {
Scanner obk=new Scanner(System.in);
Dimension obj=new Dimension();
int ch=0;
//l=obj1.nextInt();
while(ch<5) {
System.out.println("Choose the Shape to find 
the area:"+"\n 1.Rectangle \t 2.Triangle \n 3.Circle \t 4.Sqaure \t 
5.Exit");
ch=obk.nextInt();
switch(ch) {
case 1: 
obj.rectangle();
 break;
 case 2: 
 obj.triangle(); 
 break;
 case 3: 
 obj.circle();
 break;
 case 4: 
 obj.square();
 break;
 case 5: break;
 default:
 System.out.println("invalid choice");
 break; 
}
}
}
}
