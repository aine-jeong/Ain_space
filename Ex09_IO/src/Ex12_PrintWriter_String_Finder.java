import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


// 단어검색 프로그램

public class Ex12_PrintWriter_String_Finder {
    String basedir = "C:\\Temp"; //검색할 폴더
    String word = "HELLO";
    String save = "result.txt"; // HELLO 단어가 들어있는 파일 목록 저장
    
    void Find() throws IOException{
        File dir = new File(basedir); // 검색할 폴더
        if(!dir.isDirectory()) {
            System.out.println("is not directory");
            System.exit(0);
        }
        // if문에서 종료되지 않았다면 폴더가 맞다는 얘기
        
//        PrintWriter writer = new PrintWriter(save); // 프린트라이터 직접 써도 되고
        PrintWriter writer = new PrintWriter(new FileWriter(save)); // 이렇게도 가능
        BufferedReader br = null;
        
        File[] files = dir.listFiles(); //해당 폴더의 목록(파일, 폴더)
        for(int i = 0; i < files.length ; i++) {
            if(!files[i].isFile()) { //
                continue; // 파일이 아닌 경우 아래 코드는 스킵한다.
            }
            //파일이라면 (a.txt / aaa.txt / hello.txt 등으로 들어온 것)
            br = new BufferedReader(new FileReader(files[i]));
            
            //파일에 한문장씩 read하면서 검색하겠다.
            String line = "";
            while((line = br.readLine()) != null) {
                if(line.indexOf(word) != -1) { // word가 하나라도 있다면 -1이 아닐 것
                            //if 안에 들어왔다는 것 : 현재 read한 문장에 HELLO라는 단어가 하나라도 들어있다.
                    writer.write("word =" + files[i].getAbsolutePath() + "\n");
                }
            }
            writer.flush();
        }
        br.close();
        writer.close();
    }
    
    public static void main(String[] args) {
        Ex12_PrintWriter_String_Finder StringFinder = new Ex12_PrintWriter_String_Finder();
        try {
            StringFinder.Find();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
