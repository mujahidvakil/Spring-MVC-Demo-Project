package com.demo.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
implements ConstraintValidator<CourceCode, String> {
	public String courcePrefix;
	
    @Override
	public void initialize(CourceCode theCourceCode) {
    	courcePrefix=theCourceCode.value();
	}

	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		Boolean result;
		if(theCode!=null) {
			result=theCode.startsWith(courcePrefix);
		}else {
			return true;
		}
		return result;
	}


}
