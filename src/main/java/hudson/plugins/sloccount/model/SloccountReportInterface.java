package hudson.plugins.sloccount.model;


/**
 * Generic parsing results.
 * 
 * @author Michal Turek
 */
public interface SloccountReportInterface {
    /**
     * Add lines count.
     * 
     * @param filePath
     *            the file
     * @param languageName
     *            the language name
     * @param moduleName
     *            the module name
     * @param lineCount
     *            the line count
     */
    void add(String filePath, String languageName, String moduleName, int lineCount);

    /**
     * Get the root folder.
     * 
     * @return the root folder
     */
    String getRootFolder();
}
