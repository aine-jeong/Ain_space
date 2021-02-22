import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Hw_Dos2 {
//    static String defaultPath = "C:" + File.separator;
//    static String path = defaultPath;
//    
    static String str1; // 명령어
    static String str2; // 경로1
    static String str3; // 경로2

    public static void main(String[] args) {
        // 이클립스에서 그냥 실행 해볼 수 있는 간단한 DOS 커맨드
        // 사용할 수 있는 명령어

        // CD 현재 디렉터리 이름을 보여주거나 바꿉니다.
        // DIR 디렉터리에 있는 파일과 하위 디렉터리 목록을 보여줍니다.
        // MD 디렉터리를 만듭니다.
        // MKDIR 디렉터리를 만듭니다.
        // RD 디렉터리를 지웁니다.
        // RMDIR 디렉터리를 지웁니다.
        // REN 파일 이름을 바꿉니다.
        // RENAME파일 이름을 바꿉니다.
        // TYPE 텍스트 파일의 내용을 보여줍니다.
        // EXIT 프로그램을 종료합니다.

//        Scanner sc = new Scanner(System.in);
//        String[] input = null;
        
        
        
        if(args.length != 3) {
          System.out.println("1. 새폴더생성");
          System.out.println("   사용법: java [실행할 파일명] mkdir [경로\\새폴더]");
          System.out.println("ex) java Hw_Dos2 mkdir C:\\Temp\\Test");
          System.out.println("2. 파일명 변경");
          System.out.println("   사용법: java [실행할 파일명] rename [경로\\파일이름] [경로\\바꿀이름]");
          System.out.println("ex) java Hw_Dos2 rename C:\\Temp\\Testing.txt C:\\Temp\\newName.txt");
          System.out.println("3. 텍스트파일 읽어오기");
          System.out.println("   사용법: java [실행할 파일명] type [경로\\파일이름]");
          System.out.println("ex) java Hw_Dos2 type C:\\Temp\\Testing.txt");
          System.out.println("4. 파일 삭제하기");
          System.out.println("   사용법: java [실행할 파일명] del [경로\\파일이름]");
          System.out.println("ex) java Hw_Dos2 del C:\\Temp\\Testing.txt");
          System.exit(0);
      }
        
        str1 = args[0];
        str2 = args[1];
        str3 = args[2];
        
        switch (str2) {
        case "mkdir":
            newDirectory();
            break;
        case "rename":
            renameFile();
            break;
        case "type":
            readFile();
            break;
        case "del":
            deleteFile();
            break;
        }
        

    }

    private static void deleteFile() {
        try {
            File file = new File(str2);
            if(file.exists()) {
                if(file.delete()) {
                    System.out.println("파일 삭제 성공");
                }else {
                    System.out.println("삭제 실패");
                }
            }else {
                System.out.println("파일이 존재하지 않습니다.");
            }
        } catch (Exception e) {
            System.out.println("실패");
        }
    }
    
    private static void renameFile() {
        boolean success;
        File exName;
        File newName;
        
        exName = new File(str2);
        newName = new File(str3);
        
        if(!exName.exists()) { // 존재하지 않다면,
            System.out.println("유효하지 않은 파일입니다.");
            System.exit(0);
        }
        
        success = exName.renameTo(newName);
        
        if (!success) {
            System.out.println("잘못 입력하셨습니다.");
            System.exit(0);
        } else {
            System.out.println("기존 파일 명: " + exName.getName());
            System.out.println("변경된 파일 명: " + newName.getName());
        }
    }

    private static void readFile() {
        FileInputStream fis = null;
        try {
            File file = new File(str2);
            fis = new FileInputStream(file);

            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.write(i);
            }

        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                fis.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.getMessage();
            }
        }
    }

    private static void newDirectory() {
        File newdir = new File(str2);
        boolean isExists = newdir.exists();
        
        if(!isExists) {
            try {
                newdir.mkdir();
                System.out.println("폴더 생성 완료");
            } catch (Exception e) {
                e.getMessage();
            }
        }else {
            System.out.println("같은 이름의 폴더가 이미 존재합니다.");
        }
    }
        

    

    
}