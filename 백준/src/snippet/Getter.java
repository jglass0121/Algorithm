package snippet;

public class Getter {
	private String name;
	private String check;
	private String visit;
//	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getVisit() {
		return visit;
	}
	public void setVisit(String visit) {
		this.visit = visit;
	}
	public static void main(String[] args) {
		Getter g =new Getter();
		g.setName("Df");
		System.out.println(g.getName());
	}
}
