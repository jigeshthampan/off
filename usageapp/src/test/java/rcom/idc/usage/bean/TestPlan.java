package rcom.idc.usage.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestPlan {
	@Test
	public void planIDValidTest() {
		Plan plan = new DTPlan();
		plan.setId(1);
		
		assertEquals("Plan id is being set",1,plan.getId());
	}
}
