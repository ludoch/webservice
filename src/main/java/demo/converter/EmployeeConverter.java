/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.converter;

import demo.model.Employee;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
public class EmployeeConverter {
 private Employee entity = null;
 public EmployeeConverter() {
 entity = new Employee();
 }

 public EmployeeConverter(Employee entity) {
 this.entity = entity;
 }

 @XmlElement
 public String getFirstName() {
 return entity.getFirstName();
 }

 @XmlElement
 public String getLastName() {
 return entity.getLastName();
 }

 @XmlElement
 public Date getHireDate() {
 return entity.getHireDate();
 }

 @XmlElement
 public String getEmail() {
 return entity.getEmail();
 }

 public Employee getEmployee() {
 return entity;
 }

 public void setFirstName(String firstName) {
 entity.setFirstName(firstName);
 }

 public void setHireDate(Date hireDate) {
 entity.setHireDate(hireDate);
 }

 public void setLastName(String email) {
 entity.setEmail(email);
 }

 public void setEmail(String lastName) {
 entity.setLastName(lastName);
 }
}