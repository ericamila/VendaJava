package classes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Erica
 */
public class BackGround extends JDesktopPane {

    private Image imagem;

    public BackGround() {
    }

    public BackGround(String img) {
        if (img != null) {
            this.imagem = new ImageIcon(getClass().getResource(img)).getImage();
        }
    }

    public BackGround(Image imagemInicial) {
        if (imagemInicial != null) {
            this.imagem = imagemInicial;
        }
    }

    public void setImage(String img) {
        if (img != null) {
            this.imagem = new ImageIcon(getClass().getResource(img)).getImage();
        } else {
            this.imagem = null;
        }

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (imagem != null) {
            g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }

        super.paint(g);
    }
}
