package prob2A;

public class Student {
	private String name;
	private GradeReport greport;
	
	Student(){
		greport = new GradeReport();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
