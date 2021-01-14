package fudan.ss.fsis.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @ClassName User
 * @Description TODO
 * @Author Peng Deng
 * @Date 2021/1/4 21:08
 * @Version 1.0
 **/
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private int age;

    public User(){

    }

    public User(Long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
