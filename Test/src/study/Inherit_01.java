package study;

class Parent{		// �θ� Ŭ����
	protected int num;
	protected String name;
	
	public Parent(int num, String name) {
		this.num = num;
		this.name = name;
		
		
	}
	public void display() {
		System.out.println("�θ�Ŭ����");
	}
}
class Child extends Parent{
	
	public Child(int num,String name) {
		super(num, name);
		
	}
	
	
	
	@Override
	public void display() {
		System.out.println("num: "+super.num+" name: "+super.name);
	}
}




public class Inherit_01 {
	public static void main(String[] args) {
		Parent p = new Child(10,"111");
		p.display();
		
		Child c = (Child)p;
		c.display();
		
	}
}
