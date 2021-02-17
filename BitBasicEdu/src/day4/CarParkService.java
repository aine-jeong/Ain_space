package day4;

import java.util.Date;

/**
 * 
 * 주차장 요금 및 차량 관리 역할
 * 
 * 
 * 객체지향: 기본적으로 3개로 역할을 나눈 형태를 많이 사용한다
 *
 */

// @ Service

// 실제적인 업무를 처리하는 부분
public class CarParkService {
	ParkingSpace space = new ParkingSpace();
	
	public String[] getList() {
		// "자리번호:차량번호:입차시간"
		Car[] list = space.getAll();
		String[] result = new String[list.length]; // 길이를 모르면 생성을 못해요
									// ㄴ Car[] list = space.getAll();로 몇대인지 뽑아냈으니까 길이를 알아냈당!
		
		for(int i=0; i < list.length; ++i) {
			Car car = list[i]; // list에 있는 car 요소를 하나씩 꺼내자
			//car를 sting으로 바꾼다.
			if(car !=null) {
				String s = i+":"+car.carNumber+":"+car.intime; //자리번호 : 차번호 : intime값
				 // ㄴ  주의 : 배열 길이가 다르면 오류난다 list 와 result의 i가 다르면 안댕**
				// .을 찍으려면 null이 아니어야 한다. so, 조건 추가하기
				result[i] = s;
			}
		}
		
		return result;
	}

	public boolean hasEmpty() {
		// 빈자리가 있나없나 확인하는 부분
		return space.hasEmpty(); // 이런식으로 코딩되는 경우가 많당
		
	}

	public void parking(String carno, Date in) {
		// 처리와 확인
		Car car = new Car(); 
		car.carNumber = carno;
		car.intime = in; // 타입 맞춰주는 부분 (타입의 변환)
		space.add(car); // space안에 car형 배열이 있는 것
		
	}

	public long getPrice(String carno) {
		// 차량을 검색해서 시간차를 구한 후, 요금을 반환한다.
		Car car = space.getCarByNumber(carno);//차정보를 하나 찾을건데 차번호로 검색하겠다. 해당하는 차를 꺼내와라
		if(car != null) {
			Date in = car.intime; // 들어온 시간
			Date out = new Date(); //이 때 차가 나간다 (나가는 시간)
			long diff = out.getTime() - in.getTime();
			// 데이터 타입이 머ㅜ가 있는지. 인타임과 아웃타임이 어떤 의미인지 알아야 된다
			long extra = diff / 1000; //초단위로 바꾼다
			long price = 1000 + (extra*500);

			return price; // long타입의 프라이스를 만들어서 반환하겠다.
		}
	return -1;
	} // 함수가 반환한 것을 보고 맞다 틀리다를 판단한 후 각각 할 행동이 뭔지를 작성하는 것 (순서)

	public void editTime(String carno, int hour, int min, int sec) {
		// 
		
		Car car = space.getCarByNumber(carno);
		if( car != null ) {
			car.intime.setHours(hour); // 제일 끝에 있는 함수가 누구껀지? - 바로 옆에 있는 애꺼 (제일 앞에 있는 애꺼가 아니당)
			car.intime.setMinutes(min);
			car.intime.setSeconds(sec);
			// 이미 수정은 완료한 상태이다. 
			// ㄴ space 안에 있는 car 배열에다가 수정을 다 해놓은 상태
			space.update(car); // 다시 update를 해주는 부분
								// 이미 수정을 헀는데 업데이트 ?
			
			//**************
			// 수정을 하기 전에 '확인 한 뒤에 수정'을 해야 함
			// 이미 수정이 완료된 다음에 확인하면 안된다
			// 주소(참조값, 위치)가 같아진당
			// 
			// 위치가 같으면 '하나다' 라는 개념 인지
			//**************
		}
	}

}






