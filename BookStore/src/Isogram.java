import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;

public class Isogram {

	public boolean check(String input) {
		input = input.toLowerCase();
		input = input.replace(" ", "");
		input = input.replace("-", "");
		
		int stringSize = input.length();
		
		Set<Character> checker = new HashSet<>();
		
		for(int i = 0; i < stringSize ;i++) {
			if (!checker.add(input.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}

}
