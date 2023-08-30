package lecture06.examples.settersGetters;

class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            age = age;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(5);
        System.out.println(person.getAge());
    }
}