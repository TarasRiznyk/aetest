package com.agileengine.criteria;

import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class VisibleTextCriteria implements IElementCriteria {
    private static Logger LOGGER = LoggerFactory.getLogger(VisibleTextCriteria.class);
    private String visibleText;

    public VisibleTextCriteria(Element element) {
        visibleText = getVisibleText(element);
        LOGGER.info("Learned element's visible text " + visibleText);
    }

    @Override
    public boolean checkCriteria(Element anotherElement) {
        boolean result = visibleText.equals(getVisibleText(anotherElement));
        if (result) {
            LOGGER.info("Element's visible text matched learned text " + visibleText);
        }
        return result;
    }

    @Override
    public String getName() {
        return "Visible Text Criteria";
    }

    private String getVisibleText(Element element) {
        String value = element.val();
        return value.equals("") ? element.ownText(): value;
    }
}
