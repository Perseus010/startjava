// Условный оператор if
public class ConditionalStatement {

	public static void main(String[] args) {

		int myAge = 40;
		var gender = 'M'; // 'm' - male, 'f' - female
		double height = 1.85;
		var firstLetterName = 'A';

		if (myAge > 20) {
			System.out.println("Мой возраст свыше 20 лет");
		}

		if (gender == 'M') {
			System.out.println("Перед Вами лицо мужского пола");
		}

		if (gender != 'M') {
			System.out.println("Перед Вами лицо женского пола");
		}

		if (height < 1.80) {
			System.out.println("Ваш рост меньше 180 см");
		} else {
			System.out.println("Ваш рост свыше 180 см");
		}

		if (firstLetterName == 'M') {
			System.out.println("Ваше имя начинается на букву M");
		} else if(firstLetterName == 'I') {
			System.out.println("Ваше имя начинается на букву I");
		} else {
			System.out.println("Ваше имя начинается не на букву M или I");
		}

	}

}