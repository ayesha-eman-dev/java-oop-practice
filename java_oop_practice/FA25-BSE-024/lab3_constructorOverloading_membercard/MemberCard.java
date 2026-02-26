public class MemberCard{
private static int counter=0;
private static final String PREFIX ="LIB-";
private String cardNo;
private String studentName;
private String department;
private int semester;
private double feePaid;
private boolean active=true;
private boolean inactive=false;
MemberCard(){System.out.println("Default constructor");}
MemberCard(String studentName){
  this(studentName,"BSSE");         }
MemberCard(String studentName,String department){
this(studentName,department,1,0,true);}
MemberCard(String studentName,String department,int semester,double feePaid,boolean active){
 this.cardNo=generateCardNo();
 this.studentName=studentName;
 this.department=department;
 this.semester=semester;
 this.feePaid=feePaid;
 this.active=active;

}
MemberCard(MemberCard other){
this(other.studentName,other.department,other.semester,other.feePaid,other.active);
}
private static String generateCardNo(){
counter++;
return String.format(PREFIX+"%04d",counter);}
public void deactivateCard(){
  active=false;}
public void activateCard(){
   active=true;}
public void payFee(double amount){
if(amount>0)
  feePaid+=amount;}
public String toString(){
return cardNo+ "  " +studentName+"  "+department+"  "+semester+"  "+" Fee: "+feePaid+" Active: "+active;}
 public static int totalCards(){
  return counter;}}