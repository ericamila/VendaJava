package classes;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import formularios.frmRelatoriosVendas;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erica
 */
public class Relatorio {

    public static void relatorioFatura(String arquivo, ResultSet rs) {
        try {
            Document documento = new Document();

            PdfWriter.getInstance((Document) documento, new FileOutputStream(arquivo));

            String texto = "Relatório de Vendas";
            Paragraph paragrafo = new Paragraph(texto);
            documento.open();
            documento.add(paragrafo);

            while (rs.next()) {
                PdfPTable tabela = new PdfPTable(2);
                tabela.addCell("Venda #: ");
                tabela.addCell(rs.getString("idFatura"));

                tabela.addCell("ID Cliente: ");
                tabela.addCell(rs.getString("nomeFull"));

                tabela.addCell("Data: ");
                tabela.addCell(rs.getString("data"));

                paragrafo = new Paragraph();
                paragrafo.add(tabela);
                documento.add(paragrafo);
                rs.next();
            }

            documento.close();

        } catch (Exception ex) {
            Logger.getLogger(frmRelatoriosVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
