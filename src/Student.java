import com.sun.xml.internal.bind.v2.model.core.ID;

public class Student implements Comparable<Student>{
    private String name;
    private String id;
    private int age;
    private String gender;
    public Student(String name,String id){
        this.name = name;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this == null) return false;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.name.equals(other.name) && this.id.equals(other.id);


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
