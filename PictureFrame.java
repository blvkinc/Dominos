package base;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Represents a picture frame for the Abominodo game.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class PictureFrame {

    public int[] reroll = null;
    public Main master = null;

    private class DominoPanel extends JPanel {
        private static final long serialVersionUID = 4190229282411119364L;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBackground(g);
            Location l = new Location(1, 2);

            if (master.mode == 1) {
                l.drawGridLines(g);
                drawHeadings(g);
                drawGrid(g);
                master.drawGuesses(g);
            }
            if (master.mode == 0) {
                l.drawGridLines(g);
                drawHeadings(g);
                drawGrid(g);
                master.drawDominoes(g);
            }
        }

        @Override
        public Dimension getPreferredSize() {
            // the application window always prefers to be 202x182
            return new Dimension(202, 182);
        }

        private void drawBackground(Graphics g) {
            g.setColor(Color.YELLOW);
            g.fillRect(0, 0, getWidth(), getHeight());
        }

        private void drawHeadings(Graphics g) {
            for (int are = 0; are < 7; are++) {
                fillDigitGivenCentre(g, 10, 30 + are * 20, 20, are + 1);
            }

            for (int see = 0; see < 8; see++) {
                fillDigitGivenCentre(g, 30 + see * 20, 10, 20, see + 1);
            }
        }

        private void drawGrid(Graphics g) {
            for (int are = 0; are < 7; are++) {
                for (int see = 0; see < 8; see++) {
                    drawDigitGivenCentre(g, 30 + see * 20, 30 + are * 20, 20, master.grid[are][see]);
                }
            }
        }

        private void drawDigitGivenCentre(Graphics g, int x, int y, int diameter, int n) {
            int radius = diameter / 2;
            g.setColor(Color.BLACK);
            FontMetrics fm = g.getFontMetrics();
            String txt = Integer.toString(n);
            g.drawString(txt, x - fm.stringWidth(txt) / 2, y + fm.getMaxAscent() / 2);
        }

        private void fillDigitGivenCentre(Graphics g, int x, int y, int diameter, int n) {
            int radius = diameter / 2;
            g.setColor(Color.GREEN);
            g.fillOval(x - radius, y - radius, diameter, diameter);
            g.setColor(Color.BLACK);
            g.drawOval(x - radius, y - radius, diameter, diameter);
            FontMetrics fm = g.getFontMetrics();
            String txt = Integer.toString(n);
            g.drawString(txt, x - fm.stringWidth(txt) / 2, y + fm.getMaxAscent() / 2);
        }
    }

    public DominoPanel dp;

    public void createPictureFrame(Main sf) {
        master = sf;
        if (dp == null) {
            JFrame f = new JFrame("Abominodo");
            dp = new DominoPanel();
            f.setContentPane(dp);
            f.pack();
            f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            f.setVisible(true);
        }
    }

    public void reset() {
        // TODO Auto-generated method stub
    }
}
