package aula;

public class aviaotest {
	public static void main(String[] args) {
		System.out.println("Aviao One");
		aviao c = new aviao(0.0,true);
		System.out.println(c.getestacionado());
		c.setestacionado(false);
		c.acelerador();
		c.acelerador();
		System.out.println(c.getemmovimento());
		
		System.out.println("Aviao Two");
		aviao c2 = new aviao(10.0,false);
		c2.getemmovimento();
		c2.setestacionado(true);
		System.out.println(c2.getestacionado());
	}
}