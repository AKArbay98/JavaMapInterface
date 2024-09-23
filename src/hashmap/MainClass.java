package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		HashMap<String, Integer> literatureOfAmerican = new HashMap<>();

		// put
		literatureOfAmerican.put("To Kill a Mockingbird", 1);
		literatureOfAmerican.put("The Great Gatsby", 2);
		literatureOfAmerican.put("The Adventures of Huckleberry Finn", 3);
		literatureOfAmerican.put("The Grapes of Wrath", 4);
		literatureOfAmerican.put("The Catcher in the Rye", 5);
		literatureOfAmerican.put("East of Eden", 6);
		literatureOfAmerican.put("Moby-Dick or, The Whale", 7);
		literatureOfAmerican.put("Of Mice and Men", 8);
		literatureOfAmerican.put("On the Road", 9);
		literatureOfAmerican.put("Fahrenheit 451", 10);
		System.out.println(literatureOfAmerican);

		// putAll
		HashMap<String, Integer> anotherLiteratureOfAmerican = new HashMap<>();
		anotherLiteratureOfAmerican.put("The Old Man and the Sea", 1);
		anotherLiteratureOfAmerican.put("The Adventures of Tom Sawyer", 2);
		anotherLiteratureOfAmerican.put("A Farewell to Arms", 3);
		anotherLiteratureOfAmerican.put("The Call of the Wild", 4);
		literatureOfAmerican.putAll(anotherLiteratureOfAmerican);
		System.out.println(literatureOfAmerican);

		// putIfAbsent
		HashMap<String, String> weirdMyMap = new HashMap<>();
		String resultOne = weirdMyMap.putIfAbsent("apple", "red");
		System.out.println("Result 1: " + resultOne);

		String resultTwo = weirdMyMap.putIfAbsent("banana", "yellow");
		System.out.println("Result 2: " + resultTwo);

		String resultThree = weirdMyMap.putIfAbsent("apple", "green");
		System.out.println("Result 3: " + resultThree);

		String fruitColorOfBanana = weirdMyMap.get("banana");
		System.out.println("Color of banana: " + fruitColorOfBanana);

		String fruitColorOfApple = weirdMyMap.get("apple");
		System.out.println("Color of banana: " + fruitColorOfApple);

		// isEmpty
		HashMap<String, String> footballClubs = new HashMap<>();
		footballClubs.put("La liga", "FC Barcelona");
		footballClubs.put("Premier League", "Manchester United");
		footballClubs.put("Bundesliga", "Bayern München");
		boolean isEmpty = footballClubs.isEmpty();
		System.out.println(isEmpty);

		// get
		HashMap<String, Boolean> titanic = new HashMap<>();
		titanic.put("Braund, Mr. Owen Harris", false);
		titanic.put("Cumings, Mrs. John Bradley", true);
		titanic.put("Heikkinen, Miss. Laina", true);
		titanic.put("Futrelle, Mrs. Jacques Heath", true);
		titanic.put("Allen, Mr. William Henry", false);
		titanic.put("Moran, Mr. James", false);
		titanic.put("McCarthy, Mr. Timothy J", false);
		titanic.put("Palsson, Master. Gosta Leonard", false);
		titanic.put("Johnson, Mrs. Oscar W", true);
		titanic.put("Nasser, Mrs. Nicholas", true);
		Boolean wasAlivePassengerOne = titanic.get("McCarthy, Mr. Timothy J");
		Boolean wasAlivePassengerTwo = titanic.get("Nasser, Mrs. Nicholas");
		System.out.println(wasAlivePassengerOne);
		System.out.println(wasAlivePassengerTwo);

		// hashCode
		int hashCode = titanic.hashCode();
		System.out.println(hashCode);

		// remove
		System.out.println(titanic);
		titanic.remove("Nasser, Mrs. Nicholas");
		System.out.println(titanic);

		// remove(args, args)
		titanic.remove("Moran, Mr. James", false);
		System.out.println(titanic);

		// clear
		titanic.clear();
		System.out.println(titanic);

		// size
		int size = titanic.size();
		System.out.println(size);

		// replace
		HashMap<String, Integer> newYorkZipCodes = new HashMap<>();
		newYorkZipCodes.put("Manhattan", 10003);
		newYorkZipCodes.put("Bronx", 10467);
		newYorkZipCodes.put("Brooklyn", 11206);
		newYorkZipCodes.put("Staten", 10305);
		newYorkZipCodes.put("Queens", 11372);
		newYorkZipCodes.replace("Manhattan", 234234);
		newYorkZipCodes.replace("Staten", 10305, 7777);
		System.out.println(newYorkZipCodes);

		// replaceAll
		newYorkZipCodes.replaceAll((k, v) -> v + 1000);
		System.out.println(newYorkZipCodes);

		// keySet
		Set<String> keySetOfNewYorkZipCodes = newYorkZipCodes.keySet();
		System.out.println(keySetOfNewYorkZipCodes);

		// compute
		HashMap<String, Integer> nbaChampions = new HashMap<>();
		nbaChampions.put("Boston Celtics", 18);
		nbaChampions.put("Los Angeles Lakers", 17);
		nbaChampions.put("Golden State Warriors", 7);
		nbaChampions.put("Chicago Bulls", 6);
		nbaChampions.put("San Antonio Spurs", 5);
		nbaChampions.put("Philadelphia 76ers", 3);
		nbaChampions.put("Detroit Pistons", 3);
		nbaChampions.put("Miami Heat", 3);
		nbaChampions.put("New York Knicks", 2);
		System.out.println(nbaChampions);

		nbaChampions.compute("Boston Celtics", (k, v) -> v * 2);
		System.out.println(nbaChampions);

		// values
		Collection<Integer> values = nbaChampions.values();
		System.out.println(values);

		// computeIfAbsent
		nbaChampions.computeIfAbsent("Milwaukee Bucks", k -> 0);
		System.out.println(nbaChampions);

		// computeIfPresent
		nbaChampions.computeIfPresent("Los Angeles Lakers", (k, v) -> v + 1);
		System.out.println(nbaChampions);

		// containsKey
		boolean isContainsKey = nbaChampions.containsKey("San Antonio Spurs");
		System.out.println(isContainsKey);

		// containsValue
		boolean isContainsValueOne = nbaChampions.containsValue(3);
		boolean isContainsValueTwo = nbaChampions.containsValue(77);
		System.out.println(isContainsValueOne);
		System.out.println(isContainsValueTwo);

		// entrySet
		Set<Map.Entry<String, Integer>> entries = nbaChampions.entrySet();

		for (Map.Entry<String, Integer> entry : entries) {
			String team = entry.getKey();
			int championships = entry.getValue();
			System.out.println(team + ": " + championships);
		}

		// forEach
		HashMap<String, String> countryAndCitiesOfEurope = new HashMap<String, String>();
		countryAndCitiesOfEurope.put("Spain", "Barcelona");
		countryAndCitiesOfEurope.put("Germany", "Aachen");
		countryAndCitiesOfEurope.put("United Kingdom", "Bristol");
		countryAndCitiesOfEurope.put("N.Ireland", "Belfast");
		countryAndCitiesOfEurope.put("Portugal", "Porto");
		countryAndCitiesOfEurope.forEach((country, city) -> {
			System.out.println(country + ": " + city);
		});

		// toString
		String mapString = countryAndCitiesOfEurope.toString();
		System.out.println(mapString);

		// merge
		countryAndCitiesOfEurope.merge("France", "Paris", (existingValue, newValue) -> {
			return "Multiple cities: " + existingValue + ", " + newValue;
		});
		System.out.println(countryAndCitiesOfEurope);

	}

}
