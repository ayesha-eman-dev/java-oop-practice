public class RectangleTest{
public static void main(String args[]){
   Rectangle r1=new Rectangle();
   Rectangle r2=new Rectangle();
     r1.length=6;
     r1.width=7;
      r2.length=3;
       r2.width=5;
  double area1= r1.calArea();
  double area2=r2.calArea();
 double p1= r1.calPerimeter();
  double p2=r2.calPerimeter();

   System.out.println("Area of Rectangle:  + r1 + " is " + area1);
    System.out.println("Area of Rectangle: " + r2 + " is " + area2);
 System.out.println("perimeter of Rectangle: " + r1 + " is " + p1);
    System.out.println("perimeter of Rectangle: " + r2 + " is " + p2);
   
}}