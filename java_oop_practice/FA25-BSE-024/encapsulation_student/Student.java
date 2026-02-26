public class Student {
    private String name;
    private String regNo;
    private double cgpa;
public Student(String name, String regNo, double cgpa) {
        this.name = name;
        this.regNo = regNo;
        this.cgpa = cgpa;
    }
  public String getName() {
        return name;}
   public void setName(String name) {
        this.name = name; }
  public String getRegNo() {
        return regNo;} 
 public void setRegNo(String regNo) {
        this.regNo = regNo;}
 public double getCgpa() {
        return cgpa;}
 public void setCgpa(double cgpa) {
   this.cgpa = cgpa;
    }
public String toString(){
return "Name: " + name + " Reg No.: " + regNo + " CGPA: " + cgpa;}}