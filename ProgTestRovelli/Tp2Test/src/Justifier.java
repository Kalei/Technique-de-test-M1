
public class Justifier implements IBaseJustifier{
	
	/**
	 * Constructeur prenant en param�tre un entier d�finissant 
	 * le nombre de caract�res de justification.
	 * 
	 * @param nbChar
	 */
	private int nbChar;
	private String text="";
	private JustifierTest myJustifierTest = new JustifierTest();
	private static final int CHAR_COUNT=1;
	private static final int LINE_COUNT=2;
	private static final int WORD_COUNT=3;
	
	public Justifier(int nbChar){
		this.nbChar =nbChar;
	}
	
	/**
	 * Constructeur par d�faut justifie � 30 caract�res
	 */
	public Justifier(){
		this.nbChar=30;
	}
	
	public int getTextProperty(int sentence){
		int property;
		
		switch (sentence) {
		
			case CHAR_COUNT:
				property=getCharCount();
			break;
				
			case LINE_COUNT:
				property=getLineCount();
			break;
			
			case WORD_COUNT:
				property=getWordCount();
			break;
			
			default:
				property = -1;
			break;
			
		}
		
		return property;
	}

	private static int getCharCount() {
		return CHAR_COUNT;
	}

	private static int getLineCount() {
		return LINE_COUNT;
	}

	private static int getWordCount() {
		return WORD_COUNT;
	}

	@Override
	public void displayText() {
		System.out.println(text);		
	}

	@Override
	public void appendText(String textToAppend) {
		if(text.isEmpty()){
			this.text += textToAppend;
		}
		else{
			this.text += " "+textToAppend;
		}
		myJustifierTest.testAppendText(textToAppend);
	}

	@Override
	public String justifyText() {
		if(!text.isEmpty()){
			if(text.length()>nbChar){
				String[] arrayText=text.split(" ");
				myJustifierTest.testJustifyText(arrayText, nbChar);
				
				String justifiedText="";
				String tmpText="";
				for(int i=0; i<arrayText.length; i++){
					if(tmpText.isEmpty()){
						tmpText=arrayText[i];
					}
					else{
						if((tmpText.length()+arrayText[i].length())<nbChar){
							tmpText += " "+arrayText[i];
						}
						else{
							justifiedText += tmpText+System.getProperty("line.separator");
							tmpText = arrayText[i];
						}
					}
				}			
				return justifiedText;
			}
			return text;
		}
		return null;
	}

	
}
