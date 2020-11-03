package test.showtime;

/**
 * @Description:
 * @author： Jack.miao
 * @date： 2020/11/3 8:32
 */
public class Add_green {
    public String name;
    private int age;

    public Add_green() {
    }

    public Add_green(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Add_green{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
