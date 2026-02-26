public class MemberCardDemo{
public static void main(String args[]){
//defaultl constructor
MemberCard m0=new MemberCard();
//overloaded constructors
MemberCard m1=new MemberCard("Amna");
MemberCard m2=new MemberCard("Bisma","Maths");
//full constructors
MemberCard m3=new MemberCard("Ayesha","BSE",2,148000,false);
MemberCard m4=new MemberCard("Ali","BMD",3,148000,true);
//copy constructor
MemberCard m5=new MemberCard(m4);
//activate card
m3.activateCard();
//deactivate card
m4.deactivateCard();
//pay fee
m4.payFee(162000);
 

System.out.println(m1);
System.out.println(m2);
System.out.println(m3);
System.out.println(m4);
System.out.println(m5);
System.out.println("Total cards generated: "+MemberCard.totalCards());
}}