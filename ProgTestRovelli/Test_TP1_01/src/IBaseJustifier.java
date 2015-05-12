
/**
 * Interface de base des classes de justification.
 * @author Thomas MERLY
 *
 */
public interface IBaseJustifier {
	
	/**
	 * Justifie et affiche dans la console le texte contenu en buffer.
	 */
	void displayText();
	
	/**
	 * Ajoute le texte fourni au buffer.
	 * @param textToAppend Le texte � ajouter.
	 */
	void appendText(String textToAppend);
	
	/**
	 * Justifie le texte du buffer et retourne le r�sultat.
	 * @return Le texte du buffer "justifi�" (Ajout de passages � la ligne afin de respecter une largeur maximum donn�e).
	 */
	String justifyText();
}
