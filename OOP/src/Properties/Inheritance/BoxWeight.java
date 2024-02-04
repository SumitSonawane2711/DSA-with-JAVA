package Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w); // super keyword call parent class constructor
         //used to initiated values present in parent class
        this.weight = weight;


    }
}
