package ereditarietaEinterfacce.diamondProblem;

class Musicista implements SolistaJazz, SolistaRock {

	@Override
	public void eseguiAssolo() {
		SolistaJazz.super.eseguiAssolo();
		SolistaRock.super.eseguiAssolo();	
	}

}
