package tasks.HometaskDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Supplier;

public class NextThrusday {


    public static Supplier<String> generateNextDateForThursday(final LocalDate ld) {
        return () -> {
            LocalDate nd = ld.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
            return String.valueOf(nd);
        };
    }

    public static void main(String[] args) {
        System.out.println("Next Thursday: " + generateNextDateForThursday(LocalDate.of(2022, Month.JULY, 21)).get());
    }
}
