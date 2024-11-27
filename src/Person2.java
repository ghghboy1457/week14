import java.io.*;

public class Person2 {
    public static void main(String[] args) {
        String filePath = "person2.ser";
        Person2 person = new Person2();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(person); // 객체 직렬화
            System.out.println("Person 객체가 직렬화되어 'person.ser'에 저장되었습니다.");
        } catch (IOException e) {
            System.err.println("직렬화 중 오류 발생: " + e.getMessage());
        }
    }
}
