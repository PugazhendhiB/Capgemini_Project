package CG_info.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cgperclass")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
class Cg_Employee {

	@Id
	@Column(name = "testempno")
	private int empno;
	@Column(name = "testname")
	private String name;

}
