package sortedmapinterface;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		SortedMap<String, Long> oceaniaCountriesPopulation = new ConcurrentSkipListMap<>();

		// put
		System.out.println("Ocenia Countries Population: " + oceaniaCountriesPopulation);
		oceaniaCountriesPopulation.put("Australia", 26439112L);
		oceaniaCountriesPopulation.put("Papua New Guinea", 10329931L);
		oceaniaCountriesPopulation.put("New Zealand", 5228100L);
		oceaniaCountriesPopulation.put("Fiji", 936376L);
		oceaniaCountriesPopulation.put("Solomon Islands", 740425L);
		oceaniaCountriesPopulation.put("Vanuatu", 334506L);
		oceaniaCountriesPopulation.put("Samoa", 225681L);
		oceaniaCountriesPopulation.put("Kiribati", 133515L);
		oceaniaCountriesPopulation.put("Micronesia", 115224L);
		oceaniaCountriesPopulation.put("Tonga", 107773L);
		System.out.println("Ocenia Countries Population: " + oceaniaCountriesPopulation);

		// putAll
		SortedMap<String, Long> moreOceanCountries = new ConcurrentSkipListMap<>();
		moreOceanCountries.put("Marshall Islands", 41996L);
		moreOceanCountries.put("Nauru", 12780L);
		oceaniaCountriesPopulation.putAll(moreOceanCountries);
		System.out.println("Ocenia Countries Population: " + oceaniaCountriesPopulation);

		// putIfAbsent
		oceaniaCountriesPopulation.putIfAbsent("Wallis and Futuna", 11502L);
		System.out.println("Ocenia Countries Population: " + oceaniaCountriesPopulation);

		// containsKey
		boolean isContainsKey = oceaniaCountriesPopulation.containsKey("Australia");
		System.out.println("is Contains Key: " + isContainsKey);

		// containsValue
		boolean isContainsValue = oceaniaCountriesPopulation.containsValue(740425L);
		System.out.println("is Contains Value: " + isContainsValue);

		// entrySet
		Set<Entry<String, Long>> entrySet = oceaniaCountriesPopulation.entrySet();
		System.out.println("Entry Set: " + entrySet);

		// keySet
		Set<String> keySet = oceaniaCountriesPopulation.keySet();
		System.out.println("Key Set: " + keySet);

		// firstEntry
		Entry<String, Long> firstEntry = oceaniaCountriesPopulation.firstEntry();
		System.out.println("First Entry: " + firstEntry);

		// lastEntry
		Entry<String, Long> lastEntry = oceaniaCountriesPopulation.lastEntry();
		System.out.println("Last Entry: " + lastEntry);

		// firstKey
		String firstKey = oceaniaCountriesPopulation.firstKey();
		System.out.println("First Key: " + firstKey);

		// values
		Collection<Long> values = oceaniaCountriesPopulation.values();
		System.out.println("Values: " + values);

		// hashCode
		int hashCode = oceaniaCountriesPopulation.hashCode();
		System.out.println("hashCode: " + hashCode);

		// isEmpty
		boolean isEmpty = oceaniaCountriesPopulation.isEmpty();
		System.out.println("is Empty: " + isEmpty);

		// size
		int size = oceaniaCountriesPopulation.size();
		System.out.println("Size: " + size);

		// get
		Long countryOne = oceaniaCountriesPopulation.get("Tonga");
		System.out.println("Get Tonga Population: " + countryOne);

		// compute
		oceaniaCountriesPopulation.compute("Fiji", (key, val) -> (val == null) ? 0L : val + 5L);
		oceaniaCountriesPopulation.compute("Kiribati", (key, val) -> (val < 100000L) ? 50000L : val);
		System.out.println(oceaniaCountriesPopulation);

		// computeIfAbsent
		oceaniaCountriesPopulation.computeIfAbsent("Tonga", key -> 20000L);
		System.out.println(oceaniaCountriesPopulation);

		// forEach
		oceaniaCountriesPopulation.forEach((country, population) -> {
			System.out.println(country + ": " + population);
		});

		// headMap
		SortedMap<String, Long> headMap = oceaniaCountriesPopulation.headMap("Papua New Guinea");
		System.out.println("Oceania Countries Population Head Map for Papua New Guinea: " + headMap);

		// subMap
		SortedMap<String, Long> subMap = oceaniaCountriesPopulation.subMap("Fiji", "Vanuatu");
		System.out.println("Countries between 'Fiji' and 'Vanuatu' in the map:");
		subMap.forEach((country, population) -> System.out.println(country + ": " + population));

		// tailMap
		SortedMap<String, Long> tailMap = oceaniaCountriesPopulation.tailMap("Papua New Guinea");
		System.out.println("Oceania Countries Population Tail Map for Papua New Guinea: " + tailMap);

		// pollFirstEntry
		Entry<String, Long> pollFirstEntry = oceaniaCountriesPopulation.pollFirstEntry();
		System.out.println("Poll First Entry: " + pollFirstEntry);

		// pollLastEntry
		Entry<String, Long> pollLastEntry = oceaniaCountriesPopulation.pollLastEntry();
		System.out.println("Poll Last Entry: " + pollLastEntry);

		// replace
		oceaniaCountriesPopulation.replace("Fiji", 800000L);
		System.out.println("Replaced: " + oceaniaCountriesPopulation);

		// replaceAll
		oceaniaCountriesPopulation.replaceAll((country, population) -> population + 1000);
		System.out.println("Replaced All: " + oceaniaCountriesPopulation);

		// sequencedEntrySet
		SequencedSet<Entry<String, Long>> sequencedEntrySet = oceaniaCountriesPopulation.sequencedEntrySet();
		System.out.println("Sequenced Entry Set: " + sequencedEntrySet);

		// sequencedKeySet
		SequencedSet<String> sequencedKeySet = oceaniaCountriesPopulation.sequencedKeySet();
		System.out.println(sequencedKeySet);

		// sequencedValues
		SequencedCollection<Long> sequencedValues = oceaniaCountriesPopulation.sequencedValues();
		System.out.println(sequencedValues);

		// toString
		String string = oceaniaCountriesPopulation.toString();
		System.out.println(string);

		// remove
		System.out.println(oceaniaCountriesPopulation);
		oceaniaCountriesPopulation.remove("Micronesia");
		System.out.println(oceaniaCountriesPopulation);
		oceaniaCountriesPopulation.remove("Nauru", 12780);
		System.out.println(oceaniaCountriesPopulation);

		// clear
		oceaniaCountriesPopulation.clear();
		System.out.println(oceaniaCountriesPopulation);

	}

}
