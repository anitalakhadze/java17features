package recordClasses;

public record PersonRecord(String name, Integer age) {
    public boolean isOver18() {
        return age() > 18;
    }

    public static boolean isOver18(PersonRecord personRecord) {
        return personRecord.age() > 18;
    }

    public PersonRecord() {
        this("Name", 18);
    }

    public PersonRecord(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
