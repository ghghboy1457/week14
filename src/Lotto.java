import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        List<Integer> lottoNumbers = numbers.subList(0, 5);
        int bonusNumber = numbers.get(5);

        System.out.println("로또 번호: " + lottoNumbers);
        System.out.println("보너스 번호: " + bonusNumber);
    }
}
