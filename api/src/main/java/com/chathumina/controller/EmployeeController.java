package com.chathumina.controller;

import com.chathumina.modal.Employee;
import com.chathumina.service.EmployeeService;
import com.chathumina.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;


@Path("/")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GET
    @Path("employee")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee listEmployee() throws IOException {
        Employee employee = employeeService.getEmployee(25);
        return employee;
    }

    @GET
    @Path("test/{Id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> listEmployees(@PathParam("Id") String Id){
        List<Employee> listEmployee = employeeService.getAllEmployees();
        return listEmployee;
    }
}
