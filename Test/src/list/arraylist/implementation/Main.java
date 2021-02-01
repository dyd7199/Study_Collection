package list.arraylist.implementation;

public class Main {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		
		numbers.addLast(10);	// ������ �߰�
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		System.out.println(numbers);
		
		System.out.println("\n-------����----------");
		
		// ���ϴ� �ε��� ����
		numbers.add(1,15);
		// 0��° �ε����� ����
		numbers.addFirst(5);
		
		System.out.println(numbers);
		
		System.out.println("\n-------����----------");
		
		// ������ ����
		
		
		System.out.println(numbers.remove(1));	// ������ ������ ����
		System.out.println(numbers);
		
		System.out.println("\n-------0��° �ε��� ����----------");

		numbers.removeFirst();
		System.out.println(numbers);
	
		System.out.println("\n-------������ �ε��� ����----------");
		
		numbers.removeLast();
		System.out.println(numbers);
		
		
		System.out.println("\n-------���ϴ� �ε��� ���----------");
		System.out.println(numbers.get(1));
		
		System.out.println("\n-------�迭 ������ ���----------");
		System.out.println(numbers.size());
		
		
		System.out.println("\n-------���ϴ� ���� �ε��� ��ȣ���----------");
		System.out.println(numbers.indexOf(20)); 
		
		System.out.println("\n-------iterator----------");
		
		ArrayList.ListIterator li = numbers.listIterator();
		// �����͸� �� ���
		
		while(li.hasNext()) {
			
			System.out.println(li.next());
		}
		
		while(li.hasPrevious()) {
			
			System.out.println(li.previous());
		}
		
//		----------------------------------------------------------------------------
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30)
//				li.add(35);
				li.remove();
		}
	
		System.out.println(numbers);
		
	}
}
