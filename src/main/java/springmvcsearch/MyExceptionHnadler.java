package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHnadler {

	//handling exception  for all contoller
	
		@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
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
		}
}
