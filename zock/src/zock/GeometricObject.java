package zock;

public class GeometricObject {

	public Vertex pos;
	public double height;
	public double width;	

	public double getHeight(){return height;}
	public double getWidth(){return width;}
	public Vertex getPos(){return pos;}


public GeometricObject(double height, double width, Vertex pos){
	this.pos=pos;
	this.width=width;
	this.height=height;
	
	if(width<0){
		width = -width;
		pos.x = pos.x -width;
	}
	if(height<0){
		height = -height;
		pos.y = pos.x -height;
	}

}
public GeometricObject(double height, double width){
	this(height, width, new Vertex(0,0));
	
	}
public String toString() {
	return "width="+width+" , height="+height+", pos="+pos;

	}
public double circumference() {return 2*(width+height);}

public double areal() {return width*height;}

public boolean contains(Vertex v) {
return v.x >= pos.x && v.x <= pos.x+width
&& v.y >= pos.y && v.y <= pos.y+height;

	}








}