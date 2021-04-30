package _00_intro_to_array_lists;
import java.util.*;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList <String> variable = new ArrayList <String>();
		//2. Add five Strings to your list
		variable.add("hi");
		variable.add("hello");
		variable.add("greetings");
		variable.add("Yo");
		variable.add("What's up");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < variable.size();i++) {
			System.out.println(variable.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String i: variable) {
			System.out.println(i);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < variable.size(); i++) {
			if(i % 2 == 1) {
				System.out.println(variable.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i = variable.size() - 1; i >= 0; i--) {
			System.out.println(variable.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < variable.size(); i++) {
			if(variable.get(i).contains("e")) {
				System.out.println(variable.get(i));
			}
		}
	}
}
