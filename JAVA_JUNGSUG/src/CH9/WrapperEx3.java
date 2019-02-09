package CH9;

public class WrapperEx3 {

	public static void main(String[] args) {
		int i = 10;
		
		// 기본형을 참조형으로 형변환(형변환 생략가능)
		Integer intg = (Integer) i;
		Object obj = (Object) i;
		
		Long lng = 100L; //Long lng = new Long(100L)
		
		int i2 = intg + 10;
		long l = intg + lng;
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;
		
		System.out.println("i    :"+i);
		System.out.println("intg :"+i);
		System.out.println("i    :"+i);
		System.out.println("i    :"+i);
		System.out.println("i    :"+i);
		System.out.println("i    :"+i);
		System.out.println("i    :"+i);
		

	}

}
