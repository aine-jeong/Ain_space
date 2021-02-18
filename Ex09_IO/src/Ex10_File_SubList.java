import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
    static int totalfiles = 0;
    static int totaldirs = 0;
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("사용법: java [실행할 파일명] [경로명]");
            System.out.println("ex) java Ex10_File_Sublist C:\\Temp");
            System.exit(0);
        }
        File f = new File(args[0]);
        if(!f.exists() || !f.isDirectory()) { // 존재하지 않고, 디렉토리가 아니라면 -> 없다면
            System.out.println("유효하지 않은 경로입니다.");
            System.exit(0);
        }
        // 정상적인 경로, 폴더
        printFileList(f);
        System.out.println("누적 총 파일 수: " + totalfiles);
        System.out.println("누적 총 폴더 수: " + totaldirs);
        
    }
    static void printFileList(File dir) {
            System.out.println("[Fill path: ]" + dir.getAbsolutePath());
            
            List<Integer> subdir = new ArrayList<Integer>();
            File[] files = dir.listFiles();
            //[0] >> a.txt
            //[1] >> 1.jpg
            //[2] >> 2021폴더
            //[3] >> 2022폴더
            
            for(int i = 0 ; i < files.length ; i++) {
                String filename = files[i].getName(); // 리턴되는 것이 폴더명일수도, 파일명일수도 있다.
                if(files[i].isDirectory()) {
                    filename = "<DIR> [" + filename + "]";
                    subdir.add(i);
                    
                } else {
                    filename = filename + " / " + files[i].length() + "Byte";
                }
                System.out.println("   " + filename);
            }
            int dirnum = subdir.size(); // 폴더의 개수
            int filenum = files.length - dirnum; //파일의 개수
            
            // 함수가 종료되어도 가지고 있고 싶다.
            // static 변수
            totaldirs += dirnum; // 총 누적된 폴더 개수(하위폴더까지 나온다!)
            totalfiles += filenum; // 총 누적된 파일 개수(하위파일까지!)
            
            System.out.println("[Current dirNum] : " + dirnum);
            System.out.println("[Current fileNum] : " + filenum );
            
            System.out.println("**********************************************");
            
            
            //###POINT### 
            //폴더 안의 폴더(하위폴더)도 보고싶어요
            for(int j = 0; j < subdir.size(); j++) {
                int index = subdir.get(j);
                printFileList(files[index]); // 재귀호출(자신을 호출)
            }
            
            
            //[0] >> a.txt
            //[1] >> 1.jpg
            //[2] >> 2021폴더
            //[3] >> 2022폴더
            
            //subdir에 들어있는것 ?
            //list[0] >> 2
            //list[1] >> 3 / 폴더의 배열 위치값이 들어있다.
            
            // for문의 j가 0일때
            //index에 2가 들어간다 
            // 즉, printFileList(files[2]); =  printFileList(C:\\Temp\\2021);
            // 폴더의 위치값을 파라미터로 다시 재귀호출 하는 것.
            
            //for문의 j 가 1일때,
            //index에 3이 들어간다 
            // 즉, printFileList(files[3]); =  printFileList(C:\\Temp\\2022);
            // 폴더의 위치값을 파라미터로 다시 재귀호출 하는 것.
            
    }
}
