package rcom.idc.usage.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rcom.idc.usage.helper.PlanType;


public class TestPlan {
	@Test
	public void planIDValidTest() {
		Plan plan = new DTPlan();
		plan.setId(1);
		
		assertEquals("Plan id is being set",1,plan.getId());
	}
	
	@Test
	public void planTypeTest() {
		Plan plan = new DTPlan();
		plan.setType(PlanType.STANDARD);
		assertEquals("Plan Type is ",PlanType.STANDARD,plan.getType());
	}
}
