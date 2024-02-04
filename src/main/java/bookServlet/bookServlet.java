package bookServlet;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niranjana.DTO.bookDTO;

import bookDAO.bookDAO;
@WebServlet("/bookServlet")
public class bookServlet extends HttpServlet {
	

public void doPost(HttpServletRequest req , HttpServletResponse resp)
{
	try {
		
	
	String bookId=req.getParameter("bookId");
	String bookName=req.getParameter("bookName");
	String bookPrice=req.getParameter("bookPrice");
	
	bookDTO bdto = new bookDTO();
	
	bdto.setBookId(Integer.parseInt(bookId));
	bdto.setBookName(bookName);
	bdto.setBookPrice(Double.parseDouble(bookPrice));
	
	bookDAO bdao = new bookDAO();
boolean status =	bdao.savebook(bdto);

String response = null;
if (status)
{
	   response = "form submitted";
}
else 
	 response = " not submitted";

//send resp to clienyt 
PrintWriter pw = resp.getWriter();
pw.append(response);
}catch (Exception e) {
	e.printStackTrace();
}
	
	

}
}