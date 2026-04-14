import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iHaveSomethingNew = !theirCollection.containsAll(myCollection);
        boolean theyHaveSomethingNew = !myCollection.containsAll(theirCollection);

        return iHaveSomethingNew && theyHaveSomethingNew;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return Collections.emptySet();
        }

        Set<String> intersection = new HashSet<>(collections.get(0));

        for (Set<String> currentCollection : collections) {
            intersection.retainAll(currentCollection);
        }

        return intersection;
    }
    

    static Set<String> allCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return Collections.emptySet();
        }

        Set<String> union = new HashSet<>();

        for (Set<String> collection : collections) {
            union.addAll(collection);
        }

        return union;
    }
}
