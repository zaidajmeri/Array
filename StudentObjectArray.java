package Arrays;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll No " + rollNo + " " + name;
    }
}

public class StudentObjectArray {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "James"),
            new Student(2, "Oliver"),
            new Student(3, "Liam"),
            new Student(4, "Lucas"),
            new Student(5, "John")
        };

        for (int i = 0; i < students.length; i++) {
            System.out.println("Elements at " + i + " : " + students[i]);
        }
    }
}
