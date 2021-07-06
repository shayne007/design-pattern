package designpattern.projectsInAction.spring.adaptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 实现Controller接口 + xml配置文件:配置DemoController与URL的对应关系
 * 
 * @author fengsy
 * @date 7/4/21
 * @Description
 */
public class DemoController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
        throws Exception {
        ModelAndView modelAndView = new ModelAndView("Greeting");
        modelAndView.addObject("msg", "shayne007");
        return modelAndView;
    }
}
