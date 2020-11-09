import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AddToArrayTest {

    @Test
    public void addToArrayTest()
    {
        //given
        Utilities utilities=new Utilities(1);
        //when

        //then
        assertEquals(utilities.getPeople().length,1);
    }
}
