package io.github.ndimovt.scjpchapter7;

public class EqualsHashcodeTest {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public EqualsHashcodeTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if((o instanceof EqualsHashcodeTest) && ((EqualsHashcodeTest) o).getAge() == this.age){
            return true;
        }else {
            return false;
        }
    }

    public int hashCode(){
        int num = (int) (Math.random()*9500);
        return this.age + num;
    }

    @Override
    public String toString() {
        return "EqualsHashcodeTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
