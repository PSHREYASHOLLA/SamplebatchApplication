package com.example.postgresql.model;

import org.springframework.stereotype.Component;

/**
 * The Class EmployeeTaxCalculationProcessor.
 */
@Component
public class EmployeeTaxCalculationProcessor extends AbstractItemProcessor<EmployeeDetail, EmployeeTaxDetail> {
	
	private static int counter=1;

  /**
   * Execute process.
   *
   * @param item the item
   * @return the employee tax detail
   * @throws Exception the exception
   */
  @Override
  protected EmployeeTaxDetail executeProcess(EmployeeDetail item) throws Exception {
	  System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(item.getEmpId());
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");  
	  
    EmployeeTaxDetail employeeTaxDetail = new EmployeeTaxDetail();
    employeeTaxDetail.setEmpId(item.getEmpId());
    employeeTaxDetail.setTaxAmount((long) (item.getEmpSalary() * .1));
    if(item.getEmpId().equals("emp0032"))
    {
    	if(counter==1)
    	{
    		counter++;
    		throw new Exception();
    	}
    }
    return employeeTaxDetail;
  }

}
