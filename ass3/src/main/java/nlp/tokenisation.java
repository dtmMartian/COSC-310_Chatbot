package nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;


import java.util.List;

public class tokenisation {

    public static void main(String[] args) {
    StanfordCoreNLP stanfordCoreNLP= pipeline.getPipeline();
    Stemmer spellCheck = new Stemmer ();

    String text = "Hi, ths is Logan Gilroy";


        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();
        String word;
        for(CoreLabel coreLabel:coreLabelList){

            word = coreLabel.originalText();
            spellCheck.add(word.toCharArray(), word.length());
            System.out.printf(spellCheck.toString());



        }

    }
}
