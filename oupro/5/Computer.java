public class Computer{
	private String os;
	private int ram;
	private int disk;
	
	public Computer(){
		this.os = "UNKNOWN";
		this.ram = 8;
		this.disk = 512;
	}

	public Computer(String os){
		this();
		this.os = os;
	}

	public Computer(String os, int ram){
		this(os);
		this.ram = ram;
	}

	public String getOS(){
		return os;
	}

	public int getRam(){
		return ram;
		
	}

	public int getDisk(){
		return disk;
	}
}
