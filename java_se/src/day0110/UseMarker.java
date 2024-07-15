package day0110;

public class UseMarker {

	public static void main(String[] args) {
		MakerPen blue = new MakerPen();
		blue.setColor("파란");
		String result = blue.write("오밝수");
		System.out.println(result);
		
		MakerPen blue2 = new MakerPen(1,2,"blue");
		System.out.println();
		
	}

}
