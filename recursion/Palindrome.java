package datastructures.recursion;

public class Palindrome {
	String sentence;

	public Palindrome(String sentence) {
		this.sentence = sentence;
	}

	public boolean checkPalindrome() {
		if ( this.sentence.length() == 0 || this.sentence.length() == 1) 
			return true;
		else {
			char first = Character.toLowerCase(sentence.charAt(0));
			char last = Character.toLowerCase(this.sentence.charAt(this.sentence.length()-1));
			if (Character.isLetter(first) && Character.isLetter(last)) {
				if (first == last) {
					return new Palindrome(this.sentence.substring(1,this.sentence.length() -1)).checkPalindrome();
				}
				else
					return false;
			}
			else if (!Character.isLetter(first))
				return new Palindrome(this.sentence.substring(1)).checkPalindrome();
			else
				return new Palindrome(this.sentence.substring(0, this.sentence.length() - 1)).checkPalindrome();
		}
	}
	public boolean iterativeRecursion() {
		this.sentence =this.sentence.replaceAll("[^a-zA-Z]","").toLowerCase();
		boolean palindrome = true;
		for(int i = 0; i < this.sentence.length(); i++) {
			if (this.sentence.charAt(i) != this.sentence.charAt(this.sentence.length() -i - 1))
				return false;
		}
		return palindrome;
	}
	
	public static void main(String[] args)
	      {
	          Palindrome s1 = new Palindrome("Madam, I'm Adam!");
	          System.out.println(s1.iterativeRecursion());
	          System.out.println(s1.checkPalindrome());
	          System.out.println("Expected: true");
	          Palindrome s2 = new Palindrome("Sir, I'm Eve!");
	          System.out.println(s2.checkPalindrome());
	         System.out.println("Expected: false");
	      }

}
