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
        Document documento = new Document();
        try {

            PdfWriter.getInstance((Document) documento, new FileOutputStream(arquivo));

            String texto = "                                    Estabelecimento \n"
                    + "                                    Endereço \n"
                    + "                                    Resto \n"
                    + "                                    Relatório de Vendas";
            Paragraph paragrafo = new Paragraph(texto);
            documento.open();
            documento.add(paragrafo);

            paragrafo = new Paragraph(" ");
            documento.add(paragrafo);
            boolean haRegistro = rs.next();
            PdfPTable tabela;

            int totalQuantFat = 0;
            int totalValFat = 0;
            int totalQuantGer = 0;
            int totalValGer = 0;

            while (haRegistro) {
                tabela = new PdfPTable(2);
                tabela.addCell("Venda #: ");
                tabela.addCell(rs.getString("idFatura"));

                tabela.addCell("ID Cliente: ");
                tabela.addCell(rs.getString("idCliente"));
                tabela.addCell("Nome Cliente: ");
                tabela.addCell(rs.getString("nomeFull"));

                tabela.addCell("Data: ");
                tabela.addCell(rs.getString("data"));

                paragrafo = new Paragraph();
                paragrafo.add(tabela);
                documento.add(paragrafo);

                paragrafo = new Paragraph(" ");
                documento.add(paragrafo);

                totalQuantFat = 0;
                totalValFat = 0;

                tabela = new PdfPTable(6);
                tabela.addCell("LINHA: ");
                tabela.addCell("ID PRODUTO: ");
                tabela.addCell("DESCRIÇÃO: ");
                tabela.addCell("PREÇO: ");
                tabela.addCell("QUANTIDADE: ");
                tabela.addCell("VALOR: ");

                paragrafo = new Paragraph();
                paragrafo.add(tabela);
                documento.add(paragrafo);

                int faturaAtual = rs.getInt("idFatura");
                while (haRegistro && faturaAtual == rs.getInt("idFatura")) {

                    tabela = new PdfPTable(6);
                    tabela.addCell(rs.getString("idLinha"));
                    tabela.addCell(rs.getString("idProduto"));
                    tabela.addCell(rs.getString("descricao"));
                    tabela.addCell(rs.getString("preco"));
                    tabela.addCell(rs.getString("quantidade"));
                    tabela.addCell(rs.getString("valor"));

                    paragrafo = new Paragraph();
                    paragrafo.add(tabela);
                    documento.add(paragrafo);

                    totalQuantFat += rs.getInt("quantidade");
                    totalValFat += rs.getInt("valor");

                    haRegistro = rs.next();
                }

                tabela = new PdfPTable(6);
                tabela.addCell(" ");
                tabela.addCell(" ");
                tabela.addCell(" ");
                tabela.addCell("TOTAL VENDAS");
                tabela.addCell("" + totalQuantFat);
                tabela.addCell("" + totalValFat);

                paragrafo = new Paragraph();
                paragrafo.add(tabela);
                documento.add(paragrafo);

                totalQuantGer += totalQuantFat;
                totalValGer += totalValFat;

                paragrafo = new Paragraph(" ");
                documento.add(paragrafo);
            }

            tabela = new PdfPTable(6);
            tabela.addCell(" ");
            tabela.addCell(" ");
            tabela.addCell(" ");
            tabela.addCell("TOTAL GERAL");
            tabela.addCell("" + totalQuantGer);
            tabela.addCell("" + totalValGer);

            paragrafo = new Paragraph();
            paragrafo.add(tabela);
            documento.add(paragrafo);

            documento.close();
            
        } catch (Exception ex) {
            Logger.getLogger(frmRelatoriosVendas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            documento.close();
        }
    }
}
