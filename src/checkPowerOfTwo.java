import static java.lang.Math.ceil;
import static java.lang.Math.floor;

 public class checkPowerOfTwo{

    //Ctrl + shift + T to create test of method
    public boolean isPower(int number){

        if(number==0)
            return false;

        return (int)(Math.ceil((Math.log(number) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(number) / Math.log(2)))));
    }
}
