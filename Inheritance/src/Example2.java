/*
 * 
-----------------
| Y             |
|   String y    |
| ------------- |
| |  X        | |
| | int x ,i  | |
| ------------- |
-----------------
        |
        | 
        |
-----------------
| Z             |
|   int z       |
-----------------
 */
		
class X implements Cloneable{
	private int x=0;
	private int i=0;
	
	public  X(int x,int i){
		this.x=x;
		this.i=i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
class Y{
	private String y;
	private X xObj = new X(0,0);
	public Y(String y,int x,int i)
	{
		this.y=y;
		xObj.setI(i);
		xObj.setX(x);
			
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public X getxObj() {
		return xObj;
	}
	public void setxObj(X xObj) {
		this.xObj = xObj;
	}
	
}

class Z extends Y{
	private int z;
	public Z(String y, int x, int i,int z) {
		super(y, x, i);
		this.z=z;
		// TODO Auto-generated constructor stub
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
public String getY(){
	return super.getY();
}
public void setY(String y){
	
}
	
	
}
public class Example2 {
	
public static void main(String[] args) {
	
}
}
