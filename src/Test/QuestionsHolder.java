package Test;

import java.util.ArrayList;
import java.util.Objects;

public class QuestionsHolder {

    String question;
    String auxiliary;
    String nounPhrase;
    String verbPhrase;

    public QuestionsHolder(String question, String auxiliary, String nounPhrase, String verbPhrase) {
        this.question = question;
        this.auxiliary = auxiliary;
        this.nounPhrase = nounPhrase;
        this.verbPhrase = verbPhrase;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAuxiliary() {
        return auxiliary;
    }

    public void setAuxiliary(String auxiliary) {
        this.auxiliary = auxiliary;
    }

    public String getNounPhrase() {
        return nounPhrase;
    }

    public void setNounPhrase(String nounPhrase) {
        this.nounPhrase = nounPhrase;
    }

    public String getVerbPhrase() {
        return verbPhrase;
    }

    public void setVerbPhrase(String verbPhrase) {
        this.verbPhrase = verbPhrase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionsHolder)) return false;
        QuestionsHolder that = (QuestionsHolder) o;
        return question.equals(that.question) &&
                auxiliary.equals(that.auxiliary) &&
                nounPhrase.equals(that.nounPhrase) &&
                verbPhrase.equals(that.verbPhrase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, auxiliary, nounPhrase, verbPhrase);
    }

    @Override
    public String toString() {
        return "QuestionsHolder{" +
                "question='" + question + '\'' +
                ", auxiliary='" + auxiliary + '\'' +
                ", nounPhrase='" + nounPhrase + '\'' +
                ", verbPhrase='" + verbPhrase + '\'' +
                '}';
    }
}
