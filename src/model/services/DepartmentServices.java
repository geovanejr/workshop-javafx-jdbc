package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentServices {

	public List<Department> findAll() {
		
		List<Department> list = new ArrayList<>();
		
		list.add(new Department(1, "Livros"));
		list.add(new Department(2, "Cama, Mesa & Banho"));
		list.add(new Department(3, "Eletr�nicos"));
		list.add(new Department(4, "Inform�tica"));

		return list;
	}
}
