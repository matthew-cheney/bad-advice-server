package Test;

import BadAdviceServer.*;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import org.junit.internal.runners.statements.Fail;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParserTester {

    MaxentTagger tagger;
    Tagger myTagger;
    Parser myParser;

    @BeforeEach
    public void setUp() {
        tagger = new MaxentTagger("/home/matthew/Documents/BadAdviceApp/BadAdviceServer/english-bidirectional-distsim.tagger");
        myTagger = new Tagger();
        myParser = new Parser();
    }

    @Test
    public void testTest() {
        assertTrue(true);
    }

    @Test
    public void testBasic() throws InvalidQuestionError {
        ArrayList<Word> questionList = myTagger.tag("Are you my mother?", tagger);
        try {
            Question parsedQuestion = myParser.parse(questionList);
            assertEquals("are", parsedQuestion.getAuxiliaryFormatted());
            assertEquals("you", parsedQuestion.getNounPhraseFormatted());
            assertEquals("my mother", parsedQuestion.getVerbPhraseFormatted());
        }
        catch (InvalidQuestionError e) {
            fail();
            }
    }

    @Test
    public void idealQuestions() {
        ArrayList<ArrayList<QuestionsHolder>> allIdealQuestions = new ParserQuestions().getAllIdealQuestions();
        for (ArrayList<QuestionsHolder> questions : allIdealQuestions) {
            for (QuestionsHolder questionHolder : questions) {
                try {
                    Question parsedQuestion = myParser.parse(myTagger.tag(questionHolder.getQuestion(), tagger));
                    assertEquals(questionHolder.getAuxiliary(), parsedQuestion.getAuxiliaryFormatted());
                    assertEquals(questionHolder.getNounPhrase(), parsedQuestion.getNounPhraseFormatted());
                    assertEquals(questionHolder.getVerbPhrase(), parsedQuestion.getVerbPhraseFormatted());
                } catch (InvalidQuestionError e) {
                    fail();
                }
            }
        }
    }
}
