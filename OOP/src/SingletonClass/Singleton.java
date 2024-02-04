package SingletonClass;
// let you want stop the people to create the object of the class(Singleton)
// that means you do not want to  allow them to use the constructor of the class

public class Singleton {
   private Singleton(){                           // private constructor

    }

    private static Singleton instance;

   public static Singleton getinstance(){

       if(instance == null){
           instance =new Singleton();
       }

       return instance;
   }
}
