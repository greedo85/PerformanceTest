import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AddToArrayTest {

    @Test
    public void addToArrayTest()
    {
        //given
        Utilities utilities=new Utilities();
        //when
        utilities.addToArray(1);

        //then
        assertEquals(utilities.getPeople().length,1);
    }
}
