import java.util.Scanner;
public class Temporary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[] myList = {1.2, 2.3, 3.3, 4.4};
	
		for (int i = 0; i < myList.length; i++) {
			int index = (int) (Math.random() * myList.length);
			System.out.println((int)(Math.random() * myList.length));
			double temp = myList[i];
			myList[i] = myList[index];
			myList[index] = temp;
			
		}

		}
		
	}
