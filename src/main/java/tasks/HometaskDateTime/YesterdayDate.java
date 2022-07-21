package tasks.HometaskDateTime;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class YesterdayDate {
    public static void main(String args[]) {
        LocalDate now = LocalDate.now();
        String currentDate = now.toString();
        LocalDate yesterday = LocalDate.now().minusDays(1);
        String yesterdayDate = yesterday.toString();
        List<String> dateList = new ArrayList<>();

        dateList.add(currentDate);
        dateList.add(yesterdayDate);
       // Predicate<List<String>> p2 = c -> c.stream().filter()
        //productList.stream().filter(p2).forEach(System.out::println);

    }
}
