package list.arraylist.implementation;

public class ArrayList {
	private int size = 0;	// 몇개의 데이터가 리스트에 들어있는가?
	private Object[] elementData = new Object[100];	// Object객체 배열 데이터 100개 생성
	
	
	public boolean addLast(Object element) {
		
		elementData[size] = element;
		size++;
		return true;
	}

	public boolean add(int index,Object element ) {
		
		// size -1 부터 index -> 원하는 인덱스 까지 오른쪽으로 한칸씩 밀고 
		// index값까지 반복하고 index값의 값을 새로 입력된 값으로 덮어쓴다.
		for(int i=size-1;i>=index;i--) {
			elementData[i+1] = elementData[i];
		}
		elementData[index] = element;
		size++;		// 전체데이터 사이즈
		return true;
		
	}
	
	public boolean addFirst(Object element) {
		
		// 0번째 위치에 삽입
		return add(0,element);
	}
	
	
	@Override
	public String toString() {
		
		String str = "[";
		
		for(int i=0;i<size;i++) {
			str += elementData[i];
			// 마지막 ,는 출력하지 않는다.
			if(i<size-1)
				str += ",";
		}
		return str+"]";
		
	}
	
	public Object remove(int index) {
		Object removed = elementData[index];	// 삭제할 데이터 저장
		for(int i =index+1;i<=size-1;i++) {
			elementData[i-1] = elementData[i];
		}
		size--;						// size는 크기이고, 실제로 0번부터 시작이기 때문에 --를 먼저해주고 
									// null 값을 넣어줘야한다.
		elementData[size] = null;	// 가장 뒤에 값을 지워준다.
		return removed;		// 삭제된 데이터 리턴
		
	}
	
	
	
	public Object removeFirst() {
		return remove(0);
	}
	public Object removeLast() {
		return remove(size-1);	// -1을 해줘야함
	}
	
	public int indexOf(Object o) {
		for(int i=0;i<size;i++) {
			if(o.equals(elementData[i]))
				return i;
		}
		return -1;		// 찾는 값이 없다.
	}
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	
	
	
	
	// getter setter
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public Object getElementData(int index) {
		return elementData[index];
	}


	public void setElementData(Object []elementData) {
		this.elementData = elementData;
	}
	
	
	class ListIterator{
		private int nextIndex = 0;
		
		
		
		public Object next() {
			return elementData[nextIndex++];
		}
	
		public boolean hasNext() {
			
//			if(size == nextIndex)
//				return false;
//			return true;
			
			return nextIndex < getSize();
		}
}



		
	
}
