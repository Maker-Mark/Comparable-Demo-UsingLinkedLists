/**
 * A boring color object with a string.
 * @author Maker-Mark
 */
public class Color {
	//I'm just a private data member that can be accessed and mutated by my methods!
	private String objColor;
	
	public Color(String c) {
		this.objColor = c;
	}

	public String getObjColor() {
		return objColor;
	}

	public void setObjColor(String objColor) {
		this.objColor = objColor;
	}

}
