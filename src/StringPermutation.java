
public class StringPermutation {

	public static void permutation(String input,String prefix){
		if(input.length()==0){
			System.out.println(prefix);
		}else{
			for(int i=0;i<input.length();i++){
				StringBuilder sb = new StringBuilder(input);
				Character c = sb.charAt(i);
				sb.deleteCharAt(i);
				permutation(sb.toString(), prefix+c);
			}
		}
	}

	public static void main(String[] args) {
		permutation("abcd", "");
	}

}
