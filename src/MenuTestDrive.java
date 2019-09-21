import java.util.*;

public class MenuTestDrive {
	public static void main(String args[]) {
		Iterator bakeryMenu = new BakeryMenu();
		System.out.println("\nMenu");
		printMenu(bakeryMenu);
	}
	private static void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			String menuItem = (String)iterator.next();
			System.out.println(menuItem);
		}
	}
	
}
