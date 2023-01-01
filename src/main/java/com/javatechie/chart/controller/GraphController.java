package com.javatechie.chart.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GraphController {
		
					@GetMapping("/displayBarGraph")
					public String barGraph(ModelMap model) {
						
						Map<String , Integer> surveyMap = new LinkedHashMap<>();
						
						surveyMap.put("Java",40);
						surveyMap.put("dev oops",25);
						surveyMap.put("PHP",15);
						surveyMap.put(".Net",10);
						model.addAttribute("surveyMap",surveyMap);
						return "barGraph";
						
					}
					@GetMapping("/displayPieChart")
					public String piechart(Model model) {
						
						model.addAttribute("pass",50);
						model.addAttribute("fail",50);
						return "piechart";
					}
					
					
}
