
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
	 * @param textToAppend Le texte à ajouter.
	 */
	void appendText(String textToAppend);
	
	/**
	 * Justifie le texte du buffer et retourne le résultat.
	 * @return Le texte du buffer "justifié" (Ajout de passages à la ligne afin de respecter une largeur maximum donnée).
	 */
	String justifyText();
}
