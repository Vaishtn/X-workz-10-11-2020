class Calculator3{
	public static int add(int a,int b){
	int sum=0;
	sum=a+b;
	System.out.println("The sum is:" + sum);
	return sum;
	}
	
	public static int division(int a,int b){
	int div=0;
	div=a/b;
	System.out.println("The div is:" + div);
	return div;
	}
	
	public static int multiply(int a,int b){
	int multi=0;
	multi=a*b;
	System.out.println("The multi is:" + multi);
	return multi;
	}
	
	public static int subtract(int a,int b){
	int sub=0;
	sub=a-b;
	System.out.println("The sub is:" + sub);
	return sub;
	}
	
	public static void main(String args[]){
	Calculator3.add(10,20);
	Calculator3.division(10,20);
	Calculator3.multiply(10,20);
	Calculator3.subtract(10,20);
	
	}
}