package lecture09;

public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String job, String religion, String egn) {
        super(name, sex, "Bulgarian", job, "Bulgarian", egn, "Bulgaria", religion);
    }

    @Override
    public void sayHello() {
        System.out.println("Здрасти!");
    }

    @Override
    public Boolean isAdult() {
        return this.age >= 18;
    }

    public void danceHoro() {
        System.out.println("Аз танцувам хоро!");
    }
}
