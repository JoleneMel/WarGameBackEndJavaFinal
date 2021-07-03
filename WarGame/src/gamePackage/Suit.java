package gamePackage;

public enum Suit {
	//"[" to make more card like 
	DIAMOND("["+"\u2666 "), CLUB("["+"\u2663 "), SPADE("["+"\u2660 "), HEART("["+"\u2665 ");
//https://eclipsesource.com/blogs/2013/02/21/pro-tip-unicode-characters-in-the-eclipse-console/
//how I got the icons to print out on console by using the link above to help
	private String label;
	Suit(String label) {
		this.label = label;
	}

	public String getLabel() {
		return (label);
	}
}
