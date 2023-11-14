package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiLingualStringTableTest {

    @Before
    public void setUp() {
        // No setup required for this case
    }

    @After
    public void tearDown() {
        // No teardown required for this case
    }

    @Test
    public void testGetMessageEnglish() {
        MultiLingualStringTable.setLanguage(MultiLingualStringTable.LanguageSetting.English);
        assertEquals("Enter your name:", MultiLingualStringTable.getMessage(0));
        assertEquals("Welcome", MultiLingualStringTable.getMessage(1));
        assertEquals("Have a good time playing Abominodo", MultiLingualStringTable.getMessage(2));
    }

    @Test
    public void testGetMessageKlingon() {
        MultiLingualStringTable.setLanguage(MultiLingualStringTable.LanguageSetting.Klingon);
        assertEquals("'el lIj pong:", MultiLingualStringTable.getMessage(0));
        assertEquals("nuqneH", MultiLingualStringTable.getMessage(1));
        assertEquals("QaQ poH Abominodo", MultiLingualStringTable.getMessage(2));
    }
}
