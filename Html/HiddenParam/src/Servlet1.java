

import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		String hp = request.getParameter("hiddenParam");
		
          ServletOutputStream out =  response.getOutputStream();
          out.println("User Name:"+un);
          out.println("Password:"+pw);
          out.println("Security Num:"+hp);
          //Tax Calculation
           int totalTax = 767676;
          
           request.setAttribute("TotalTax", totalTax);
           
           HttpSession session = request.getSession();
           
           String userid = (String)session.getAttribute("userID");
           
           if(userid == null){
        	   System.out.println("I am connecting to DB and getting userID");
        	   String uid = "I89890";
        	   session.setAttribute("userID", uid);
           }else{
        	   System.out.println("User id is avialable");
           }
           
           
           
           
          RequestDispatcher rd =  request.getRequestDispatcher("Servlet2");
  		rd.include(request, response);
          
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
