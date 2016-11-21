package computing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class Expression2Test {
	Expression2 testExpression;
	
	String[] lalala={"x=2","x=2"};
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJudge() {
	}

	@Test
	public void testWrite() {
		testExpression.write();
	}

	@Test
	public void testSimplify() {
		testExpression.simplify(lalala);
	}

	@Test
	public void testDerivative() {
	}

	@Test
	public void testSet() {
		testExpression.set("x*x+2*y");
		
	}

}
