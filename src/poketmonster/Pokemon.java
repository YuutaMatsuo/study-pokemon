package poketmonster;

public class Pokemon {
	private String name;

	public Pokemon(String name) {
		this.name = name;
	}
	
	// toStringメソッドをオーバーライド
	public String toString() {
		return this.name;
	}
}
