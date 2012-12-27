/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.rest;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import demo.converter.EmployeeConverter;
import demo.model.Employee;

@Path("/hr/")
public class EmployeeResource {

 
 @GET
 @Produces({"application/xml", "application/json"})
 @Path("/employee/{employeeEmail}/") 
 public EmployeeConverter getEmployee( @PathParam ("employeeEmail") String email) {
 //dummy code
 Employee emp = new Employee();
 emp.setEmail(email);
 emp.setFirstName("John");
 emp.setLastName("Doe");
 EmployeeConverter converter = new EmployeeConverter(emp);
 return converter;
 } 
}