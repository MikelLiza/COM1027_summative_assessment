package org.com1027.question1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TenantTest {
	@Test
	public void testTenantName() {
			Tenant m = new Tenant("Mike", "Liza", 18, TenantType.STUDENT);
			assertEquals("Mike Liza", m.toString());	
	}
	@Test
	public void testTenantAge() {
			Tenant m = new Tenant("Mike", "Liza", 18, TenantType.STUDENT);
			assertEquals(18, m.getAge());	
	}
	@Test
	public void testTenant() {
			Tenant m = new Tenant("Mike", "Liza", 18, TenantType.STUDENT);
			assertEquals(TenantType.STUDENT, m.getType());	
	}
	
}
