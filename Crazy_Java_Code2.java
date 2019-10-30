
public class Crazy_Java_Code2 {

	public static void main(String[] args) {
		
		int j = 0;
		for (int i = 0; i < 100; i++) {
			//j = j++; //it only increments it after assigning it so j will always be Zero
			j = ++j; //Now j will first be incremented then assigned
			
			System.out.println(j);
		}

	}

}
