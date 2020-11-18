package hw9;

public class ColorPoint extends Point {
	private String color; // ����Ŭ������ color �ʵ� �߰�
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		super.move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "����" + " (" + getX() + "," + getY() + ")�� ��"; 
	}
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");
	}
}
