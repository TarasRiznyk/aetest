package com.agileengine.criteria;

import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HrefCriteria implements IElementCriteria {

    private static Logger LOGGER = LoggerFactory.getLogger(HrefCriteria.class);
    private String href;

    public HrefCriteria(Element element) {
        href = element.attr("href");
        LOGGER.info("Learned element's visible text " + href);
    }

    @Override
    public boolean checkCriteria(Element element) {
        boolean result = href.equals(element.attr("href"));
        if (result) {
            LOGGER.info("Element's Href matched learned href " + element.className());
        }
        return result;
    }

    @Override
    public String getName() {
        return "Href criteria";
    }
}
