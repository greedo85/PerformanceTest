import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AddToArrayTest {

    @Test
    public void addToArrayTest()
    {
        //given
        Utilities utilities;
        //when
        utilities=new Utilities(1);
        //then
        assertEquals(utilities.getPeople().length,1);
    }
}
