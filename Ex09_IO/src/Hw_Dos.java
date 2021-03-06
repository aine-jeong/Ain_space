import java.io.File;

public class Hw_Dos {
    static boolean success;
    static File exName;
    static File newName;
    
    public static void main(String[] args) {
        
        if(args.length != 2) {
            System.out.println("사용법: java [실행할 파일명] [경로\\파일이름] [경로\\바꿀이름]");
            System.out.println("ex) java Ex10_File_Sublist C:\\Temp\\Testing.txt C:\\Temp\\newName.txt");
            System.exit(0);
        }
//        ex_file_name = args[0];
//        new_file_name = args[1];
        
        exName = new File(args[0]);
        newName = new File(args[1]);
        
        if(!exName.exists()) { // 존재하지 않다면,
            System.out.println("유효하지 않은 파일입니다.");
            System.exit(0);
        }
        
        renameDirectory(exName, newName);
        
        if (!success) {
            System.out.println("잘못 입력하셨습니다.");
            System.exit(0);
        } else {
            System.out.println("기존 파일 명: " + exName.getName());
            System.out.println("변경된 파일 명: " + newName.getName());
        }
    }
    
    static boolean renameDirectory(File file1, File file2) {
//        File[] files = dir.listFiles();
//        String exName = name.getName();
//        
//        for(int i = 0; i < files.length ; i++) {
//            if(files[i].getName().equals(exName)) {
//                name.renameTo(newName);
//            }
//        }
        
        success = file1.renameTo(file2);
        return success;
//        System.out.println(name);
    }
}

