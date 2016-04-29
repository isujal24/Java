class FooCorporation {
	public static void wages(int x) {
		if (x > 40) {
			double wages = (40 * 8 + (x - 40) * 8 * 1.5);
			System.out.println("Pay is: " + wages);
		} else if (x > 60) {
			double wages = (40 * 8 + (x - 40) * 8 * 1.5);
			System.out.println("System overload! You cannot work more than 60 hours");
			System.out.println("But your pau is: " + wages);
		} else {
			double wages = x * 8;
			System.out.println("Pay is: " + wages);
		}
	}

	public static void main(String[] arguments) {
		wages(45);
		wages(67);
		wages(27);
	}
}
