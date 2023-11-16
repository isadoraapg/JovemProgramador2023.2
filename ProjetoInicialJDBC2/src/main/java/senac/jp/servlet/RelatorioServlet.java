package senac.jp.servlet;

import java.io.IOException;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import senac.jp.db.AlunoJDBCdao;
import senac.jp.dominio.Aluno;

@WebServlet("/RelatorioServlet")
public class RelatorioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Document documento = new Document();
		try {
			response.setContentType("apllication/pdf");
			response.addHeader("Content-Disposition", "inline; filename=" + "alunos.pdf");
			PdfWriter.getInstance(documento, response.getOutputStream());
			documento.open();
			documento.add(new Paragraph("Lista de alunos:"));
			documento.add(new Paragraph(" "));
			// Definindo tamanho das colunas (5 colunas)
			float[] colsWidth = {2f, 1f, 1f, 1f, 1f}; 
			PdfPTable tabela = new PdfPTable(colsWidth);			
			PdfPCell col1 = new PdfPCell(new Paragraph("Matricula"));
			PdfPCell col2 = new PdfPCell(new Paragraph("Nome"));			
			PdfPCell col3 = new PdfPCell(new Paragraph("Idade"));
			PdfPCell col4 = new PdfPCell(new Paragraph("Semestre"));
			PdfPCell col5 = new PdfPCell(new Paragraph("Genero"));
			tabela.addCell(col1);
			tabela.addCell(col2);
			tabela.addCell(col3);
			tabela.addCell(col4);
			tabela.addCell(col5);
			AlunoJDBCdao dao = new AlunoJDBCdao();				
			List<Aluno> lista = dao.listarAlunos();
			for (int i = 0; i < lista.size(); i++) {
				tabela.addCell(lista.get(i).getMatricula());
				tabela.addCell(lista.get(i).getNome());
				tabela.addCell(lista.get(i).getIdade());
				tabela.addCell(lista.get(i).getSemestre());
				tabela.addCell(lista.get(i).getGenero());
			}
			documento.add(tabela);
			documento.close();
		} catch (Exception e) {
			System.out.println(e);
			documento.close();
		}
		
	}

	

}
