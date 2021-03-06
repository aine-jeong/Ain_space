import java.io.File;

/*
 파일과 폴더 다루는 클래스
 
 JAVA: 파일, 폴더 하나의 클래스 -> File
 >> a. txt 파일 생성, 삭제, 정보read 등을 할 수 있는 클래스
 >> Temp 폴더도 생성, 삭제, 정보read 
 -> 파일이랑 폴더를 둘다 File에서 다룬다
 
 (Tip: C#은 File클래스, Directory 클래스 등 ...
 
 절대경로: 드라이브 중심 (C:\\Temp\\a.txt)
 상대경로: 현재 파일을 중심으로 (C:\\Test >> ../Temp/)
 
 
 
 */
public class Ex07_FIle {
    public static void main(String[] args) {
        String path = "C:\\Temp\\file.txt";
        File f = new File(path);
        // File 클래스 사용: file의 다양한 정보
        System.out.println("파일명: " + f.getName());
        System.out.println("전체경로: " + f.getPath());
        System.out.println("절대경로: " + f.getAbsolutePath()); // 절대경로 찾기
        // 만약 path = "Lotto.txt" 이렇게 해두면 절대경로를 찾아서 보여준다.
         // 절대경로: C:\Users\eclipse-workspace\Ex09_IO\Lotto.txt
        System.out.println("너 폴더니?: " + f.isDirectory());
        System.out.println("너 파일이니?: " + f.isFile());
        System.out.println("파일 크기: " + f.length() + "byte"); // byte값을 리턴한다.
        System.out.println("부모경로: "+f.getParent()); // 너 바로 상위 경로가 모니
        System.out.println("파일/폴더가 실제로 존재하는가? " + f.exists());
        
        // f.createNewFile() 파일 생성 (원래 얘껀데 Stream 걔네가 부분적으로 갖고있는고다)
        // f.delete() 파일 삭제
        f.canRead(); // 내가 그 파일 써도 될까 ?
       
        
    }
}
