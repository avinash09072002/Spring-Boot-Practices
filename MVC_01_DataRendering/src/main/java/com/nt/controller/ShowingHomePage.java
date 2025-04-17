package com.nt.controller;

import java.time.LocalTime;
import java.util.Date;
import java.util.Map;
import java.util.Random;

import javax.swing.text.rtf.RTFEditorKit;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ShowingHomePage {
	
	/*
	 * @RequestMapping("/") 
	 * public String displayHomepage(Map<String, Object>map) {
	 * 
	 * System.out.println("shared memory name "+map.getClass()); map.put("sysdate",
	 * new Date()); map.put("age", 23); return "welcome"; }
	 */
	
	/*
	 * @RequestMapping("/home") 
	 * public String displayHome(Model model) {
	 * model.addAttribute("sysdate", new Date()); model.addAttribute("age", new
	 * Random().nextInt(100));
	 * 
	 * return"welcome"; }
	 */
	
	/*
	 * @RequestMapping("/home1") 
	 * public String displayHome(ModelMap modelmap) {
	 * modelmap.addAttribute("sysdate", new Date()); modelmap.addAttribute("age",
	 * new Random().nextInt(100));
	 * 
	 * return"welcome"; }
	 */
	/*
	 * @RequestMapping("/home2") // here it will serch for home2.jsp file public
	 * Model showHome() { Model model= new BindingAwareModelMap();
	 * model.addAttribute("sysdate", new Date()); model.addAttribute("age", new
	 * Random().nextInt(100));
	 * 
	 * return model; }
	 */

	@RequestMapping("/home2")
	public String showHomie(Map<String, Object>map) {
		map.put("sysdate",  new Date());
		map.put("age",  new Random().nextInt(100));
		
	//	return "forward:report";
		return "redirect:report1";
	}
	@RequestMapping("/report")           // if you forward the request then you can forward object also
	public String reporting(Map<String, Object>map) {// you can use object of first request
		map.get("sysdate");
		map.put("time", LocalTime.now());
		map.put("age",  100);
		
		return "report";
	}
	
	@RequestMapping("/report1")
	public String reporting1(Model model) {
		model.addAttribute("name", "avinash");
		model.addAttribute("hb", "cricket");
		
		return "report1";
	}
}
