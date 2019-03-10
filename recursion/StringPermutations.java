package datastructures.recursion;

import java.util.ArrayList;

public class StringPermutations {
	String sentence;
	public StringPermutations(String sentence) {
		this.sentence = sentence;
	}
	ArrayList<String> permute = new ArrayList<>();
	public ArrayList<String> getPermutations(){
		if (sentence.length() <= 1) {
			permute.add(sentence);
			return permute;
		}
		else {
			for(int i=0; i<sentence.length(); i++) {
				ArrayList<String> shortPermute = new StringPermutations(sentence.substring(0,i)+sentence.substring(i+1)).getPermutations();
				for (String s: shortPermute) 
					permute.add(sentence.charAt(i)+s);
			}
		}
		return permute;
		
	}
	
	public static void main(String args[]) {
		StringPermutations sp = new StringPermutations("beat");
		System.out.println(sp.getPermutations());
	}

}
