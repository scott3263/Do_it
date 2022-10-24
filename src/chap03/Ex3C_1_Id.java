package chap03;

class Id{
	private static int counter = 0;
	private int id;
	
	public Id() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getCounter() {
		return counter;
	}
}

public class Ex3C_1_Id {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Id a = new Id();
	Id b = new Id();
	
	System.out.println("a.Id=" + a.getId());
	System.out.println("b.Id=" + b.getId());
	
	System.out.println("counter=" + Id.getCounter());
	
	}

}
