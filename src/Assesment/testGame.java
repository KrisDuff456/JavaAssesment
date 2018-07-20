package Assesment;

import static org.junit.Assert.*;

import org.junit.Test;

public class testGame {
	
	
	@Test
	public void testIntro() {
		assertNotNull(story.intro());
	}
	@Test
	public void testLook(){
		game look = new game();
		assertEquals("look was used",look.lookAction("look"),"look");
	}
	@Test
	public void testdirection() {
		game north = new game();
     	north.directionA("north");
		assertEquals("You went North",north.directionA("north"),"north");
		
	}
	@Test
	public void testStoryA() {
		assertNotNull(story.scenerioA());
	}
	
	@Test
	public void testLocator() {
		game locator = new game();
		locator.tresureFinder();
		assertNotNull(locator.tresureFinder());
		
	}
}

