//smallest of 4
class  Small4
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b= 100;
		int c = 30;
		int d = 1;
		System.out.println(a<b&&a<c&&a<d?a+ "is smallest" : b<c&&b<d? b+ "is smaller" : c<d? c+ "is smaller" : d+ "is smaller");
	}
}
