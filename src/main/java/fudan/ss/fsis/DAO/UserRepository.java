package fudan.ss.fsis.DAO;

import fudan.ss.fsis.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author Peng Deng
 * @Date 2021/1/4 21:33
 * @Version 1.0
 **/
@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

}
