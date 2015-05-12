import static org.junit.Assert.*;

import org.junit.Test;


public class JustifierTest {
	
	@Test
	public void testAppendText(String textToAppend) {
		assertNotNull("Erreur, textToAppend est null !",textToAppend);
		assertTrue("Erreur, Chaine de caractére vide!", !textToAppend.isEmpty());
		assertTrue("Erreur, Chaine de caractére commence par un ou plusieurs espace(s)!", !textToAppend.startsWith(" "));
		assertTrue("Erreur, Retour a la ligne interdit !", !textToAppend.contains("\n") && !textToAppend.contains("\r"));
	}

	@Test
	public void testJustifyText(String[] justifiedArrayText, int nbChar) {
		assertNotNull("Erreur, justifiedArrayText est null !",justifiedArrayText);
		assertNotNull("Erreur, justifiedArrayText est null !",nbChar);
		
		for (String it : justifiedArrayText) {
			assertTrue("Erreur, Chaine de caractére vide!", !it.isEmpty());
			assertTrue("Erreur, mot plus grand que nbChar ( valeur de justification )",it.length()<=nbChar);
		}	
		
	}
}
