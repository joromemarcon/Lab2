
 public class checkPowerOfTwo{

    //Ctrl + shift + T to create test of method
    public int isPower(int number){

        if(number == 0)  return 0; // if number is 0, undf, return false
        while(number != 1){
            number = number/2;
            if((number % 2 != 0) && (number != 1)){ return 0; }
        }
        return 1;
    }
}
