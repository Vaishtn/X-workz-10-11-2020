class Calculator1{
	public static void add(){
	int a=10;
	int b=20;
	int sum=0;
	sum=a+b;
	System.out.println("The sum is:" + sum);
	}
	public static void division(){
	int x=10;
	int y=20;
	int div=0;
	div=x/y;
	System.out.println("The div is:" +div);
	}
	public static void multiply(){
	int x=10;
	int y=20;
	int multi=0;
	multi=x*y;
	System.out.println("The multiply is:" +multi);
	}
	public static void subtract(){
	int x=10;
	int y=20;
	int sub=0;
	sub=x-y;
	System.out.println("The subtract is:" +sub);
	}
	
	public static void main(String args[]){
	Calculator1.add();
	Calculator1.division();
	Calculator1.multiply();
	Calculator1.subtract();
	}
}