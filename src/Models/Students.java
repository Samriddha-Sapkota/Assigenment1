package Models;

public class Students {
    String name;
    int age;
    float[] marks;
    int grade = 12;

    public Students(java.lang.String name, int age, float[] marks, int grade) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void printfunc() {
        float a =0;
        String name = this.name;
        int age = this.age;
        float[] marks = this.marks;
        int grade = this.grade;
        for (int i = 0; i < marks.length; i++) {
            a = a + marks[i];
        }
        float total =+ a;
        float Percentage = (total / 300) * 100;
        if (Percentage > 90 & Percentage <= 100){
            System.out.println("The student " + name + " has scored A+ with " + Percentage + "%");
        }else if(Percentage > 80 & Percentage <= 90){
            System.out.println("The student " + name + " has scored A with " + Percentage + "%");
        }else if(Percentage > 70 & Percentage <= 80){
            System.out.println("The student " + name + " has scored B+ with " + Percentage + "%");
        }else if (Percentage > 60 & Percentage <= 70){
            System.out.println("The student " + name + " has scored B with " + Percentage + "%");
        }else if(Percentage > 50 & Percentage <= 60){
            System.out.println("The student " + name + " has scored C+ with " + Percentage + "%");
        }else {
            System.out.println("The student " + name + " has scored below C+ with " + Percentage + "%");
        }
    }
}
