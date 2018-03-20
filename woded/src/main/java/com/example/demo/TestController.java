package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "/hello", method = {RequestMethod.POST})
    @ResponseBody
    public TestVo home() {
        TestVo testVo = new TestVo();
        testVo.setHello("D");

        return testVo;
    }

}
