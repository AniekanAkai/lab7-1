/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teddy
 */
public class TestMain {
        NameTest n;
        AddressTest a;
        PersonTest p;
        ProfessorTest pr;
        CourseTest c;
        StudentTest s;
    
        TestMain() throws Exception{
            n = new NameTest();
            a = new AddressTest();
            p = new PersonTest();
            pr = new ProfessorTest();
            c = new CourseTest();
            s = new StudentTest();
         }
        
        void testName(){
            n.testName();
            n.testEquals();
        }
        void testAddress() throws Exception{
            a.testAddress();
            a.testEquals();
            a.testToString();
        }
        
        void testPerson()throws Exception{
            p.testPerson();
            p.testToString();
            p.testGetFirstName();
            p.testGetFirstName();
            p.testGetLastName();
            p.testSetLastName();
            p.testGetAddress();
            p.testAddCourse();
            p.testRemove();
            p.testGetCourses();
            p.testEquals();
        }
        void testCourse()throws Exception{
            c.testCourse();
            c.testEquals();
            c.testGetId();
            c.testGetName();
            c.testGetProfessor();
            c.testSetProfessor();
            c.testStudent();
            c.testToString();
        
        }
        void testStudent()throws Exception{
            s.testGetNumber();
            s.testToString();
            s.testEquals();
        }
        
       private void testProfessor()throws Exception{
           pr.testProfessor();
           pr.testGetOffice();
           pr.testSetOffice();
           pr.testEquals();
       }   
        
    public static void main(String[] args) throws Exception{
        TestMain t = new TestMain();
        t.testName();
        t.testAddress();
        t.testPerson();
        t.testCourse();
        t.testStudent();
        t.testProfessor();
    }
    
}
