import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p[] = new Person[2]; 
//		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
//		
//		for (int i = 0; i < p.length; i++) {
//			p[i] = new Person();
//			System.out.print("Please enter your name: ");
//			String name = sc.nextLine(); 
//			System.out.print("Please enter your surname: ");
//			String surname = sc.nextLine();
//			System.out.print("Please enter your TCK number: ");
//			int tckno = sc.nextInt(); 
//			
//			double myGrade[] = new double [p[i].grade.length];
//			System.out.print("Please enter your midterm grades: "); 
//			myGrade[0] = sc.nextDouble(); 
//			
//			System.out.println("Lab project grade is generated randomly");
//			myGrade[1] = rand.nextDouble() * 100; 
//			
//			System.out.print("Enter your final grades: "); 
//			myGrade[2] = sc.nextDouble(); 
//			
//			sc.nextLine(); 
//			
//			p[i].setName(name);
//			p[i].surname = surname; 
//			p[i].TCKNo = tckno; 
//			p[i].setGrade(myGrade); 
//			
//			try {
//				p[i].writeFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		}
//
//	}
		int myArray[][] = new int[3][5];
		System.out.println(myArray.length + " " + myArray[0].length); 
		System.out.println("-------------------------------------------------"); 
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++)
			{
				myArray[i][j] = rand.nextInt(100); 
				System.out.print(myArray[i][j] + "\t"); 
			
			}
			
			System.out.println();
			
		}

	}

}
