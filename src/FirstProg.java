
public class FirstProg {
	public static void main(String[] args) {
		int age = 100; // Age of the person
		int code = 300; // Persons's Code
		
		if(age >= 18) {
			System.out.println("Mature");
		} else {
			System.out.println("Minor");
		}
		
		if(code >=0 && code <= 100) {
			System.out.println("Code is between 0 and 100");
		} else {
			System.out.println("Code is out of range");
		}
	}
}
