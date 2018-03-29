import java.util.Arrays;

public class score {
	String over;

	String runs;
	String ball;

	String total;
	

	
	

	public score(String over,String ball,String runs) {
		
		this.over=over;
		this.ball=ball;
		this.runs=runs;

	}
	
	public String getOver() {
		return over;
	}
	public void setOver(String over) {
		this.over = over;
	}
	public String getRuns() {
		return runs;
	}
	public void setRuns(String runs) {
		this.runs = runs;
	}
	public String getBall() {
		return ball;
	}
	public void setBall(String ball) {
		this.ball = ball;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	public void displayDetails()
	{
		System.out.println("- - - - - Score Sheet - - - - -");
		System.out.println("Over : " +getOver());
		System.out.println("runs : " +getRuns());
		System.out.println("ball :" +getBall());
	}
	
	public String Totalruns()
	{
	    int sum = Arrays.stream(runs.trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .sum();
System.out.println(sum);
	
		return runs;
		
        
    }
		
	}
	
	

