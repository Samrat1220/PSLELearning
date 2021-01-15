package mainApplication.model;

import javax.persistence.Entity;

@Entity
public class InstructorModel {

	private int id;
	private String Inst_name;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInst_name() {
		return Inst_name;
	}
	public void setInst_name(String inst_name) {
		Inst_name = inst_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "InstructorModel [id=" + id + ", Inst_name=" + Inst_name + ", email=" + email + "]";
	}
	
	
	
	
}
