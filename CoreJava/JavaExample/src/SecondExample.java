class SecondExample {
	public static void main(String[] args) {
      A obj = new A();
     
     int results =  obj.add(10,20);
     
     System.out.println("Results:"+results);
     
    int y =  obj.x;
    System.out.println("Y:"+y);
    
	}
}

class A
{
	int x = 100;
	
	int add(int a,int b)
	{
		return (a+b);
	}
}