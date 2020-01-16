// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.*;
import java.util.stream.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<String>> threeKeywordSuggestions(int numreviews,
                                               List<String> repository,
                                               String customerQuery)
    {
        List<List<String>> finalList = new ArrayList<>();



        List<String> suggestionList = getSuggestionKeywords(customerQuery);

        for(String str : suggestionList){
            List<String> list = getThreeKeywordSuggesion(str, repository);
            finalList.add(list);
        }

        // search all the items from the repository against all the suggestionList

        // split customerQuery in multiple strings

        return finalList;
        // WRITE YOUR CODE HERE
    }

    public List<String> getSuggestionKeywords(String customerQuery){
        List<String> stringSubset = new ArrayList<String>();
        for(int i=1; i < customerQuery.length(); i++){
            stringSubset.add(customerQuery.substring(0, i+1));
        }
        return stringSubset;
    }

    public List<String> getThreeKeywordSuggesion(String keyword, List<String> repository){
        Collections.sort(repository);
        List<String> suggestion = repository.stream()
                .filter(val -> val.startsWith(keyword)).limit(3)
                .collect(Collectors.toList());
        return suggestion;
    }
    // METHOD SIGNATURE ENDS
}