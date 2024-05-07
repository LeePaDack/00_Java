package package3.model.vo;

// Animal extends 하기
public class Horse extends Animal {
// 필드	
	private String location;
	private String color;
	
// 메서드
	// setter
	public void setLocation(String location) {
		this.location = location;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// getter
	public String getLocation() {
		return location;
	}
	public String getColor() {
		return color;
	}

	// 생성자 : 기본
	public Horse() {

	}

	// 생성자 : 필수
	public Horse(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() + "사는 곳은 " + location + "이고, 색은 "
				 			+ color + "입니다.");
	}
	
	
}
