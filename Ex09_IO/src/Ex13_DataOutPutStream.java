import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 보조
 DataOutPutStream, DataInPutStream
 
 장점: 우리가 지금까지 사용한 것은 char(문자데이터)로 쓰고 읽는 것이었다.
      Java가 가지는 8가지 기본 타입 형식으로 write, read 하고싶을 때가 있다.
      단, 자기들끼리만 놀아야된다... (InPut, OutPut의 형식이 다르면 x)
      
      txt 기록을 규칙적인 방법으로 처리하고싶다 >> 801002265 -> 80 100 22 65 또는 80,100,22,65
                                      ㄴ> split한다음에 배열에 넣고 정수화시킨뒤에 연산시키면 된다.
      DataOutPutStream을 사용하면 바로 처리 가능~~~~
 
 */
public class Ex13_DataOutPutStream {
    public static void main(String[] args) {
        int[] score = {100, 60, 55, 94, 23};
        FileOutputStream fos = null;
        DataOutputStream dos = null; // 보조라서 윗줄 필요함
        
        try {
            fos = new FileOutputStream("score.txt");
            dos = new DataOutputStream(fos);
            for(int i = 0; i < score.length ; i++) {
                dos.writeInt(score[i]); // 단, 이렇게 사용한 것은 read할 때 DataInPutStream 얘로 읽어야 한다!!!!!
//                dos.writeUTF(null); // 한글이던, 영문이던 2byte 또는 3byte를 기준으로 작성해주는 것
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dos.close();
                fos.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
    }
}
