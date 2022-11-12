package randomNumbers;

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {

		int startcounter = 100;
		int n = 0;
		int endCounter = 500;
		int arraysize = endCounter - startcounter;
		int numbers[] = new int[arraysize + 1];
		Random rnum = new Random();
		for (int counter = startcounter; counter <= endCounter; counter++) {
			int c = n++;
			int num = rnum.nextInt(500);
			numbers[c] = num;
			

		}
		int smallest = numbers[0];
		int biggest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > biggest)
				biggest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
		}	
		System.out.println(smallest);
	}
}

