package Class;

public class Thread2 extends Thread{

    public Faculty e;
    University university;

    public Thread2(University university , Faculty e){
        this.university = university;
        this.e = e;
    }

    public void run(){

        university.insertFaculty(e);
//        university.removeFaculty(e);
        university.showAllFaculty();

    }

}
