package com.apryshchepa.example.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RefreshScope
@Controller
public class RateController {

    @Value("${rate}")
    private String rate;

    @Value("${lanecount}")
    private String lanecount;

    @Value("${tollstart}")
    private String tollstart;

    @Value("${connstring}")
    private String connstring;

    @RequestMapping("/rate")
    public String getRate(Model model) {

        model.addAttribute("rateamount", rate);
        model.addAttribute("lanes", lanecount);
        model.addAttribute("tollstart", tollstart);
        model.addAttribute("connstring", connstring);

        return "rates";
    }
}
