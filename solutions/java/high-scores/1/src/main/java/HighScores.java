import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class HighScores {
    private final List<Integer> scores;

    public HighScores(List<Integer> highScores) {
        this.scores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return scores;
    }

    Integer latest() {
        return scores.get(scores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(scores);
    }

    List<Integer> personalTopThree() {
        List<Integer> sorted = new ArrayList<>(scores);
        
        sorted.sort(Collections.reverseOrder());
        
        int count = Math.min(3, sorted.size());
        return sorted.subList(0, count);
    }
}