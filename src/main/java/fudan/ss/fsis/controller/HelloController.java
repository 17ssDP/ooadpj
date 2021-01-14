package fudan.ss.fsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Peng Deng
 * @Date 2021/1/4 20:43
 * @Version 1.0
 **/
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String sysHello() {
        return "index";
    }
}
