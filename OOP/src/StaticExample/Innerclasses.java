package StaticExample;

// Inner classes is classes inside the class
//outside classes can not be static
public class Innerclasses {
    static class Test{
        String name;
        public Test(String name){
            this.name= name;
        }
    }

    public static void main(String[] args) {
        Test obj1 = new Test("kunal");   // this two object are dependent having unique outputs
        Test obj2 = new Test("sumit");   // even though the class test is static


        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}

//here the inner class(Test) is a static that means it does not depend on the object of outer class(Innerclasses).
//but main and Test class can depend on each others.