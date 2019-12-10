// Условный оператор if
public class ConditionalStatement {

	public static void main(String[] args) {
		int myAge = 40;
		if (myAge > 20) {
			System.out.println("Мой возраст свыше 20 лет");
		}

		boolean isMan = true;
		if (isMan) {
			System.out.println("Перед Вами лицо мужского пола");
		} 
		if (!isMan) {
			System.out.println("Перед Вами лицо не мужского пола");
		} 

		double height = 1.85;
		if (height < 1.80) {
			System.out.println("Ваш рост меньше 180 см");
		} else {
			System.out.println("Ваш рост свыше 180 см");
		}

		char firstLetterName = 'A';
		if (firstLetterName == 'M') {
			System.out.println("Ваше имя начинается на букву M");
		} else if(firstLetterName == 'I') {
			System.out.println("Ваше имя начинается на букву I");
		} else {
			System.out.println("Ваше имя начинается не на букву M или I");
		}
	}
}