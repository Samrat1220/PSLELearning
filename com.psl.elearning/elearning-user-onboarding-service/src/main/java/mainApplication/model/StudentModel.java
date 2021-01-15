package mainApplication.model;

import javax.persistence.Entity;

@Entity
public class StudentModel {

	private int id;
	private String Stu_name;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStu_name() {
		return Stu_name;
	}
	public void setStu_name(String stu_name) {
		Stu_name = stu_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", Stu_name=" + Stu_name + ", email=" + email + "]";
	}
	
	
	
	
}
