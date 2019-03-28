package com.agileengine.criteria;

import org.jsoup.nodes.Element;

public class TitleCriteria implements IElementCriteria {
    @Override
    public boolean checkCriteria(Element element) {
        //todo not implemented
        return false;
    }

    @Override
    public String getName() {
        return "Title criteria";
    }
}
