package lesson2.labs.prob4;

public class StudentSectionFactory {
	Student student;
	Section section;

	public Section createSection(int secNum, String courseName) {
		section = new Section();
		section.sectionNumber = secNum;
		section.courseName = courseName;
		return section;
	}
	public Student createStudent(String id, String name) {
		student = new Student();
		student.id = id;
		student.name = name;
		return student;
	}
	public void newTranscriptEntry(Student s, Section sect, String grade) {
		TranscriptEntry tanscriptEntry = new TranscriptEntry();
		tanscriptEntry.student = s;
		tanscriptEntry.section = sect;
		tanscriptEntry.grade = grade;
		s.grades.add(tanscriptEntry);
		sect.gradeSheet.add(tanscriptEntry);
		}
}
