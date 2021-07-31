package ssx.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssx.entity.POJOL;
import ssx.service.ServiceL;

import java.util.Map;

@Controller
@CrossOrigin
public class ControllerL {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    ServiceL serviceL;

    @RequestMapping("/eleven/add.do")
    @ResponseBody
    public Map addOne(@RequestBody POJOL pojol){
        return serviceL.addOne(pojol);
    }

    @RequestMapping("/eleven/que.do")
    @ResponseBody
    public Map queryAll(@RequestBody Map map){
        if (map.isEmpty()){
            logger.info("开始查询所有user,但是前端发过来的参数为空");
        }else {
            logger.info("开始查询所有user,前端优质哦");
        }
        return serviceL.queryAll();
    }
}
