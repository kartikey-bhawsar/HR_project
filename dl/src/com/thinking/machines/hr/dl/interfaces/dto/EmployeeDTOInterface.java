package com.thinking.machines.hr.dl.interfaces.dto;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

public interface EmployeeDTOInterface extends Comparable<EmployeeDTOInterface>,Serializable {
    public void setEmployeeId(String EmployeeId);
    public String getEmployeeId();
    public void setName(String name);
    public String getName();
    public void setDesignationCode(int designationCode);
    public int getDesignationCode();
    public void setDateOfBirth(Date dateOfBirth);
    public Date getDateOfBirth();
    public void setGender(char gender);
    public char getGender();
    public void setIsIndian(boolean isIndian);
    public boolean isIndian();
    public void setBasicSalary(BigDecimal basicSalary);
    public BigDecimal getBasicSalary();
    public void setPANNumber(String panNumber);
    public String getPANNumber();
    public void setAadharNumber(String aadharNumber);
    public String getAadharNumber();
}
