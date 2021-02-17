
public class Ex06_String_Function {
    public static void main(String[] args) {
        // 일상적으로 다루는 데이터: 문자열, 숫자, 날짜 >> 시스템함수
        String str = "hello";
        String concatstr = str.concat("world"); // 결합한 결과를 리턴
        System.out.println(concatstr);
        
        boolean bo = str.contains("ello"); // true
        System.out.println(bo); 
        
        bo = str.contains("elo"); // false
        System.out.println(bo);
        
        String str2 = "a b c d"; // [a][][b][][c][][d] -> 7개 (공백도 문자다)
        System.out.println(str2.length());
        
        String filename = "hello java world";
        System.out.println(filename.indexOf("j"));
        System.out.println(filename.indexOf("java"));
        System.out.println(filename.indexOf("개폭망")); //** 배열에서 값이 없다 = -1을 return한다 **
        
        // 어디다가 쓸까용
        // 신문 사설에서 해당 단어가 포함되어있는지 찾기
        // "폭망"... 있을까 .... 0보다 큰 값이 나오면 해당 사설에 최소 1개의 단어가 있다는 것
        // -1이 리턴되면 해당 단어가 없구나
        if(filename.indexOf("wo") != -1) {
            System.out.println("wo 하나라도 가지고 있구나");
        }
        
        System.out.println("a찾기: " + filename.lastIndexOf("a"));
        
        // ### length(), indexOf(), substring(), replace(), split() 등... 주로 활용하는 함수들이다......
        
        String result = "superman";
        System.out.println(result.substring(0)); // -> superman
        System.out.println(result.substring(2)); // -> perman
        System.out.println(result.substring(1,2)); // -> u >> endindex -1 >> 자기자신
        System.out.println(result.substring(0,0)); // (0,-1) >> 안나와요
        System.out.println(result.substring(0,1)); // s
        
        //Quiz
        String Filename2 = "h.jpeg"; // 또는 파일명이 hong.png 또는 파일명이 h.tmp 일수도 있어용
        // 여기서 파일명과 확장자를 분리해서 화면에 출력하세요.
        // 1. 파일명 h
        // 2. 확장자 jpeg
        // 만약에 hong.png 였어도 파일명 hong / 확장자 png 이렇게 나올 수 있게~~~
        
        // 풀어본고
        int name = Filename2.indexOf("h");
        int point = Filename2.indexOf(".");
        System.out.println("1.파일명: "+Filename2.substring(name, point));
        System.out.println("2.확장자: "+Filename2.substring(point+1)); // 확장자 출력
        
        
        // 강사님이 알려주신고
        int position = Filename2.indexOf(".");
        String file = Filename2.substring(0, position);
        
        String extention2 = Filename2.substring(position+1, Filename2.length());
        String extention = Filename2.substring(++position);
        
        System.out.println(file);
        System.out.println(extention);
        System.out.println(extention2);
        
        // replace (치환함수)
        String str3 = "ABCDADDDDDA";
        String result3 = str3.replace("DDDD", "오늘은 월요일");
        System.out.println(result3); // 특정 문자열을 다른 문자열로 바꾼다
        
        result3 = str3.replace("A", "a");
        System.out.println(result3);
        
        //ETC
        System.out.println(str3.charAt(0)); // 0번째 값이 모니???
        System.out.println(str3.charAt(3)); // 3번쨰 값이 뭐야?
        
        System.out.println(str3.endsWith("DDDA")); // true 
                                //뒤에서부터 어떤 문자열을 찾는데 그 문자열이 포함되어있니?
        System.out.println(str.endsWith("BDDDA")); // false
        
        System.out.println(str3.equalsIgnoreCase("abcDADDDDDA")); // 대소문자 구별없이 일치하는지 찾기
        
        //### Today Point (Split)
        
        /*
        String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
        String[] namearray = str4.split(",");
        for(String s: namearray) {
            System.out.println(s);
        }
        */
        
      //TIP) Java 특수문자
      //이스케이프 문자 >> 특정 문자 앞에 \
      char sing = '\''; 
      // 야 나는 ' 하나를 표현하고 싶어 .... 역슬러시라는 문자와 결합해서 사용하면 ... 문자 인정 
      System.out.println(sing);
      //홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력
      String ename = "홍\"길\"동";
      System.out.println(ename);
      // \\ 는 \ 이고당!
        
      
      // 정규 표현식... 
      // . >> 정규표현식문법... >> (문자그대로 \) + (.을 표현하는 정규표현식 \.) = \\.
      String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
      String[] namearray = str4.split("\\."); // 자바가 \를 이스케이프 문자로 보기 때문에
      for(String s: namearray) {
          System.out.println(s);
      }
      
      //String[] java.lang.String.split(String regex)
      //정규표현식 문법을 따라야 한다 ... (표준화)
      //java, javascript, Oracle, C# 등 모든 언어에서 정규표현식은 공통적으로 사용된다.
      //어떠한 문자를 만들떄 "규칙"을 부여하자 -> 유효성에대한 판단 근거를 만들자
      //주민번호: 숫자 6자리-숫자7자리 : {\d6}-{\d7}
      //123-1234567 -> false
      //핸드폰번호, 차량번호, 우편번호, 한글 처리, 도메인주소, 이메일주소 등
      //정규표현식은 이미 다 있다... (-> 만들지는 못해도 정규표현식에대한 read는 가능해야한다!)
      // 추후 카페에 과제가 올라갑니당 ^^
      
        
        //넌센스
        String str6 = "홍     길     동";
        // 저장 >> 공백제거 >> "홍길동" >> 이렇게 저장하고싶당
        System.out.println(str6.replace(" ", "")); // 홍길동
        
        String str7 = "     홍길동     ";
        System.out.println(">"+str7+"<");
        System.out.println(">"+str7.trim()+"<");
        
        String str8 = "    홍   길   동    ";
        String result5 = str8.trim();
        String result6 = result5.replace(" ", "");
        System.out.println(result6);
        
        //자바에서 여러개의 함수를 적용 (method chain 기반)
        System.out.println(str8.trim().replace(" ","").substring(2));
        
        //Quiz-1
        int sum = 0;
        String[] number = {"1","2","3","4","5"};
        // 문제: 배열에 있는 문자값들의 합을 sum변수에 담아서 출력: 결과 15
        for(String s : number) {
            sum += Integer.parseInt(s); // 문자열 값을 정수로 바꾸는 함수
            // Double.parseDouble(result6) // 문자열 값을 실수로 바꾸는 함수
            
        }
        System.out.println("합: "+sum);
        
        //Quiz-2
        String jumin="123456-1234567";
        //위 주민번호의 합을 구하세요_1
        int sum2=0;
        for(int i = 0 ; i < jumin.length() ; i++) {
            String numstr =jumin.substring(i, i+1);
            if(numstr.equals("-")) continue;
            sum2+= Integer.parseInt(numstr);
        } 
        System.out.println("주민번호 합:" + sum2);
        
      //위 주민번호의 합을 구하세요_2
      //String jumin="123456-1234567";
        String[] numarr2 = jumin.replace("-","").split("");
        int sum3=0;
        for(String i : numarr2) {
            sum3+= Integer.parseInt(i);
        }
        System.out.println("주민번호 합2:" + sum3);
        
      //위 주민번호의 합을 구하세요_3
        String jumin4 = jumin.replace("-", "");
        int sum4=0;
        for(int i = 0 ; i < jumin4.length() ;i++) {
            sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
        }
        System.out.println("주민번호 합4:" + sum4);
        
    }
}
