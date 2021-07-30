package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	//this handler for checking pathvariable annotation which mostly we used in Restfull web services
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetils(@PathVariable("userId") int userId,@PathVariable("userName") String userName)
	{
		System.out.println(userId);
		System.out.println(userName);
		
		//for checking number format exception
		//Integer.parseInt(userName);
		
		return "hello";
		
	}
	
	
	@RequestMapping("/home")
	public String home()
	{
		
		//String str = null; 
		
		
		//for checking null format exception
		//System.out.println(str.charAt(0));
		
		
		
		return "hello";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String querybox)
	{
		
		String url = "https://google.com/search?q="+querybox;
		
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(url);
		
		return redirectView;
	}
	
	//handling exception only for this contoller
	
	/*@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String nullPointer(Model model)
	{
		
		System.out.println("null pointer exception occured");
		
		model.addAttribute("msg","NullPointerException");
		
		return "exceptionpage";
	}
	
	
	
	
	
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String numberFormat(Model model)
	{
		
		System.out.println("number  format exception occured");
		
		model.addAttribute("msg","NumberFormatException");
		
		return "exceptionpage";
	}
	
	//this handler for any exception occured
	
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	//@ExceptionHandler({NumberFormatException.class,NullPointerException.class})
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGenerics(Model model)
	{
		
		System.out.println("number exception occured");
		
		model.addAttribute("msg","Exception Occured");
		
		return "exceptionpage";
	}*/
	
}
