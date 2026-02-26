public class Product{
 private String id;
 private String name;
 private double price;
 private int quantity;
  static int counter=1;
Product(){System.out.println("Default constructor");}
 Product(String name,double price,int quantity){
  this.id= generateId();
  this.name=name;
  this.price=price;
  this.quantity=quantity;
System.out.println(toString());

}
public void setName(String name){
 this.name=name; }
public String getName(){
 return name;}
public void setPrice(double price){
  this.price=price;}
public double getPrice(){
return price;}
public void setQuantity(int quantity){
this.quantity=quantity;
}
public double getQuantity(){
return quantity;
}
private static String generateId(){
return String.format("%03d",counter++);
 }
public String toString(){
return String.format("%4s %s %.2f %d",id,name,price,quantity);
}
static{System.out.println("static block");}}