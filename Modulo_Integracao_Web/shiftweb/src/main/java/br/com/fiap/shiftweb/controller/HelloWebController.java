package br.com.fiap.shiftweb.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/html")
public class HelloWebController {
	
	@GetMapping(value = "/helloweb", produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String hello() {
		return "<html>\n" + "<header><title>Welcome</title></header>\n" + "<body>\n" + "<h1>HelloWorld</h1>\n" + "</body>\n" + "</html>";
	}
	
}
