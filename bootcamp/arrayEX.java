public class arrayEX {
	public static void main(String[] args) {
	
	int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};
	
		for (int i = 0; i < numbers.length; i++) {
			
             int absoluteDifference = (numbers[i] - numbers[i++]);

		if (absoluteDifference <= 1); {
			Print.out.systemln("Those are the nearest neighbors");
	}	return;		
		}
		else 	
			Print.out.systemln("Those aren´t the nearest neighbor");




}

