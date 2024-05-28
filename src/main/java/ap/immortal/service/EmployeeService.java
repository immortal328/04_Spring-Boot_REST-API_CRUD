package ap.immortal.service;

import org.springframework.stereotype.Service;

import ap.immortal.repository.EmployeeRepository;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class EmployeeService {
	private final EmployeeRepository employeeRepository;

}
