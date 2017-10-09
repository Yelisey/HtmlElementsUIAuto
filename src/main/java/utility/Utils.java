package utility;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

public class Utils {

    private final static Logger logger = Logger.getLogger(Utils.class.getName());


    public static void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static boolean isFileExists(String filename) {
        boolean flag = false;

        File file = new File(filename);
        if(file.exists()) {
            flag = true;
        }

        return flag;
    }


    public static String getPath(String filename) {
        String path = null;

        path = System.getProperty("user.dir");
        path += File.separator + filename;

        return path;
    }


    public static String encode(String str) {
        String encodURL = str;
        try {
            encodURL = java.net.URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.warning("Warning!" +  str);
        }
        return encodURL;
    }
}