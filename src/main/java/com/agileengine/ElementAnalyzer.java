package com.agileengine;

import com.agileengine.criteria.ClassNameCriteria;
import com.agileengine.criteria.HrefCriteria;
import com.agileengine.criteria.IElementCriteria;
import com.agileengine.criteria.VisibleTextCriteria;
import com.agileengine.result.CriteriaResult;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ElementAnalyzer {
    private static Logger LOGGER = LoggerFactory.getLogger(ElementAnalyzer.class);
    private static String CHARSET_NAME = "utf8";
    private static List<IElementCriteria> criterias = new ArrayList<>();

    public ElementAnalyzer(File originalPage, String elementId) {
        Optional<Element> element = findElementById(originalPage, elementId);
        element.ifPresent(this::learnElement);
    }

    public List<CriteriaResult> findSimilarElements(File anotherPage, int expectedScore) throws IOException {
        return getPageElements(anotherPage).stream().map(element ->  {
                    CriteriaResult criteriaResult = new CriteriaResult(element, criterias.size());
                    criterias.stream().filter(it -> it.checkCriteria(element)).forEach( criteria ->
                            criteriaResult.addCriteria(criteria)
                    );
                    return criteriaResult;
                }).filter(criteriaResult -> criteriaResult.getScore() >= expectedScore).collect(Collectors.toList());

    }

    private Elements getPageElements(File htmlFile) throws IOException {
        Document doc = Jsoup.parse(
                htmlFile,
                CHARSET_NAME,
                htmlFile.getAbsolutePath());
        return doc.getAllElements();
    }

    private void learnElement(Element element) {
        criterias.add(new VisibleTextCriteria(element));
        criterias.add(new ClassNameCriteria(element));
        criterias.add(new HrefCriteria(element));
    }

    public static Optional<Element> findElementById(File htmlFile, String targetElementId) {
        try {
            Document doc = Jsoup.parse(
                    htmlFile,
                    CHARSET_NAME,
                    htmlFile.getAbsolutePath());

            return Optional.of(doc.getElementById(targetElementId));

        } catch (IOException e) {
            LOGGER.error("Error reading [{}] file", htmlFile.getAbsolutePath(), e);
            return Optional.empty();
        }
    }

}
