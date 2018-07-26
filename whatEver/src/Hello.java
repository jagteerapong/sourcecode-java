public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.say(100);
    }
    
    //constant
    private static final int NUMBER_TWO = 2;
    //Class variable
    public static int index = 1;
    //Instance variable
    private int number = 3;
    
    private void say(int number) {
        int index = 0 ;
        System.out.println(index);//0
        System.out.println(this.index);//0
        System.out.println(Hello.index);//1
        System.out.println(number);//100
        System.out.println(this.number);//100
        System.out.println(NUMBER_TWO);//2
    }
}
