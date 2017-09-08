package in.jigs.employee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IDCEMPLOYEES")
public class Employee implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	@Id
	@Column(name="EMPLOYEE_NO") private int code;
	@Column(name="EMPLOYEE_NAME")private String name;
	@Column(name="EMPLOYEE_LOGINID") private String loginID;
	@Column(name="EMPLOYEE_PASSWORD")
	private String password;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
