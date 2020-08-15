package Date;

import java.util.Date;

public final class PersonImmutableDate {
    private final Date birthday;
    private final String name;

    public PersonImmutableDate (Date birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    public Date getBirthday() {
        return (Date) birthday.clone();
    }

    public String getName() {
        return name;
    }
}
