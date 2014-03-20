package laboration12;

public class Table {
	private String material;
	private int width, depth, height;
	
	public Table(String material, int width, int depth, int height){
		this.material = material;
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	public void setMaterial(String material){
		this.material = material;
	}
	public void setWidth(int width){
		this.width = width;
	}
	
	public void setDepth(int depth){
		this.depth = depth;
	}
	
	public void setHeight(int height){
		this.height = height;
	}

	public String getMaterial(){
		return material;
	}

	public int getWidth(){
		return width;
	}
	
	public int getDepth(){
		return depth;
	}
	
	public int getHeight(){
		return height;
	}
	
	public int size(){
		return width*depth;
	}

	public String toString(){
		return ("Table [ material = "+material+", width = "+width+", depth = "+depth+", height: "+height+"]");
	}
}

