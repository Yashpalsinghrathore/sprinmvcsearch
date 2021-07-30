package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerForInterceptor {

	@RequestMapping("/showform")
	public String showForm()
	{
		
		return "showform";
		
		
	}
	@RequestMapping("/processform")
	public String processForm(@RequestParam("name") String name)
	{
		
		System.out.println(name);
		return "processform";
		
	}
}
