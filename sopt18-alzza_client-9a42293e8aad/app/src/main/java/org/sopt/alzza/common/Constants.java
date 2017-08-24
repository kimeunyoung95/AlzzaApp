package org.sopt.alzza.common;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * Created by NOEP on 2016. 6. 26..
 */
public class Constants {
    public static final String TAG_LOG = "APPLOG";
    public static final String API_SERVER_URL = "http://188.166.181.182:5115/";
    public static final String CHAT_SERVER_URL = "http://188.166.181.182:5114/";
//    public static final String CHAT_SERVER_URL = "http://soon.japanwest.cloudapp.azure.com:3003";
    public static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");


    /**
     * Comment  : 배열에서 정상적인 이메일 인지 검증.
     */
    public static boolean isEmail(String email) {
        if (email==null) return false;
        boolean b = Pattern.matches(
                "[\\w\\~\\-\\.]+@[\\w\\~\\-]+(\\.[\\w\\~\\-]+)+",
                email.trim());
        return b;
    }


}
