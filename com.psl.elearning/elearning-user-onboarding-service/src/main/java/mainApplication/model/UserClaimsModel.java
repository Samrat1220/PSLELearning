package mainApplication.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserClaimsModel {


	@Id
	private String sub;
	
	private String email;
	private String aud;
	private Long auth_time;
	private Long exp;
	
	
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAud() {
		return aud;
	}
	public void setAud(String aud) {
		this.aud = aud;
	}
	public Long getAuth_time() {
		return auth_time;
	}
	public void setAuth_time(Long auth_time) {
		this.auth_time = auth_time;
	}
	public Long getExp() {
		return exp;
	}
	public void setExp(Long exp) {
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return "UserClaimsModel [sub=" + sub + ", email=" + email + ", aud=" + aud + ", auth_time=" + auth_time
				+ ", exp=" + exp + "]";
	}

	
	
	
	
	
}
