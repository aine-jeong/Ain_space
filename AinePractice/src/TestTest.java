import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class UserInfo implements Serializable {
    private String name;
    private String pwd;
    private int age;

    public UserInfo(String name, String pwd, int age) {
        super();
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
    }
}

public class TestTest {
    public static void main(String[] args) {
//        String filename = "Userdata.txt"; // 여기다가 객체를 직렬화해서 write해둘 것

        String file = "C:\\Temp\\ex.txt";

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ObjectOutputStream out = null;
        
        List<UserInfo> users = new ArrayList<UserInfo>();
        users.add(new UserInfo("홍","1234",30));
        users.add(new UserInfo("이","1111",20));
        users.add(new UserInfo("박","3333",10));
        users.add(new UserInfo("홍","9999",22));
        
        List<String> read = new ArrayList<String>();

        try {
            fos = new FileOutputStream(file, true); // true -> append 하겠다
            bos = new BufferedOutputStream(fos);
            // 직렬화 하고싶으면
            out = new ObjectOutputStream(bos);

            // 직렬화 대상
            for(int i = 0; i < users.size(); i++) {
                String user = users.get(i).toString();
                out.writeUTF(user);
            }
            // 받은 것은 분해된 것이다~!~!~!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                out.close();
                bos.close();
                fos.close();
            } catch (Exception e2) {

            }
        }

        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream in = null;
        
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            in = new ObjectInputStream(bis); // 분해된 부품을 조립하는 행위
            
            /*// 이 경우 몇개를 보냈는지 알아야 하는 것... 몇개를 보내던 읽고싶다~~~~
            UserInfo r1 = (UserInfo)in.readObject(); // ###나눠진 부품을 객체로 만들어서 읽겠다!!!!
                            // ㄴ> 내가 만든 타입으로 다운캐스팅 해야된다. Object는 다읽으니까~~
            
            UserInfo r2 = (UserInfo)in.readObject();
            
            System.out.println(r1.toString());
            System.out.println(r2.toString());
            */
            
//            Object u = null;
//            while((u = in.readObject()) != null) {
//                System.out.println(((UserInfo)u).toString());
//            }
            
            for(int i = 0; i < users.size(); i++) {
                String user = users.get(i).toString();
//                System.out.println(in.readUTF());
                read.add(user);
            }
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (EOFException eofe) {
            System.out.println("-----------------------------");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
//        } catch (ClassNotFoundException cnfe) {
//            System.out.println(cnfe.getMessage());
        } finally {
            try {
                in.close();
                bis.close();
                fis.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
        
        for(int i = 0; i < read.size(); i++) {
            System.out.println(read.get(i).toString());
        }
        
        /////////////////////////////////
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            in = new ObjectInputStream(bis); // 분해된 부품을 조립하는 행위
            
//            Object u = null;
//          while((u = in.readObject()) != null) {
//              System.out.println(((UserInfo)u).toString());
//          }
            
            String line="";
            for(int i = 0; (line = in.readUTF()) != null; i++) {
                if(line.indexOf("홍") != -1) { // indexOf(): 어떤 문자를 주면 걔의 인덱스값을 뽑아내기
                    System.out.println(line);
                }
            }
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (EOFException eofe) {
            System.out.println("끝" + eofe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
//        } catch (ClassNotFoundException cnfe) {
//            System.out.println(cnfe.getMessage());
        } finally {
            try {
                in.close();
                bis.close();
                fis.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    
    
    
    
    }
}
