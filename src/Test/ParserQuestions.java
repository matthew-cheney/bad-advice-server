package Test;

import java.util.ArrayList;

public class ParserQuestions {

    ArrayList<QuestionsHolder> areQuestions;
    ArrayList<QuestionsHolder> shouldQuestions;
    ArrayList<QuestionsHolder> doQuestions;
    ArrayList<QuestionsHolder> willQuestions;

    public ParserQuestions() {
        fillAreQuestions();
        fillShouldQuestions();
        fillDoQuestions();
        fillWillQuestions();
    }

    public ArrayList<ArrayList<QuestionsHolder>> getAllIdealQuestions() {
        ArrayList<ArrayList<QuestionsHolder>> allIdealQuestions = new ArrayList<>();
        allIdealQuestions.add(areQuestions);
        allIdealQuestions.add(shouldQuestions);
        allIdealQuestions.add(doQuestions);
        allIdealQuestions.add(willQuestions);
        return allIdealQuestions;
    }

    private void fillAreQuestions() {
        areQuestions = new ArrayList<>();
        areQuestions.add(new QuestionsHolder("Are you my mother?", "are", "you", "my mother"));
        areQuestions.add(new QuestionsHolder("Are you happy?", "are", "you", "happy"));
        areQuestions.add(new QuestionsHolder("Are penguins birds?", "are", "penguins", "birds"));
        areQuestions.add(new QuestionsHolder("Are you ready?", "are", "you", "ready"));
        areQuestions.add(new QuestionsHolder("Are the Denver Nuggets going to win?", "are", "the denver nuggets", "going to win"));
        areQuestions.add(new QuestionsHolder("Are we your friends?", "are", "we", "your friends"));
        areQuestions.add(new QuestionsHolder("Are sweet dreams made of these?", "are", "sweet dreams", "made of these"));
        areQuestions.add(new QuestionsHolder("Are you in my head?", "are", "you", "in my head"));
    }

    private void fillShouldQuestions() {
        shouldQuestions = new ArrayList<>();
        shouldQuestions.add(new QuestionsHolder("Should I go to the store?", "should", "i", "go to the store"));
        shouldQuestions.add(new QuestionsHolder("Should I do my homework?", "should", "i","do my homework"));
        shouldQuestions.add(new QuestionsHolder("Should we go out to eat?", "should", "we", "go out to eat"));
        shouldQuestions.add(new QuestionsHolder("Should my wife go to bed?" ,"should", "my wife", "go to bed"));
        shouldQuestions.add(new QuestionsHolder("Should Johnny do his homework?", "should", "johnny", "do his homework"));
        shouldQuestions.add(new QuestionsHolder("Should we just all love each other?", "should", "we", "just all love each other"));
        shouldQuestions.add(new QuestionsHolder("Should the US and Russia go to war?", "should", "the us and russia", "go to war"));
    }

    private void fillDoQuestions() {
        doQuestions = new ArrayList<>();
        doQuestions.add(new QuestionsHolder("Do you love me?", "do", "you", "love me"));
        doQuestions.add(new QuestionsHolder("Do we belong together?", "do", "we", "belong together"));
        doQuestions.add(new QuestionsHolder("Do I have to do my chores?", "do", "i", "have to do my chores"));
        doQuestions.add(new QuestionsHolder("Do potatoes grow on trees?", "do", "potatoes", "grow on trees"));
        doQuestions.add(new QuestionsHolder("Do you believe in me?", "do", "you", "believe in me"));
        doQuestions.add(new QuestionsHolder("Do unicorns exist?", "do", "unicorns", "exist"));
        doQuestions.add(new QuestionsHolder("Do narwhals exist?", "do", "narwhals", "exist"));
    }

    private void fillWillQuestions() {
        willQuestions = new ArrayList<>();
        willQuestions.add(new QuestionsHolder("Will it rain today?", "will", "it", "rain today"));
        willQuestions.add(new QuestionsHolder("Will you be my friend?", "will", "you", "be my friend"));
        willQuestions.add(new QuestionsHolder("Will the cows ever come home?", "will", "the cows", "ever come home"));
        // willQuestions.add(new QuestionsHolder("Will Patrick Stewart star in the new Star Trek series?", "will", "patrick stewart", "star in the new star trek series"));
        willQuestions.add(new QuestionsHolder("Will I be a millionaire?", "will", "i", "be a millionaire"));
        willQuestions.add(new QuestionsHolder("Will the sun come out tomorrow?", "will", "the sun", "come out tomorrow"));
        willQuestions.add(new QuestionsHolder("Will you go to the ball with me?", "will", "you", "go to the ball with me"));
    }
}
