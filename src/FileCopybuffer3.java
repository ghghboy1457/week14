import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopybuffer3 {
    public static void main(String[] args) {
        String sourceFile = "input4.txt";
        String destinationFile = "output3.txt";

        long startTime = System.nanoTime(); // 시작 시간 측정
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            int byteData;
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }

        } catch (IOException e) {
            System.err.println("파일 처리 중 오류 발생: " + e.getMessage());
        }
        long endTime = System.nanoTime(); // 종료 시간 측정

        System.out.println("BufferedInputStream/BufferedOutputStream 복사 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
