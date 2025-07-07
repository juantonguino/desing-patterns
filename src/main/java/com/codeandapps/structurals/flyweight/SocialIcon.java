package com.codeandapps.structurals.flyweight;

public class SocialIcon {

    private String platform;

    private String svg;

    public SocialIcon(String platform, String svg) {
        this.platform = platform;
        this.svg = svg;
    }

    public String render(int x, int y, String url) {
        return String.format("Renderizando %s icon en (%d, %d) con svg %s, enlace: %s", platform, x, y, svg, url);
    }
}
