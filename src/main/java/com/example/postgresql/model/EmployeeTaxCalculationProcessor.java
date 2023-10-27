package com.example.postgresql.model;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

/**
 * The Class EmployeeTaxCalculationProcessor.
 */
@Component
public class EmployeeTaxCalculationProcessor extends AbstractItemProcessor<EmployeeDetail, EmployeeTaxDetail> {

  /**
   * Execute process.
   *
   * @param item the item
   * @return the employee tax detail
   * @throws Exception the exception
   */
  @Override
  protected EmployeeTaxDetail executeProcess(EmployeeDetail item) throws Exception {
    EmployeeTaxDetail employeeTaxDetail = new EmployeeTaxDetail();
    employeeTaxDetail.setEmpId(item.getEmpId());
    employeeTaxDetail.setTaxAmount((long) (item.getEmpSalary() * .1));
    if(item.getEmpId().endsWith("2"))
    {
    	TimeUnit.SECONDS.sleep(5);
    }
    return employeeTaxDetail;
  }

}
