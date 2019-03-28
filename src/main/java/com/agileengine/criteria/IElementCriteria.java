package com.agileengine.criteria;

import org.jsoup.nodes.Element;


public interface IElementCriteria {
    boolean checkCriteria(Element element);
    String getName();
}
