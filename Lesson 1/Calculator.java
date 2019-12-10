public class Calculator {
	
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		char operat = '*';
		int result;

		if (operat == '+') {
			result = num1 + num2;
			System.out.println("Сумма значений " + num1 + " и " + num2 + " равна " + result);
		} 
		else if (operat == '-') {
			result = num1 - num2;
			System.out.println("Разность значений " + num1 + " и " + num2 + " равна " + result);
		}
		else if (operat == '*') {
			result = num1 * num2;
			System.out.println("Произведение значений " + num1 + " и " + num2 + " равно " + result);
		}
		else if (operat == '/') {
			result = num1 / num2;
			System.out.println("Частное значения " + num1 + " от " + num2 + " составляет " + result);
		}
		else if (operat == '^') {
			result = 1;
			for (int i = 1; i <= num2; i++) {
				result = result * num1;
			}
			System.out.println("Возведение значения " + num1 + " в степень " + num2 + " равно " + result);			
		}
		else if (operat == '%') {
			result = num1 % num2;
			System.out.println("Остаток от деления значений " + num1 + " и " + num2 + " равен " + result);
		} 
		else {
			System.out.println("Допущена ошибка при вводе опеератора. Попробуйте внести значение вновь");
		}
	}
}