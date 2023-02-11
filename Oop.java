

class Pen{
    String color;
    int length;
    String type;

    public void write(){
        System.out.println("writed");
    }
    public void printInfo(int length){
        System.out.println(this.length);
    }
    public void printInfo(String color){
        System.out.println(this.color);
    }

    public void getPenProperties(){
        System.out.println("Pen color is "+ this.color);
        System.out.println("Pen length is "+ this.length);
        System.out.println("Pen type is "+ this.type);
    }
}

class Student{
    String name;
    int age;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void write(){
        System.out.println("writed");
    }
    public void getDetails(){
        System.out.println("Student name is "+ this.name);
        System.out.println("Student age is "+ this.age);
    }
}



public class Oop {
    public static void main(String args[]){
        Pen p1 = new Pen();
        // System.out.println("\n");
        p1.color = "black";
        p1.printInfo("black");
        // p1.color = "red";
        // p1.length = "0.1m";
        // p1.type = "ball";
        // p1.getPenProperties();
        // System.out.println("\n");


        // Student s1 = new Student(14, "triyam");
        // s1.getDetails();

    }
}
