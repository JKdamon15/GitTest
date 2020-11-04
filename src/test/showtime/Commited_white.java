package test.showtime;

/**
 * @Description:
 * @author： Jack.miao
 * @date： 2020/11/4 6:45
 */
public class Commited_white {
    public String name;
    private int id;
// 添加带参构造方法from GitTest_dev
    public Commited_white(String name) {
        this.name = name;
    }
//设置get和set方法-fromGitTest
//  设置get和set方法 from-GitTestClone2
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
