public class Demo {
   public static void main(String args[]) {
    
  Student s1 = new Student("Ayesha Eman", "FA25-BSE-024", 3.3);
  System.out.println("Name: " + s1.getName());
   System.out.println("Reg No.: " + s1.getRegNo());
  System.out.println("CGPA: " + s1.getCgpa());
   s1.setCgpa(3.5);
    s1.setName("Ayesha Eman Updated");
   System.out.println(s1); }}

