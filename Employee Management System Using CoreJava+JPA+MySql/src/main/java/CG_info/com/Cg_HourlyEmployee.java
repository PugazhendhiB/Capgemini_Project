package CG_info.com;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("hourly")
public class Cg_HourlyEmployee extends Cg_Employee {

	private double hourlyRate;

	private int maxHoursPerDay;

	public Cg_HourlyEmployee(int empno, String name, double hourlyRate, int maxHoursPerDay) {
		super(empno, name);
		this.hourlyRate = hourlyRate;
		this.maxHoursPerDay = maxHoursPerDay;
	}

	public Cg_HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "hourly_rate")
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Column(name = "max_hours_per_day")
	public int getMaxHoursPerDay() {
		return maxHoursPerDay;
	}

	public void setMaxHoursPerDay(int maxHoursPerDay) {
		this.maxHoursPerDay = maxHoursPerDay;
	}

}
