package OOP2;

public class MoveablePoint implements Movable {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;

	public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;

	}

	public String toString() {
		return " ";
	}

	@Override
	public void moveUp() {
		x++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		x--;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		xSpeed--;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		ySpeed++;
		// TODO Auto-generated method stub
		
	}

	

}
