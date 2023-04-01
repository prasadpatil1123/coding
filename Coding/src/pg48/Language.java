package pg48;

public class Language {

	String name;

	Language() {
		System.out.println("Constructor method is Called.");
	}

	Language(String t) {
		name = t;
	}

	void setName(String t) {
		name = t;
	}

	void getName() {
		System.out.println(" Language is " + name);
	}

	public static void main(String[] args) {

		Language python = new Language();
		Language java = new Language("C++");

		python.setName("Java");
		python.getName();
		java.getName();
	}

}
