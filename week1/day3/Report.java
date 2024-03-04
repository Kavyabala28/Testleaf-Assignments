package week1.day3;

//Assignment - 4
public class Report {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentName = "Mahima";
		s.rollNo = 20;
		s.collegeName = "Hindusthan college of arts & Science";
		s.markScored = 470;
		s.cgpa = 8.2f;
		
		System.out.println("Student Name --> "+s.studentName);
		System.out.println("Roll No --> " +s.rollNo);
		System.out.println("College Name --> " +s.collegeName);
		System.out.println("Marks Scored --> " +s.markScored);
		System.out.println("CGPA --> " +s.cgpa);
	}

}
