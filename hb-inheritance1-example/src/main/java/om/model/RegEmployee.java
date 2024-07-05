package om.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name="RegEmployee")
@AttributeOverride(name="id",column=@Column(name="id"))
@AttributeOverride(name="name",column=@Column(name="name"))

public class RegEmployee extends Employee{
	private int salary;
	private int bonus;
	public RegEmployee(int id, String name, int salary, int bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public RegEmployee(String name, int salary, int bonus) {
		// TODO Auto-generated constructor stub
		super(name);
		this.salary=salary;
		this.bonus=bonus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	

}
