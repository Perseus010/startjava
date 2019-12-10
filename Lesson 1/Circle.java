public class Circle {

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int counter = 6;
		while (counter >= -6) {
			System.out.print(counter + " ");
			counter -= 2;
		}

		System.out.println();

		counter = 10;
		int sum = 0;
		do {
			if (counter % 2 == 1) {
			sum += counter;
			System.out.print(sum + " ");}
			counter++;
		} while (counter <= 20);		
	}
}