package lezioni.otherclass.enumerator;

enum Coordinate {
	NORD ("N"),
	SUD ("S"),
	OVEST ("W"),
	EST("E");
	
	private final String shortCode;
	
	Coordinate(String code) {
		this.shortCode = code;
	}

	public String getShortCode() {
		return shortCode;
	}
	
}
