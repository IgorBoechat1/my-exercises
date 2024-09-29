public class notstring {
	public static void main(String[] args) {
		String word = "semicolon";
		String newWord = word.substring(0,3);

		if (newWord == "not") {
		System.out.println(word);
		}
	 	else 
		System.out.println("not" + word);
	}
}
