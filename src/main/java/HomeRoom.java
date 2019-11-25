import java.util.ArrayList;

public class HomeRoom {

	public String teacherName;
	public int amountOfStudents;
	public String homeRoomName;
	public ArrayList<Student> listOfStudents;


	public HomeRoom(String teacherName, int amountOfStudents, String homeRoomName, ArrayList<Student> listOfStudents) {
		this.teacherName = teacherName;
		this.amountOfStudents = amountOfStudents;
		this.homeRoomName = homeRoomName;
		this.listOfStudents = listOfStudents;
	}

	public String getTeacherName(){
		return this.teacherName;

	}

	public int getNumofStudents(){
		return this.amountOfStudents;
	}

	public void changeTeacher(String newTeacher) {
		this.teacherName = newTeacher;
	}


}
