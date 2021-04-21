package java8;

public class Person {

    private String firstNm;
    private String lastNm;
    private int age;

    public Person(String firstNm, String lastNm, int age) {
        this.firstNm = firstNm;
        this.lastNm = lastNm;
        this.age = age;
    }

    public String getFirstNm() {
        return firstNm;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastNm() {
        return lastNm;
    }

    public void setLastNm(String lastNm) {
        this.lastNm = lastNm;
    }

    public void setFirstNm(String firstNm) {
        this.firstNm = firstNm;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + firstNm + '\'' + ", age=" + age + '}';
    }

}
