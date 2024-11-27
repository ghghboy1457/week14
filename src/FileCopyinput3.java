import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyinput3 {
    public static void main(String[] args) {
        String inputFile = "input(3).txt";
        String outputFile = "output(2).txt";

        long startTime = System.nanoTime(); // 시작 시간 측정
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

        } catch (IOException e) {
            System.err.println("파일 처리 중 오류 발생: " + e.getMessage());
        }
        long endTime = System.nanoTime(); // 종료 시간 측정

        System.out.println("FileInputStream/FileOutputStream 복사 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
