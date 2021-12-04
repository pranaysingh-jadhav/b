//larger of 5
class  Large5
{
	public static void main(String[] args) 
	{
		int a = 4;
		int b = 67;
		int c = 10;
		int d = 30;
		int e = 450;

		System.out.println(a>b&&a>c&&a>d&&a>e? a+" is large" : b>c&&b>d&&b>e ? b+" is larger" : c>d&&c>e? c+ " is larger": d>e ? d+ " is greater" : e+ " is greater");
	}
}
