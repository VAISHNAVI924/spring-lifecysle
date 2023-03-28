package springlifecycle;

public class student {
	private int id;
	private String name;
	public void hi() {
		System.out.println("initializing the bean obj");
	}
	public void bye() {
		System.out.println("destorying the bean obj");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	

}
