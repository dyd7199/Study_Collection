package simple;



public class test2 {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("용환",'남');
		pArr[1] = new Person("막순",'여');
		pArr[2] = new Person("희수",'여');
		
		
		
		for(int i=0;i<pArr.length;i++) {
			System.out.println(pArr[i].getName());
		}
	}
}
