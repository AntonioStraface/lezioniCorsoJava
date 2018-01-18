package lezioni.ereditarietaEinterfacce.diamondProblem;

interface SolistaJazz extends Solista {
	
	default void eseguiAssolo() {
		System.out.println("do re mi fa sol la si da jazz!");
	}

}
