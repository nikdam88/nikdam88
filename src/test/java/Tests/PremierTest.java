package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import MyPackage.MonMessage;

public class PremierTest {
	
private MonMessage m=new MonMessage();
private String text;
	
@Before
public void setUp() {
	
text="Nikola";
	
		
}

@Test
public void test1() {
	
assertEquals(text,m.getMonmsg());	
	
	
}


}
