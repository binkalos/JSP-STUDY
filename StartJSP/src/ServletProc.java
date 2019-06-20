import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletProc")
public class ServletProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("doGet");//콘솔창에 찍는것
		doPost(request,response);//만약 get방식으로 드러오면 post 방식으로 가라고 호출
		//request에 사용자가 작성한거 담겨있음
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("doPost");//콘솔창에 찌게 하는것 
		//이 두 메소드는 jsp파일에서 넘어오늘 방식에 대해서 톤솔에 찍히게 함 (ServeletForm.jsp에서는 method가 post이기 때문에 post가 뜸)
		
		request.setCharacterEncoding("UTF-8");//한글 사용시 꼭 사용해야 함! =>request는 요청
		response.setContentType("text/html; charset=UTF-8");//내가 만든 값들을 html값으로 보여줄것이라는 소스=> response는 결과 	
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String hobby[] = request.getParameterValues("hobby");//hobby가 여러개 이므로 배열에 담겨있음
		String major = request.getParameter("major");
		String protocal = request.getParameter("protocal");
		
		PrintWriter out = response.getWriter();//웹 브라우저에 출력하는 소스
		out.println("<html><head><title>서블릿연습</title></head></html>");//웹브라우저에 찍기 때문에 줄바꿈이 되질 않은 br써줘야 함
		out.println("<body>");
		out.println("이름 : " + name + "<br>");
		out.println("아이디 : " + id+ "<br>");
		out.println("비밀번호 : " + pw + "<br>");
		out.println("취미 : " + Arrays.toString(hobby) + "<br>");//배열 한번에 나타내는 메소드
		out.println("과목 : " + major+ "<br>");
		out.println("프로토콜 : " + protocal + "<br>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
