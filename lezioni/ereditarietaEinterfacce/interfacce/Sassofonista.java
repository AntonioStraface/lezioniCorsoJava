package lezioni.ereditarietaEinterfacce.interfacce;

 interface Sassofonista {
	 
	 default void suonoIlSassofono() {
		 System.out.println("so suonare il sax");
	 }
}
