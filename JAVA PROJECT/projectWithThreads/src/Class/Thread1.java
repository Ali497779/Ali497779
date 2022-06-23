package Class;

public class Thread1 extends Thread{

   public String namee;
   public String Fidd;
   public double Salaryy;
   Faculty faculty;

   public Thread1(Faculty faculty){
       this.faculty = faculty;

   }

   public void run(){

      faculty.setName(namee);
      faculty.setFid(Fidd);
      faculty.setSalary(Salaryy);
   }

}
