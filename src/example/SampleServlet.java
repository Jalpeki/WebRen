package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public SampleServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    //運勢をランダムで
	    String[] luckArray ={"大吉","中吉","吉","末吉","今日"};
	    //乱数
	    int index = (int) (Math.random() * 5);
	    String luck = luckArray[index];

	    //日にち
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	    String today = sdf.format(date);

	    //html出力
	    response.setContentType("text/html; Charset=UTF-8");
		PrintWriter out= response.getWriter().append("Served at: ").append(request.getContextPath());

		out.println("<html>");
		out.println("<head>");
		out.println("<title>運勢</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + today + "の運勢は" + luck + "です</p>");
		out.println("</body>");
		out.println("</html>");
	}
}

