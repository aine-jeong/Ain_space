import java.util.HashMap;
import java.util.Set;

//Thread  할때 .....
class QuizInfo {
    String question;
    String answer;
    String result;
    
    public QuizInfo(String question, String answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }
    
    public String toString() {
        return "문제:"+this.question+" 쓴답:"+this.answer+" 채점:"+this.result;
    }
}

public class Ex15_HashMap_Quiz {

    public static void main(String[] args) {
        HashMap<String, String> quiz = new HashMap<>();
        quiz.put("1+1", "2");
        quiz.put("1+2", "3");
        quiz.put("1+3", "4");
        
        // key에 대한 value 값을 어떻게 찾느냐...
        for(int i = 0 ; i < quiz.size() ; i++) { // 해쉬맵의 사이즈만큼 돌면서
            Set set =quiz.keySet(); // key값을 뽑았다
            Object[] obj= set.toArray(); // 배열로 만든다 (Set은 배열이 아니니까!)
                                         // toArray(); : 배열로 만든다 -> but 랜덤하게 들어간다(=들어가는 순서는 랜덤하다)
            //System.out.println(obj.length);
            System.out.println("문제:" + obj[i]); // obj[i] -> 문제
            System.out.println(quiz.keySet().toArray()[i]);
            
            System.out.println(quiz.get(quiz.keySet().toArray()[i])); // get을 이용해서 문제에 대한 답을 뽑아내기
            // 방 안에 있는 것이 key값이니까, key 값을 통해서 value를 뽑아내는 것
            
        }

    }

}
