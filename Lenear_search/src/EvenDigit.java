
//find no.of no.s which contains even no of digits
public class EvenDigit {
    public static void main(String[] args) {
        int[] nums={12,345,5457,4244,34,338,78,8};
        System.out.println(findNumbers(nums));

        //System.out.println(digits(0));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check weather a no contain even no of digits
    //1.count the no of didit 2.convert no into String and find the length of the string
    static boolean even(int num){
        int numberofDigits=digits(num);
        if(numberofDigits % 2==0){
            return true;
        }
        return false;
        //return numberofDigits % 2==0;
    }

    //count no of digits in a number
    static int digits(int num){
        if(num<0){
            num=num * -1;
        }
        if(num == 0){
          return 1;
        }
        int count =0;
        while(num>0){
            count ++;
            num=num/10;
        }
        return count;
    }
}
