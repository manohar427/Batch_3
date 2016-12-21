class MyClassName {

	public static void main(String args[]) {

		int x = 10;
		int y = 20;
		String name = "Xyz";

		System.out.println("Hi to All 1");
		System.out.println("Hi to All 2");
		System.out.println("Hi to All 3");
		System.out.println("Hi to All 4");
		System.out.println(x);
		
		MyClassName xxx = new MyClassName();
		int results = xxx.add(100,200);
		
		System.out.println("Results:"+results);
		
	}
	
	 int add(int a,int b)
	{
	   return a+b;
	}
}
