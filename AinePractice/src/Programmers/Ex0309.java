package Programmers;
public class Ex0309 {
    public static void main(String[] args) {
        /*
         * class Solution { 
         * public String solution(String[] participant, String[]completion) { 
         *           String answer = ""; return answer; 
         *           
         *           
         *      } 
         *  }
         */
        
//        String[] participant = new String[] {"leo", "kiki", "eden"};
//        String[] completion = new String[] {"eden", "kiki"};
        
        String[] participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[] {"josipa", "filipa", "marina", "nikola"};
        
        String answer = "";
        
        for(int i = 0; i < participant.length; i++) {
            for(int j = 0; j < completion.length; j++) {
                
                if (participant[i]==completion[j]) {
                    participant[i] = "END";
                    completion[j] = "END";
                }
                
            }
        }
        
        for(int i = 0; i < participant.length; i++) {
            if(!participant[i].equals("END")) answer = participant[i];
        }
        
        System.out.println(answer);
    }
}
