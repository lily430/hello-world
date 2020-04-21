
public class DuckExam {
	
	public static void main(String[] args) {
	Bird bird = new Duck();
	bird.fly();
	
	Duck duck = (Duck) bird;
	duck.fly();
	duck.sings();
	//Bird b = new Bird(); 추상클래스는 부모클래스의 역할만 o , 객체 생성 사용 x
	
	}
}
