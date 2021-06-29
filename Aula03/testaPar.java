package Aula03;

public class testaPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// objetos genéricos
		Par <String, Long> p1 = new Par ("Manno", 201903295);
		Par <Float, Float> p2 = new Par (189155, 7489874);
		Par <Integer, Integer> p3 = new Par (815158, 201903295);
		Par <Short, Long> p4 = new Par (500, 201903295);
		Par <Byte, Long> p5 = new Par (15, 201903295);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}

}
