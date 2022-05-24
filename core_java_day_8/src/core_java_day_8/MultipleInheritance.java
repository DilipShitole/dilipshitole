package core_java_day_8;

// how to achive multiple inheritance
interface Student1 {
	void display();
}

interface Student2 {
	void display();

	void display1();
}

class Student3 implements Student2, Student1 {
	void showData() {
	}

	
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Student3 student3 = new Student3();
		student3.display();
	}
}
