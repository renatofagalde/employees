package br.com.likwi.employeedemo.dao;

import br.com.likwi.employeedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
