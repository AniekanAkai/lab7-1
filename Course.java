import java.util.ArrayList;

public class Course
{
    private String id;
    private String name;
    private Professor professor;
    private ArrayList<Student>students;
    
    public Course(String id, String name) throws Exception {
        this.id = id;
        this.name = name;
        professor = new Professor("John","Doe");
    }
    
    public String getId() { 
        return id; 
    }
    public String getName() { 
        return name; 
    }

    public String toString() {
        return id+" "+name+"\nProfessor: "+professor.toString(); 
    }
    
    public boolean equals(Course c) { 
        if(id == c.getId()){
            return true;
        }else{
            return false; 
        }
    }
    public void setProfessor(Professor professor) {
            this.professor = professor;
    };
    public Professor getProfessor() { return professor; }

    public void addStudent( Student student ) {
            students.add(student);
    }
    
    public void removeStudent( Student student ) {
        if(students.remove(id)){
            System.out.println(student.getFullName() + " has been removed from this course");
        }else{
            System.out.println(student.getFullName() + " is not registered in this course");
        }
    }
    
    public Student[] getStudents() { return (Student[])students.toArray(); }
}
