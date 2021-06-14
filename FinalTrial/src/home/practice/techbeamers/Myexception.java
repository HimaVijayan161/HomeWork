package home.practice.techbeamers;

class Myexception extends Exception {

	int detail;
	Myexception(int a) {
        detail = a;
	}

	public String toString() {
		return "detail";
	}
}