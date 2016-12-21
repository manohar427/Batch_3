class ConstructorDemo {
	
	/*static int age = 21;
	String all[] = {"ahah","askjask"};
	String name = "pqr";*/
	public static void main(String[] args) {
		/*Student s = new Student();
		Student s1 = new Student("PQR",age);
		s1.displayName("xyz");*/
		
	/*	AdvancedStudent adst = new AdvancedStudent();
		
		adst.address = "My address";
		adst.nm = "My name";
		adst.age = 12;
		adst.displayName("TW");*/
		
		AdvancedStudent.displayAddress("PQR");
		
		
	}
}

class Student {
	
	String nm;
	int age;
	
	void displayName(String name) {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	Student(){
	System.out.println("Default contr");
	}
	
	Student(String name,int a){
		nm=name;
		age = a;
		System.out.println("I am from contr name:"+name);
	}
}

class AdvancedStudent extends Student
{
	static String address;
	
	void displayName(String name) {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
	 AdvancedStudent() {
		 
		 System.out.println("I am from AdvancedStudent Default Cont");
	}
	 
	static  void displayAddress(String add){
		 System.out.println("Address:"+add);
	 }
}