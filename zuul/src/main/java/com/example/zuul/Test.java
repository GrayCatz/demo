package com.example.zuul;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static final Pattern MULTIPLE_SLASH_PATTERN = Pattern.compile("/{2,}");

    public static void main(String[] args) {
        String uri = "";
        String path = "/";
        Matcher matcher = MULTIPLE_SLASH_PATTERN.matcher("path" + uri);
        String uri2 = StringUtils.cleanPath(matcher.replaceAll("/"));
        System.out.println();
    }
}
