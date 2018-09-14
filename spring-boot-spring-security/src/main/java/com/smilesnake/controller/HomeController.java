package com.smilesnake.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.smilesnake.domain.model.Msg;

@RestController
public class HomeController {

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
		mv.addObject("msg", msg);
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping("/admin")
	public String hello() {
		return "hello admin";
	}

	@RequestMapping("/a/abel")
	public String aabel() {
		return "a aabel";
	}
	@RequestMapping("/a/abel2")
	public String aabel2() {
		return "a aabel";
	}
	@RequestMapping("/a/b/abel")
	public String abel3() {
		return "a b ababel";
	}

}