package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static org.junit.Assert.assertNotNull;

public class PictureFrameTest {

    private PictureFrame pictureFrame;

    @Before
    public void setUp() {
        Main main = new Main();
        pictureFrame = new PictureFrame();
        pictureFrame.createPictureFrame(main);
    }

    @After
    public void tearDown() {
        pictureFrame = null;
    }

    @Test
    public void testCreatePictureFrame() {
        assertNotNull(pictureFrame.dp);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(pictureFrame.dp);
        assertNotNull(frame);
        assertEquals("Abominodo", frame.getTitle());
        assertTrue(frame.isVisible());
        assertEquals(JFrame.DO_NOTHING_ON_CLOSE, frame.getDefaultCloseOperation());
    }

    @Test
    public void testPaintComponent() {
        Dimension preferredSize = pictureFrame.dp.getPreferredSize();
        BufferedImage image = new BufferedImage(preferredSize.width, preferredSize.height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        pictureFrame.dp.paintComponent(g);
        // Add assertions based on the expected behavior of paintComponent
    }
}
