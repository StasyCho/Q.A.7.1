import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import ru.netology.stats.StartsServices;

public class AverageSum {

    @Test

    public void shouldFindAverageSumMonth() {
        StartsServices service = new StartsServices();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 15;
        float actualSum = service.averageSumMonth(month);

        Assertions.assertEquals(expectedSum, actualSum);

    }
}
