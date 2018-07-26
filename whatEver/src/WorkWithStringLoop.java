
public class WorkWithStringLoop {

    public static void main(String[] args) {
        String name = "Teerapong24";
        
        for (int i = name.length(); i > 0; i--) {
            System.out.println(name);
            name = name.substring(1);
        }
    }

}
