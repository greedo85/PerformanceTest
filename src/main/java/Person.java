import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Person implements Comparable<Person> {
    private String name;
    private String surname;

    @Override
    public int compareTo( Person p ) {
        return name.compareTo(p.name);
    }
}
