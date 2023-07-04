package com.dreaMTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class RegExp11 {
    public static void main(String[] args) {

//        String content = "https://www.bilibili.com/video/BV1fh411y7R8?from=search&seid=1831060912083761326";
        String content = "http://edu.3dsmax.tech/yg/bilibili/my6652/pc/qg/05-51/index.html#201211-1?track_id=jMc0jn-hm-yHrNfVad37YdhOUh41XYmjlss9zocM26gspY5ArwWuxb4wYWpmh2Q7GzR7doU0wLkViEhUlO1qNtukyAgake2jG1bTd23lR57XzV83E9bAXWkStcAh4j9Dz7a87ThGlqgdCZ2zpQy33a0SVNMfmJLSNnDzJ71TU68Rc-3PKE7VA3kYzjk4RrKU";

        String regStr = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
        System.out.println(Pattern.matches(regStr, content));

    }
}
