/**
 * 
 */
package com.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pack.dto.RegistrationDTO;
import com.pack.service.CustomerService;

/**
 * @author LENOVO
 *
 */
public class TestCustomerService {
    private static CustomerService service;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service=new CustomerService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service=null;
	}

	@Test
	public void testRegisterCustomerValid() {
		RegistrationDTO dto=new RegistrationDTO();
		dto.setFirstName("Gary");
		dto.setLastName("Smith");
		dto.setEmailId("gary@yahoo.com");
		dto.setAadharId("123456789986");
		dto.setPanNumber("1253648");
		assertTrue(service.registerCustomerId(dto));
	}
	@Test
	public void testRegisterCustomerInValid() {
		RegistrationDTO dto=new RegistrationDTO();
		dto.setFirstName("John");
		dto.setLastName("Smith");
		dto.setEmailId("john@gmail.com");
		dto.setAadharId("98886985698875");
		dto.setPanNumber("1253648");
		assertFalse(service.registerCustomerId(dto));
	}

}
