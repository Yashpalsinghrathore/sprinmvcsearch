package springmvcsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm()
	{
		//for checking null pointer exception
		/*String str = null;
		System.out.println(str.charAt(0));*/
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimage",method=RequestMethod.POST)
	public String uploadImage(@RequestParam("file") CommonsMultipartFile file,HttpSession session,Model model)
	{
		System.out.println("upload image is working");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		System.out.println(file.getStorageDescription());
		
		
		byte[] data = file.getBytes();
		
		//we have to save this file to server
		
		String path = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			fos.write(data);
			fos.close();
			System.out.println("uploaded successfully");
			
			model.addAttribute("msg","uploaded successfully");
			model.addAttribute("filename",file.getOriginalFilename());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Io execption catch blaock");
			
			model.addAttribute("msg"," could'nt uploaded successfully");
		}
	
		
		
		
		
		return "filesuccess";
	}
}
