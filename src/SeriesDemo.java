
public class SeriesDemo {
	public static void main(String[] args) {
		int no = 30;
		System.out.println("This is Series Demo ...");
		System.out.println("for loop processing ...");
		for(no = 1; no <= 10; no++) {
			System.out.println("No - " + no);
		}
		
		System.out.println("while loop processing ...");
		no = 1;
		while(no <= 10) {
			System.out.println("no = " + no);
			no ++;
		}
	}
}
