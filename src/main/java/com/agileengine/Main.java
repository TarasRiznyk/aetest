package com.agileengine;

        import com.agileengine.result.CriteriaResult;
        import java.io.File;
        import java.io.IOException;
        import java.util.List;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;


public class Main {
    private static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private static int expectedScore = 2;

    public static void main(String[] args) throws IOException {
        String originalFilePath =  args[0];
        String changedFilePath =  args[1];
        String targetElementId = "make-everything-ok-button";
        if (args.length == 3) {
            targetElementId = args[2];
        }
        ElementAnalyzer analyzer = new ElementAnalyzer(new File(originalFilePath), targetElementId);
        List<CriteriaResult> results = analyzer.findSimilarElements(new File(changedFilePath), expectedScore);

        results.forEach(criteriaResult -> LOGGER.info(criteriaResult.resultString()));

    }


}





