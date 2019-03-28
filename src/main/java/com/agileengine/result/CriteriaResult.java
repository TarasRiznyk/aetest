package com.agileengine.result;

import com.agileengine.criteria.IElementCriteria;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class CriteriaResult {
    private Element element;
    private int score;
    private int maxScore;
    private List<String> criteriaNames = new ArrayList<>();

    public CriteriaResult(Element element, int maxScore) {
        this.element = element;
        this.maxScore = maxScore;
    }

    public Element getElement() {
        return element;
    }


    public int getMaxScore() {
        return maxScore;
    }

    public void addCriteria(IElementCriteria criteriaName) {
        score++;
        criteriaNames.add(criteriaName.getName());
    }

    public List<String> getCriteriaNames() {
        return criteriaNames;
    }

    public int getScore() {
        return score;
    }

    public String resultString() {
        String part0 = "\n";
        String part1 = String.format("\nElement found:\n%s \nMatched score %d of %d \nCriteria matched: \n", this.getElement().cssSelector(), this.getScore(), this.getMaxScore());
        String part2 = String.join(", ", this.getCriteriaNames());
        return part0.concat(part1).concat(part2);
    }


}
