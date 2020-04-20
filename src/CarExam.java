
public class CarExam {
	public static void main(String[] args) {
		// Car c1 = new Car(); Car클래스에서 생성자를 사용자정의하게 되면 기본 new 생성자로 사용이 불가능하다.
		Car c2 = new Car("들어갈 값");
		Car c3 = new Car("구급차");
		/* Car c2= new Car(); 
		   c2.name = "들어갈 것";*을 다른 방법으로 */
		c2.number=32;
	}

}
