package learningOOP;

public class PlayersComputer {
	
	private String gpu;
	private String cpu;
	private String brand;
	private int ramMemory;
	
	
	
	public String getGpu() {
		return gpu;
	}
	
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		
		this.brand = brand;
	}
	
	
	public int getRamMemory() {
		return ramMemory;
	}
	public void setRamMemory(int ramMemory) {
		this.ramMemory = ramMemory;
	}




	@Override
	public String toString() {
		return "PlayersComputer [gpu=" + gpu + ", cpu=" + cpu + ", brand=" + brand + ", ramMemory=" + ramMemory
				+ ", getGpu()=" + getGpu() + ", getCpu()=" + getCpu() + ", getBrand()=" + getBrand()
				+ ", getRamMemory()=" + getRamMemory() + "]"; 
	}
	
	
	

}
