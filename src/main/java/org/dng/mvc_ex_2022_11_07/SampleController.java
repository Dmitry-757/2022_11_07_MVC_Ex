package org.dng.mvc_ex_2022_11_07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SampleController {
    @GetMapping("/sample")
    public String showSample(){
        return "sample";
    }
}
