

        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.List;
        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "servlet",
        urlPatterns = "/dbtest"
)
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String par1 = req.getParameter("Type");

        PrintWriter out = resp.getWriter();
        out.append(par1.toLowerCase());
        /*
        LiquorSelect liquorSelect = new LiquorSelect();
        LiquorType l = LiquorType.valueOf(liquorType);

        List liquorBrands = liquorSelect.getAvailableBrands(l);

        req.setAttribute("brands", liquorBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
*/
    }
}
