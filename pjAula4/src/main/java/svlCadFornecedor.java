import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pjAula4.Produto;

public class svlCadFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Produto> lista = new ArrayList<Produto>();

    public svlCadFornecedor() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto produto = new Produto();
		
		produto.setCodigo(
				Integer.parseInt(request.getParameter("id")));
		produto.setDescricao(request.getParameter("descricao"));
		produto.setQuantidade(
				Float.parseFloat(
						request.getParameter("quantidade")));
		
		lista.add(produto);
		response.getWriter().append("<h1>Cadastrado com sucesso!</h1>");
		for(Produto p : lista) {
			response.getWriter().append("<p>" + p.getCodigo() + " - "
				+ p.getDescricao()
				+ " - " + p.getQuantidade());
		}
		
	}
}