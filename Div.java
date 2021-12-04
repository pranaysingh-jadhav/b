//Divisible by 3 and 7 or not
class Div 
{
	public static void main(String[] args) 
	{
		int a = 9;
		System.out.println(a%3==0 && a%7==0 ? a+ " is divisible by 3 and 7 " :  a%7==0 ? a+ "is divisible by 7" : a%3==0 ? a+ " is  divisible by 3" : a+ " not divisible by 3 " );
	}
}