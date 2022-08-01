package br.com.likwi.employeedemo.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;
    @NotNull
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void updateProperty(Employee employee) {
        this.name = employee.getName();
        this.role = employee.getRole();
    }
}
