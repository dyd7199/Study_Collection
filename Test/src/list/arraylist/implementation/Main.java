package list.arraylist.implementation;

public class Main {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		
		numbers.addLast(10);	// 데이터 추가
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		System.out.println(numbers);
		
		System.out.println("\n-------삽입----------");
		
		// 원하는 인덱스 삽입
		numbers.add(1,15);
		// 0번째 인덱스에 삽입
		numbers.addFirst(5);
		
		System.out.println(numbers);
		
		System.out.println("\n-------삭제----------");
		
		// 데이터 삭제
		
		
		System.out.println(numbers.remove(1));	// 삭제할 데이터 리턴
		System.out.println(numbers);
		
		System.out.println("\n-------0번째 인덱스 삭제----------");

		numbers.removeFirst();
		System.out.println(numbers);
	
		System.out.println("\n-------마지막 인덱스 삭제----------");
		
		numbers.removeLast();
		System.out.println(numbers);
		
		
		System.out.println("\n-------원하는 인덱스 출력----------");
		System.out.println(numbers.getElementData(1));
		
		System.out.println("\n-------배열 사이즈 출력----------");
		System.out.println(numbers.getSize());
		
		
		System.out.println("\n-------원하는 값의 인덱스 번호출력----------");
		System.out.println(numbers.indexOf(20)); 
		
		System.out.println("\n-------iterator----------");
		
		ArrayList.ListIterator li = numbers.listIterator();
		
		// 데이터를 쭉 출력
		while(li.hasNext()) {
			
			System.out.println(li.next());
		}
		
		
	}
}
