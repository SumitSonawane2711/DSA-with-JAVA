package StaticExample;
  /* -When a member is declared as static it can be accessed before the object of the classes is being
      created and without referencing to that object.
     -static variable are not dependent on object it can be accessed by class name.
     -static variable is common for all.
     -you can declare variable and functions as static.
     -most common method is, public static void main() method.

     _why main is static : main is the first methode that you have to run first in the program. it should be
      able to run without creating the object of the main class. that is static means you can run it wethout
      creating object.
      -static is belongs to class not to object.
      -static methode cant accessed non-static data.
  */
public class Human {
   int age;
   String name;
   int salary;
   Boolean married;
   static long poppulation;

   Human(int age,String name,int salary,Boolean married){
      this.age = age;
      this.name = name;
      this.married = married;
      this.salary = salary;
      Human.poppulation += 1;           // static variable is accessed by class name
   }


}
