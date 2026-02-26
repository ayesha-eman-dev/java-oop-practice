public class MyApp{
public static void main(String args[]){
  System.out.println("My first App in java");
  System.out.println();
 //finding area of circle
    Circle c1=new Circle();
    c1.radius= 16;
     System.out.println("Area of Circle: " + c1.radius*c1.radius*3.14);
//making a calculator
     Calculator m1=new Calculator();
     m1.a=12;
     m1.b=3;
     System.out.println();
     System.out.println(" CALCULATOR ");
     System.out.println();
     System.out.println("Multiplication: " + (m1.a*m1.b));
     System.out.println("Addition: " + (m1.a+m1.b));
     System.out.println("Division: " + (m1.a/m1.b));
     System.out.println("Subtraction: " + (m1.a-m1.b));
     System.out.println();
//printing a table
     System.out.println("Table of 3");
     System.out.println();
     int x=3;
     int y=7;
      for(int i=1;i<=10;i++){
           System.out.println(3 + " x " + i + " = " + (3*i));}
 //finding maximum of the two numbers
    int max=0;
    if (max<x){
       max=x;}
    if (max<y){
       max=y;}
     System.out.println("Maximum of the two numbers is: " + max);
}}