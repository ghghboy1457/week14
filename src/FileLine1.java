import java.io.*;

public class FileLine1 {
    public static void main(String[] args) {
        // 파일 경로 설정
        String inputFilePath = "input(2).txt";
        String outputFilePath = "output.txt";

        // 파일 읽기 및 변환 후 쓰기
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // 각 줄을 대문자로 변환하여 출력 파일에 씀
                writer.write(line.toUpperCase());
                writer.newLine(); // 줄바꿈 추가
            }
            System.out.println("파일 변환이 완료되었습니다!");
        } catch (IOException e) {
            // 예외 처리
            System.err.println("파일 처리 중 오류 발생: " + e.getMessage());
        }
    }
}