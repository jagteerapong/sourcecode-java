
public class FizzBuzz {

    public String sendAndReturn(int number) {
        String result;
        
        if(modThreeAndModFive(number)) {
            result = "FizzBuzz";
        }else if(modThree(number)){
            result = "Fizz";
        }else if(modFive(number)){
            result = "Buzz";
        }else {
            result = String.valueOf(number);
        }
        
        return result;
    }

    private boolean modThreeAndModFive(int number) {
        return modFive(number) && modThree(number);
    }

    private boolean modFive(int number) {
        return number%5 == 0;
    }

    private boolean modThree(int number) {
        return number%3 == 0;
    }
    
}
