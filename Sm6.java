//smallest of 6 number
class Sm6 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 20, c = 11, d = 40, e = 70, f = 100;
		System.out.println(a<b && a<c && a<d && a<e && a<f ? a+" is smaller" : b<c && b<d && b<e && b<f ? b+" is smaller" : c<d && c<e && c<f ? c+" is smaller"
			: d<e && d<f ? d+" is smaller" : e<f ? e+" is smaller" : f+ " is smaller" );
	}
}
