package io.vertx.eye_care;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;

/*
*not implemented yed will touch later
*
*/

@RunWith(VertxUnitRunner.class)
public class AppVerticleTest {
	
	private Vertx vertx;
	
	@Before
	public void setUp(TestContext context) {
		context.assertTrue(true);
	}
	
	@After
	public void tearDown(TestContext context) {
		context.assertTrue(true);
	}
	
	@Test
	public void testServerDeploy(TestContext context) {
		context.assertTrue(true);
	}
}
