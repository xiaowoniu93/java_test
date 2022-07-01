package com.xszheng;

/**
 * @Author: xiaoshun
 * @CreateTime: 2022-06-10 17:26
 * @Description:
 */
public class MessageBuilder {

    public String getMessage(String name) {
        StringBuilder result = new StringBuilder();
        if (name == null || name.trim().length() == 0) {
            result.append("empty!");
        } else {
            result.append("Hello " + name);
        }
        return result.toString();
    }

}
