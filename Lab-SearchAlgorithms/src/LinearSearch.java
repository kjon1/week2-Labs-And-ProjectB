
public class LinearSearch {
	
	public static void main(String[] args) {
		//create dummy date for our method
		char letter ='a';
		
		char [] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
				'n', 'o', 'p'};
		
		//call methods here
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.findIndex(letter, letters));
		
		}
	
	//create first method here
	public static int findIndex(char target, char[]data) {
		if (data == null)return -1;
		
		int result = -1;
		
		//loop thru data
		for (int i=0; i<data.length; i++) {
			char temp = data[i];
			
			//test current element against target
			if (temp==target) {
				return i;
			}
			
		}
		
		return result;
	}
	}


