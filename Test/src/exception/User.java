package exception;

public class User {
	private int age;

	// getter setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException {
		
		if(age<0 || age>150) {
			// ���ܻ�Ȳ exception ����
			throw new UserAgeException();
		}
		this.age = age;
	}
	
}
