
public class Justifier implements IBaseJustifier{
	
	/**
	 * Constructeur prenant en paramètre un entier définissant 
	 * le nombre de caractères de justification.
	 * 
	 * @param nbChar
	 */
	private int nbChar;
	private String text="";
	private JustifierTest myJustifierTest = new JustifierTest();
	
	public Justifier(int nbChar){
		this.nbChar =nbChar;
	}
	
	/**
	 * Constructeur par défaut justifie à 30 caractères
	 */
	public Justifier(){
		this.nbChar=30;
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
