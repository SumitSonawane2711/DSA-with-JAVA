// Classes , objects,Constructor, new and this keywords
//class : collection of properties and functions
class Student {
    int rollno;                            // instance variables : declared inside the class but outside the method
    String name;
    float marks;

    Student(){                                   // Default constructor ,no parameters
        this.rollno = 15;                        // this keyword replace the object name object by object
        this.name = "Rohan";
        this.marks = 78.89f;
    }

    Student(int R,String N,float M){              //parameterized constructor
        this.rollno = R;
        this.name = N;
        this.marks = M;
    }

    //Student random = new Student(Rohan);    random will replace by this and Rohan will replace by Other
                                              // return the p
    // Rohan.name
    Student (Student other){                     // constructor that return the value of other object
        this.name = other.name;
        this.rollno= other.rollno;
        this.marks = other.marks;
    }

//    Student(){
//        //this is called the constructor from another constructor
          //internally :new Student()
//        this (13,"Kunal",89.85f);
//    }


}
public class Main_01{
    public static void main(String[] args) {

        Student Sumit;            // just declaration ,creating a reference variable name as Sumit of type Student(class)
        Sumit = new Student();   // new : dynamically allocate memory and return reference to it(Sumit)
        Sumit.marks = 93.46f;
        Sumit.rollno = 67;
        System.out.println(Sumit.rollno);      // output is 67

        Student Rohan = new Student(23,"Rohan", 67.4f);     //pass the value to parameterised constructor
        System.out.println(Rohan.name);

        Student random = new Student(Rohan);
        System.out.println(random.name);


    }
}