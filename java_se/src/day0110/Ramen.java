package day0110;

public class Ramen {
	private String nuguri;
	private String sinRamen;
	private String anSungTangMen;
	
	public Ramen() {}
	
	public Ramen(String nuguri, String sinRamen, String anSungTangMen) {
		this.nuguri = nuguri;
		this.sinRamen = sinRamen;
		this.anSungTangMen = anSungTangMen;
	}


	//setter
	public void setNuguri(String ramen) {
		this.nuguri = ramen;
	}
	public void setSinRamen(String ramen) {
		this.sinRamen = ramen;
	}
	public void setAnSungTangMen(String ramen) {
		this.anSungTangMen = ramen;
	}
	
	//getter
	public String getNuguri() {
		return nuguri;
	}
	public String getSinRamen() {
		return sinRamen;
	}
	public String getAnSungTangMen() {
		return anSungTangMen;
	}
	
	public static void main(String[] args) {
		Ramen ramen = new Ramen("너구리", "신라면", "안성탕면");
		System.out.println(ramen.nuguri + " " + ramen.sinRamen + " " + ramen.anSungTangMen);
	}
	
	
}
