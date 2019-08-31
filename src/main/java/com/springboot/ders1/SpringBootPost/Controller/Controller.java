package com.springboot.ders1.SpringBootPost.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.ders1.SpringBootPost.Model.Message;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/submitpost")
	public String formGonder(){
		return "form";
	}
	

	@PostMapping("/submitpost")
	public String formAl(HttpServletRequest req, Model model){
		model.addAttribute("msg",req.getParameter("msg"));
		return "result";
	}
	
	@PostMapping("/submitpostdif")
	public String formAlDif(HttpServletRequest req, Model model){
		model.addAttribute("msg",req.getParameter("msg"));
		return "result";
	}
	
	
	@GetMapping("/submitget")
	public String doitget(HttpServletRequest req, Model model){
		model.addAttribute("msg",req.getParameter("msg"));
		return "result";
	}
	
	/*Model attr'a model class*/
	@GetMapping("/handlemodel")
	public String FormGonderModelClass(Model model) {
		model.addAttribute("message",new Message());
		return "form";
	}
	
	@PostMapping("/handlemodel")
	public String FormAlModelClass(@ModelAttribute Message message,Model model) {
		//model.addAttribute("message",message); //Bu olmasa da olur
		return "resultmodel";
	}
	
}
