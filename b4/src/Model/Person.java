package Model;

public class Person {
    private String name;
    private int age;
    private String job;
    private String passport;

    public Person(String name, int age, String job, String passport) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.passport = passport;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
    public void showInfo() {
        System.out.println("\tFull name: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tJob: " + job);
        System.out.println("\tPassport: " + passport);
        System.out.println();
    }
    @Override
    public int hashCode() {
        return passport.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return passport.equals(((Person) o).getPassport());
    }
}

