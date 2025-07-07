package com.codeandapps.structurals.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SocialIconFactory {

    private Map<String, SocialIcon> icons;

    public SocialIconFactory(){
        icons= new HashMap<>();
    }
    public SocialIcon getIcon(String platform) {
        if (!icons.containsKey(platform)) {
            String svg = "<svg>" + platform + " Logo</svg>";
            icons.put(platform, new SocialIcon(platform, svg));
        }
        return icons.get(platform);
    }
}
