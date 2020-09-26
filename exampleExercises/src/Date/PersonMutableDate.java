package Date;

import java.util.Date;

public final class PersonMutableDate {
    private final Date birthday;
    private final String name;

    public PersonMutableDate(Date birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }
}


