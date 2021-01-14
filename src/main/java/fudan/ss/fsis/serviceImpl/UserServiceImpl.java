package fudan.ss.fsis.serviceImpl;

import fudan.ss.fsis.DAO.UserRepository;
import fudan.ss.fsis.bean.User;
import fudan.ss.fsis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Peng Deng
 * @Date 2021/1/4 21:36
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(User user){
        userRepository.save(user);
    }
}
