package Last;

public class FountainPen extends Ballpen{
	
	private int amount; // 남은 량
	   private String color; // 볼펜의 색
	   public int getAmount() { return amount; }
	   public void setAmount (int amount) { this.amount = amount; }
	   public String getColor() { return color; }
	   public void setColor(String color) { this.color = color; }
	   public void refill (int n) { setAmount(n); }
}
