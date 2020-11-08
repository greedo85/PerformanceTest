import org.junit.jupiter.api.Test;

public class PerformanceTest {

    @Test
    public void measureAddExecutionTimeTest()
    {
        //given
        Performance performance1000 =new Performance(1000);
        performance1000.addToHashSetTime();
        performance1000.addToLinkedListTime();
        performance1000.addToArrayListTime();

        Performance performance10000=new Performance(10000);
        performance10000.addToHashSetTime();
        performance10000.addToLinkedListTime();
        performance10000.addToArrayListTime();


    }
}
