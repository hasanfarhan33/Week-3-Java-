import java.io.RandomAccessFile;
import java.io.File;
import java.io.IOException;
public class Person {
	private String name; 
	protected String surname; 
	public int TCKNo; 
	double grade[] = new double[3];
	
	public Person()
	{
		name = "No Name"; 
		surname = "No Surname"; 
		TCKNo = -1; 
		
	}

	public Person(String name, String surname, int tCKNo, double[] grade) {
		
		this.name = name;
		this.surname = surname;
		TCKNo = tCKNo;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getTCKNo() {
		return TCKNo;
	}

	public void setTCKNo(int tCKNo) {
		this.TCKNo = TCKNo;
	}

	public double[] getGrade() {
		return grade;
	}

	public void setGrade(double[] grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", TCKNo=" + TCKNo + "]";
	}
	
	public void writeFile() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile(new File("output.txt"), "rw");
		raf.seek(raf.length()); 
		raf.writeBytes(name + "\t" + surname + "\t" + TCKNo + "\t");
		for (int i = 0; i < grade.length; i++) 
		{
			raf.writeBytes(grade[i] + "\t");
			
		}
		
		raf.writeBytes("\n");
		raf.close(); 
	}
	

	
	

}
