
public class PrimeFactor {
    
    public String of(int number) {
        String result="";
        int start = 2;
        
        while(number > 1) {
            while(number%start == 0) {
                result = result+start;
                number = number/start;
            }
            start++;
        }
        
        return result;
    }
    
}
