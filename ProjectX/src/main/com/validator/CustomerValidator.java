package main.com.validator;

import main.com.dtos.Customer;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		if (clazz.equals(Customer.class)) {
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object cust, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "name.required");
		Customer customer = (Customer) cust;

		if (customer.getName()!=null && !customer.getName().equals("")&& customer.getName().length() <= 2) {
			errors.rejectValue("name", "name.short");
		}

		ValidationUtils.rejectIfEmpty(errors, "age", "age.required");

		if (customer.getAge() != null
				&& customer.getAge() != ""
				&& (Integer.parseInt((customer.getAge())) <= 17 || Integer
						.parseInt((customer.getAge())) > 120)) {
			errors.rejectValue("age", "age.notValid");
		}

	}

}
