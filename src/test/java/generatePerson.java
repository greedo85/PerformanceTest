import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class generatePerson {

    @Test
    public void generateNameSurnameTest()
    {
        //given
        Utilities utilities=new Utilities();
        //when
        utilities.addToArray(1);

        //then
        assertEquals(utilities.getPeople().length,1);
    }
}
