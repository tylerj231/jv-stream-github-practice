package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {

    @Override
    public boolean test(Candidate candidate) {
        int from = Integer.parseInt(candidate.getPeriodsInUkr().split("-")[0]);
        int to = Integer.parseInt(candidate.getPeriodsInUkr().split("-")[1]);
        return candidate.getClass() == Candidate.class
                && candidate.getAge() >= 35
                && candidate.isAllowedToVote()
                && candidate.getNationality().equals("Ukrainian")
                && to - from >= 10;
    }
}
