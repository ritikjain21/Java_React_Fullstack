package ritik.learning.ems_backend.mapper;

import ritik.learning.ems_backend.dto.EmployeeDto;
import ritik.learning.ems_backend.entity.Employee;

public class EmployeeMapper {
    //this class is use to map employee dto to employee entity and vice versa

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
