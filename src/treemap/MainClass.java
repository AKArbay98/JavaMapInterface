package treemap;

import java.util.Collection;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {

		// constructors
		TreeMap<String, Long> oceaniaCountriesPopulation = new TreeMap<>();

		// put
		System.out.println("Oceania Countries Population: " + oceaniaCountriesPopulation);
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
		System.out.println("Oceania Countries Population: " + oceaniaCountriesPopulation);

		// putAll
		TreeMap<String, Long> moreOceanCountries = new TreeMap<>();
		moreOceanCountries.put("Marshall Islands", 41996L);
		moreOceanCountries.put("Nauru", 12780L);
		oceaniaCountriesPopulation.putAll(moreOceanCountries);
		System.out.println("Oceania Countries Population: " + oceaniaCountriesPopulation);

		// putIfAbsent
		oceaniaCountriesPopulation.putIfAbsent("Wallis and Futuna", 11502L);
		System.out.println("Oceania Countries Population: " + oceaniaCountriesPopulation);

		// containsKey
		boolean isContainsKey = oceaniaCountriesPopulation.containsKey("Australia");
		System.out.println("Is Contains Key: " + isContainsKey);

		// containsValue
		boolean isContainsValue = oceaniaCountriesPopulation.containsValue(740425L);
		System.out.println("Is Contains Value: " + isContainsValue);

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
		System.out.println(firstKey);

		// values
		Collection<Long> values = oceaniaCountriesPopulation.values();
		System.out.println(values);

		// hashCode
		int hashCode = oceaniaCountriesPopulation.hashCode();
		System.out.println(hashCode);

		// isEmpty
		boolean isEmpty = oceaniaCountriesPopulation.isEmpty();
		System.out.println("Is Empty: " + isEmpty);

		// size
		int size = oceaniaCountriesPopulation.size();
		System.out.println("Size: " + size);

		// get
		Long countryOne = oceaniaCountriesPopulation.get("Tonga");
		System.out.println(countryOne);

		// compute
		oceaniaCountriesPopulation.compute("Fiji", (key, val) -> (val == null) ? 0L : val + 5L);
		oceaniaCountriesPopulation.compute("Kiribati", (key, val) -> (val < 100000L) ? 50000L : val);
		System.out.println(oceaniaCountriesPopulation);

		// computeIfAbsent
		oceaniaCountriesPopulation.computeIfAbsent("Tonga", key -> 20000L);
		System.out.println(oceaniaCountriesPopulation);

		// computeIfPresent
		Long population = oceaniaCountriesPopulation.computeIfPresent("Australia",
				(country, population1) -> population1 + 1000000);
		System.out.println(population);

		// forEach
		oceaniaCountriesPopulation.forEach((country, population2) -> {
			System.out.println(country + ": " + population2);
		});

		// headMap
		SortedMap<String, Long> headMap = oceaniaCountriesPopulation.headMap("Papua New Guinea");
		System.out.println("Oceania Countries Population Head Map: " + headMap);

		// subMap
		SortedMap<String, Long> subMap = oceaniaCountriesPopulation.subMap("Fiji", "Vanuatu");
		System.out.println("Countries between 'Fiji' and 'Vanuatu' in the map:");
		subMap.forEach((country, population3) -> System.out.println(country + ": " + population3));

		// tailMap
		SortedMap<String, Long> tailMap = oceaniaCountriesPopulation.tailMap("Papua New Guinea");
		System.out.println("Oceania Countries Population Tail Map: " + tailMap);

		// pollFirstEntry
		Entry<String, Long> pollFirstEntry = oceaniaCountriesPopulation.pollFirstEntry();
		System.out.println("Poll First Entry: " + pollFirstEntry);

		// pollLastEntry
		Entry<String, Long> pollLastEntry = oceaniaCountriesPopulation.pollLastEntry();
		System.out.println("Poll Last Entry: " + pollLastEntry);

		// replace
		oceaniaCountriesPopulation.replace("Fiji", 800000L);
		System.out.println(oceaniaCountriesPopulation);

		// replaceAll
		oceaniaCountriesPopulation.replaceAll((country, population4) -> population4 + 1000);
		System.out.println(oceaniaCountriesPopulation);

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

		// ceilingEntry
		Entry<String, Long> ceilingEntry = oceaniaCountriesPopulation.ceilingEntry("Fiji");
		System.out.println(ceilingEntry);

		// ceilingKey
		String ceilingKey = oceaniaCountriesPopulation.ceilingKey("Fiji");
		System.out.println(ceilingKey);

		// descendingKeySet
		NavigableSet<String> descendingKeySet = oceaniaCountriesPopulation.descendingKeySet();
		System.out.println(descendingKeySet);

		// descendingMap
		NavigableMap<String, Long> descendingMap = oceaniaCountriesPopulation.descendingMap();
		System.out.println(descendingMap);

		// floorEntry
		Entry<String, Long> floorEntry = oceaniaCountriesPopulation.floorEntry("Fiji");
		System.out.println(floorEntry);

		// floorKey
		String floorKey = oceaniaCountriesPopulation.floorKey("Fiji");
		System.out.println(floorKey);

		// higherEntry
		Entry<String, Long> higherEntry = oceaniaCountriesPopulation.higherEntry("Fiji");
		System.out.println(higherEntry);

		// higherKey
		String higherKey = oceaniaCountriesPopulation.higherKey("Fiji");
		System.out.println(higherKey);

		// lastKey
		String lastKey = oceaniaCountriesPopulation.lastKey();
		System.out.println(lastKey);

		// lowerEntry
		Entry<String, Long> lowerEntry = oceaniaCountriesPopulation.lowerEntry("Fiji");
		System.out.println(lowerEntry);

		// lowerKey
		String lowerKey = oceaniaCountriesPopulation.lowerKey("Fiji");
		System.out.println(lowerKey);

		// navigableKeySet
		NavigableSet<String> navigableKeySet = oceaniaCountriesPopulation.navigableKeySet();
		System.out.println(navigableKeySet);

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
