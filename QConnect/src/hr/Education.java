package hr;

import java.util.Comparator;

public class Education {
	int id;
	String qual;
	String college;
	String university;
	String stream;
	int yop;
	double cgpa;

	// 10 & 12th
	public Education(String qual, String college, String university, int yop, double cgpa) {
		super();
		this.qual = qual;
		this.college = college;
		this.university = university;
		this.yop = yop;
		this.cgpa = cgpa;
	}

	// After 12th
	public Education(String qual, String college, String university, String stream, int yop, double cgpa) {
		super();
		this.qual = qual;
		this.college = college;
		this.university = university;
		this.stream = stream;
		this.yop = yop;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Education [college=" + college + ", university=" + university + ", stream=" + stream + ", yop=" + yop
				+ ", cgpa=" + cgpa + "]";
	}

}

class SortByID implements Comparator<Education> {

	@Override
	public int compare(Education o1, Education o2) {
		if (o1.id < o2.id)
			return 1;
		else if (o1.id > o2.id)
			return -1;
		else
			return 0;
	}

}
