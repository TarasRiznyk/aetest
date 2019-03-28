package com.agileengine.criteria;

import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassNameCriteria implements IElementCriteria {
    private static Logger LOGGER = LoggerFactory.getLogger(ClassNameCriteria.class);
    private String className;

    public ClassNameCriteria(Element element) {
        className = element.className();
        LOGGER.info("Learned element's visible text " + className);
    }

    @Override
    public boolean checkCriteria(Element element) {
        boolean result = className.equals(element.className());
        if (result) {
            LOGGER.info("Element's ClassName matched learned ClassName " + element.className());
        }
        return result;
    }

    @Override
    public String getName() {
        return "ClassName criteria";
    }
}
