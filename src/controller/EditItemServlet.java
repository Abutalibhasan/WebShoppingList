package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListItem;

/**
 * Servlet implementation class EditItemServlet
 */
@WebServlet("/editItemServlet")
public class EditItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		ListItemHelper dao = new ListItemHelper();
		String store = request.getParameter("store");
		String item = request.getParameter("item");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		ListItem itemToUpdate = dao.searchForItemById(tempId);
		itemToUpdate.setItem(item);
		itemToUpdate.setStore(store);
		dao.updateItem(itemToUpdate);
		getServletContext().getRequestDispatcher("/viewAllItemsServlet").forward(request, response);
	}
	


}
