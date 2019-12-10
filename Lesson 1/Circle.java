public class Circle {

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int n = 6;
		while (n >= -6) {
			System.out.print(n + " ");
			n-=2;
		}

		System.out.println();

		int c = 10;
		int sum = 0;
		do {if (c % 2 == 1) {
			sum = sum + c;
			System.out.print(sum + " ");}
			c++;
		} while (c <= 20);		
	}
}