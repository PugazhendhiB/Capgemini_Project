package CG_info.com;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("salaried")
public class Cg_SalariedEmployee extends Cg_Employee {

	private double annualSalary;

	public Cg_SalariedEmployee(int empno, String name, double annualSalary) {
		super(empno, name);
		this.annualSalary = annualSalary;
	}

	public Cg_SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "annual_salary")
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

}
