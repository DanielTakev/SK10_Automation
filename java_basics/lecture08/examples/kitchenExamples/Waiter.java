package lecture08.examples.kitchenExamples;

public class Waiter {
    private String sex = "Male";
    private String name;
    private String seniorityLevel;

    private final int minimalWage = 600;

    public Waiter(String sex, String name, String seniorityLevel) {
        this.name = name;
        this.sex = sex;
        this.seniorityLevel = seniorityLevel;
    }
    public Waiter(String sex, String name) {
        this(sex, name, "Middle");
    }

    public Waiter(String name) {
        this.name = name;
    }

    public Waiter() {
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }

    public String getSeniorityLevel() {
        return this.seniorityLevel;
    }

    public int getMinimalWage() {
        return this.minimalWage;
    }

    public void setSeniorityLevel(String seniorityLevel) {
        this.seniorityLevel =  seniorityLevel;
    }
    public void takeOrder(String menuItem) {
        System.out.println("I took an order: " + menuItem );
    }

}
