package lezioni.ereditarietaEinterfacce.diamondProblem;

interface SolistaRock extends Solista {

	default void eseguiAssolo() {
		System.out.println("do re mi fa sol la si rock!!");
	}
}
