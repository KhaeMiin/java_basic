package ch8;

import java.io.File;

public class Ex8_10 {
    public static void main(String[] args) {
        try {
            File f = createFile("test.txt");
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "다시 입력해 주시기 바랍니다.");
        }
    }

    private static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다.");
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}

class tryCatchTest {
    public static void main(String[] args) {
        try {
            addException(3, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "y가 더 크면 예외가 발생됩니다. y의 숫자를 더 작게 입력하세요.");
        }
    }

    static String addException(int x, int y) throws Exception {
            if(y > x) {
                throw new Exception("y의 숫자가 더 커서 에러발생");
            }
            return "x의 숫자가 더 큽니다 x = " + x;
    }
}