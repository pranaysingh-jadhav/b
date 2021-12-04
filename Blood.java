// blood donation
class Blood
{
	public static void main(String[] args) 
	{
		String name = "singh";
		int age = 48;
		int weight = 55;
		int actual_age = 18;
		int actual_weight = 60;
		
		if(age >= actual_age && weight >= actual_weight)
		{
			System.out.println(name+ " is eligible donating blood");
		}
		else
		{
			System.out.println(name+ " is not eligible donating blood");
		}
	}
}
