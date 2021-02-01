package list.arraylist.implementation;

public class ArrayList {
	private int size = 0;	// ��� �����Ͱ� ����Ʈ�� ����ִ°�?
	private Object[] elementData = new Object[100];	// Object��ü �迭 ������ 100�� ����
	
	
	public boolean addLast(Object element) {
		
		elementData[size] = element;
		size++;
		return true;
	}

	public boolean add(int index,Object element ) {
		
		// size -1 ���� index -> ���ϴ� �ε��� ���� ���������� ��ĭ�� �а� 
		// index������ �ݺ��ϰ� index���� ���� ���� �Էµ� ������ �����.
		for(int i=size-1;i>=index;i--) {
			elementData[i+1] = elementData[i];
		}
		elementData[index] = element;
		size++;		// ��ü������ ������
		return true;
		
	}
	
	public boolean addFirst(Object element) {
		
		// 0��° ��ġ�� ����
		return add(0,element);
	}
	
	
	@Override
	public String toString() {
		
		String str = "[";
		
		for(int i=0;i<size;i++) {
			str += elementData[i];
			// ������ ,�� ������� �ʴ´�.
			if(i<size-1)
				str += ",";
		}
		return str+"]";
		
	}
	
	public Object remove(int index) {
		Object removed = elementData[index];	// ������ ������ ����
		for(int i =index+1;i<=size-1;i++) {
			elementData[i-1] = elementData[i];
		}
		size--;						// size�� ũ���̰�, ������ 0������ �����̱� ������ --�� �������ְ� 
									// null ���� �־�����Ѵ�.
		elementData[size] = null;	// ���� �ڿ� ���� �����ش�.
		return removed;		// ������ ������ ����
		
	}
	
	
	
	public Object removeFirst() {
		return remove(0);
	}
	public Object removeLast() {
		return remove(size-1);	// -1�� �������
	}
	
	public int indexOf(Object o) {
		for(int i=0;i<size;i++) {
			if(o.equals(elementData[i]))
				return i;
		}
		return -1;		// ã�� ���� ����.
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
