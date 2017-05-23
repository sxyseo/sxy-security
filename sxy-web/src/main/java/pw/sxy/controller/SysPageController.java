package pw.sxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统页面视图
 *
 * @author sxy
 * @email admin@sxyseo.com
 * @date 2017-05-23 15:15:15
 */
@Controller
public class SysPageController {

    @RequestMapping("sys/{url}.html")
    public String page(@PathVariable("url") String url) {
        return "sys/" + url + ".html";
    }

    @RequestMapping("generator/{url}.html")
    public String generator(@PathVariable("url") String url) {
        return "generator/" + url + ".html";
    }
}
