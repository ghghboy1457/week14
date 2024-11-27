import java.io.File;
import java.util.Scanner;

public class FileInfor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 파일 경로 입력 받기
        System.out.print("파일 경로를 입력하세요: ");
        String filePath = scanner.nextLine();

        // File 객체 생성
        File file = new File(filePath);

        // 파일 존재 여부 확인
        if (file.exists()) {
            // 파일 정보 출력
            System.out.println("파일 이름: " + file.getName());
            System.out.println("절대 경로: " + file.getAbsolutePath());
            System.out.println("파일 크기: " + file.length() + " 바이트");
        } else {
            // 파일이 없을 경우 메시지 출력
            System.out.println("파일이 존재하지 않습니다.");
        }

        scanner.close(); // 스캐너 닫기
    }
}
