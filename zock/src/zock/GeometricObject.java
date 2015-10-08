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



public GeometricObject(double height){
	this(height, height);
	}

public GeometricObject(){this(10);}

public GeometricObject(Vertex pos){
	this(0,0,pos);
	}

public String toString() {
	return "width="+width+" , height="+height+", pos="+pos;
	}

public double circumference() {return 2*(width+height);}

public double area() {return width*height;}

public boolean contains(Vertex v) {
	return v.x >= pos.x && v.x <= pos.x+width 
			&& v.y >= pos.y && v.y <= pos.y+height;

	}
public boolean isLargerThan(GeometricObject that) {
	return that.area() > this.area();

	}
public void moveTo(Vertex pos) {this.pos=pos;}

public void moveTo(double x,double y) {
	moveTo(new Vertex(x,y));
	}


public void move(Vertex v){moveTo(pos.add(v));}

public boolean equals(Object thatObject){
	if(thatObject instanceof GeometricObject){
		GeometricObject that = (GeometricObject)thatObject;
		
		return this.width==that.width && this.height == that.height
				&& this.pos.equals(that.pos);
				
	}
		return false;
	}










}