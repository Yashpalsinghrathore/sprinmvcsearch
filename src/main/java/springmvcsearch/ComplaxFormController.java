package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComplaxFormController {

	@RequestMapping("/complaxform")
	public String complaxFrom()
	{
		
		return "complaxform";
	}
	
	@RequestMapping(path="/formHandler",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute Studnet studnet,BindingResult result)
	{
		
	if(result.hasErrors())
	{
		return "complaxform";
	}
		
	return "showstudent";
	}
}
