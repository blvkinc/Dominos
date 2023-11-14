package base;

/**
 * Represents a table of multi-lingual strings.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class MultiLingualStringTable {
    
    private enum LanguageSetting { English, Klingon }
    private static LanguageSetting cl = LanguageSetting.English;
    
    private static String[] em = {"Enter your name:", "Welcome", "Have a good time playing Abominodo"};
    private static String[] km = {"'el lIj pong:", "nuqneH", "QaQ poH Abominodo"};
    
    /**
     * Gets a message based on the language setting and index.
     * 
     * @param index the index of the message
     * @return the message in the selected language
     */
    public static String getMessage(int index) {
        return (cl == LanguageSetting.English) ? em[index] : km[index];
    }

    /**
     * Sets the language setting.
     * 
     * @param language the language to set
     */
    public static void setLanguage(LanguageSetting language) {
        cl = language;
    }
}
