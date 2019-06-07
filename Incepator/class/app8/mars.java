public class mars{
	private int sum;
	private final int number;
	
	public mars (int x) {
		number =x;
	}
	
	public void add() {
		sum+=number;
	}
	
	public String toString() {
		return String.format("sum = %d\n", sum);
	}
}
