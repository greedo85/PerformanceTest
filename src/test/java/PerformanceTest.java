import org.junit.jupiter.api.Test;

public class PerformanceTest {

    @Test
    public void measureAddExecutionTimeTest()
    {
        //given
        Performance performance =new Performance();
        performance.addToHashSetTime(1000);
        performance.addToLinkedListTime(1000);
        performance.addToArrayListTime(1000);
    }
}
