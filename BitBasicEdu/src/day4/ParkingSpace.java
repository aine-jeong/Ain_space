package day4;
/**
 * 
 * 주차장 공간
 *  차량 정보를 넣을 공간
 *
 */

//@Repository

// car라고 하는 데이터가 여러 개가 있음 -> 이것을 관리(하나하나 저장, 인출)하는 부분
public class ParkingSpace {
	Car[] cars = new Car[10];

	public Car[] getAll() { // 있는거 다 내놔라
		return cars;
	}

	public boolean hasEmpty() { // - 빈자리가 있나? (어떤 질문인지 잘 생각해서 return값이 뭔지 생각한 다음에 진행)
		for(int i=0; i<cars.length;++i) { //빈자리가 있는지 하나하나 찾아보는 과정
			if( cars[i] == null ) {
				return true; // return; : 함수를 종료하는 것. (아예 밑으로 안나간당) (break는 반복문을 끝내겠다.(밑으로 나간당) 종료의 대상이 다름 주의)
			}
		}
		// 빈자리가 있는지는 창고에서 확인할 수 있으니까 ParkingSpace에서 처리하고 있는거얌
		return false;
	}

	public void add(Car car) {
		// 빈자리 찾는다.
		int ins = indexOfEmpty(); // 비어있는 자리의 요소번호 찾기
										//indexOfEmpty(); 는 -1 이들어가면 안대니까
		if(ins > -1) {
			cars[ins] = car; // 주차장이 비었는지 찼는지는 그 공간에 가야 알 수 있으니까 여기서 처리하고 있는 즁
		}
	}

	private int indexOfEmpty() {
//		cars.
		int idx = -1;
		for(int i=0; i<cars.length;++i) {
			if( cars[i] == null ) {
				idx = i; // 빈자리를 찾아서 i에 넣는 부분
				break;
			}
		}
		return idx;
	}

	public Car getCarByNumber(String carno) {
		Car car = null;
		// for - each : 요소 번호가 아니라 요소를 꺼낸다..
		// for문은 "요소번호"를 기준으로 반복하는 것
		// for-each는 "요소" 단위로 다 꺼내는 개념 (필요로 하는 것이 요소 번호인지 요소인지 구분해서 사용하기)
		for(Car c : cars) { // 포문과 형태 다름 (정수 없다. 배열 안에 요소를 하나씩 하나씩 꺼내는 것)
			if( c.carNumber.equals(carno)) { //c.[car타입] carNumber[string타입].equals[비교함수 (string의 equals임을 주의)](carno)) 
								  // ***  . 찍어서 들어가다보면 중간에 타입이 바뀜 주의 ***
				car = c;
				break;
			}
			
		}
		return car;
	}

	public void update(Car car) {
		int idx = indexOfCar(car); // carno한 부분은 '차 번호'를 검색한것 - car는 차를 찾는것
		cars[idx] = car; // cars의 몇번에 car를 넣을 건지 알아내야돼(요소번호를 찾아야돼)
			
	}

	private int indexOfCar(Car car) { // 요소번호를 찾고자 하는 곳
		// "전달 받은 car"와 "배열 요소인 car" 를 비교한다
		int idx = -1;
		for(int i=0; i<cars.length; ++i) { // 요소번호 찾는거니까 for문
			System.out.println( car + " vs "+ cars[i]); // car: 전달받은 car vs cars[i]: 배열요소인 car
			if ( cars[i] != null) {
				// '참조 비교와 필드 값을 비교하는 것은 다르다'는 것을 인지
				// 여기서는 참조비교를 하고있는거얌
				// ㄴ carparkservice에서 수정 완료된 부분이라고 작성한 이유다 (생각해보기 ㅠㅠ)
				if( car == cars[i]) {
					idx = i;
					break;
				}
			}
		}
		
		return idx;
	} 
	
	// 함수들이 반환하는 게 있으면 서로 맞춰줘야된다~!~!~!~!
	// 함수 만들다가 내가 만들고 있는 함수 목록 확인하려면 오른쪽에 Outline 눌러서 확인

}


