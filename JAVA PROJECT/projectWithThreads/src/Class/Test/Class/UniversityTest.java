package Class;

import junit.framework.TestCase;

public class UniversityTest extends TestCase {



    public void testInsertFaculty() {

        String name = "Humail";

        Faculty faculty = new Faculty();
        faculty.setName("Humail");
        String value = faculty.getName();

        assertEquals(value , name);

        System.out.println("Test IS Pass !!!!");
    }


}
