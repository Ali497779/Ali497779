package Class;

public class Thread3 extends Thread{

    public Faculty e;
    University university;

    public Thread3(University university , Faculty e){
        this.university = university;
        this.e = e;
    }

    public void run(){

//        university.insertFaculty(e);
        university.removeFaculty(e);
        university.showAllFaculty();

    }

}
