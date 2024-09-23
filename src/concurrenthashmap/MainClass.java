package concurrenthashmap;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		ConcurrentHashMap<String, Integer> cityTemperature = new ConcurrentHashMap<>();

		// put
		System.out.println(cityTemperature);
		cityTemperature.put("Istanbul", 28);
		cityTemperature.put("Dublin", 14);
		cityTemperature.put("Houston", 25);
		cityTemperature.put("Rome", 31);
		System.out.println(cityTemperature);

		// putAll
		ConcurrentHashMap<String, Integer> moreCityTemperature = new ConcurrentHashMap<>();
		moreCityTemperature.put("Bristol", 18);
		moreCityTemperature.put("Vienna", 17);
		cityTemperature.putAll(moreCityTemperature);
		System.out.println(cityTemperature);

		// putIfAbsent
		cityTemperature.putIfAbsent("New York", 20);
		System.out.println(cityTemperature);

		// size
		int size = cityTemperature.size();
		System.out.println(size);

		// values
		Collection<Integer> values = cityTemperature.values();
		for (Integer integer : values) {
			System.out.println(integer);
		}

		// elements
		Enumeration<Integer> elements = cityTemperature.elements();
		System.out.println(elements);

		// isEmpty
		boolean isEmpty = cityTemperature.isEmpty();
		System.out.println(isEmpty);

		// replace
		cityTemperature.replace("New York", 18);
		System.out.println(cityTemperature);

		// replaceAll
		cityTemperature.replaceAll((key, oldValue) -> oldValue + 2);
		System.out.println("New Temperature of Cities: " + cityTemperature);

		// mappingCount
		long numberOfMappings = cityTemperature.mappingCount();
		System.out.println("Number Of Mappings: " + numberOfMappings);

		// keys
		Enumeration<String> keys = cityTemperature.keys();
		System.out.println("Keys: " + keys);

		// keySet
		KeySetView<String, Integer> keySet = cityTemperature.keySet();
		System.out.println("Key Set: :" + keySet);

		// hashCode
		int hashCode = cityTemperature.hashCode();
		System.out.println(hashCode);

		// toString
		String string = cityTemperature.toString();
		System.out.println(string);

		// entrySet
		Set<Entry<String, Integer>> entrySet = cityTemperature.entrySet();
		System.out.println(entrySet);

		// contains
		boolean isContains = cityTemperature.containsKey("Istanbul");
		System.out.println("Contains Istanbul: " + isContains);

		// containsKey
		boolean isContainsKey = cityTemperature.containsKey("Dublin");
		System.out.println("Contains Dublin: " + isContainsKey);

		// containsValue
		boolean isContainsValue = cityTemperature.containsValue(14);
		System.out.println("Contains 14: " + isContainsValue);

		// get
		Integer integer = cityTemperature.get("Houston");
		System.out.println(integer);

		// getOrDefault
		Integer orDefault = cityTemperature.getOrDefault("Karachi", 28);
		System.out.println(orDefault);

		// search
		String result = cityTemperature.search(1, (city, temperature) -> {
			if (temperature > 30) {
				return city + " has a temperature of " + temperature + "°C";
			}
			return null;
		});
		System.out.println(result);

		// compute
		Integer compute = cityTemperature.compute("Dublin", (key, value) -> value - 5);
		System.out.println(compute);

		// computeIfAbsent
		Integer computeIfAbsent = cityTemperature.computeIfAbsent("Warsaw", key -> 22);
		System.out.println(computeIfAbsent);

		// computeIfPresent
		Integer computeIfPresent = cityTemperature.computeIfPresent("Istanbul", (key, value) -> value + 1);
		System.out.println(computeIfPresent);

		// remove
		System.out.println(cityTemperature);
		cityTemperature.remove("Dublin");
		cityTemperature.remove("Rome", 31);
		System.out.println(cityTemperature);

		// clear
		cityTemperature.clear();
		System.out.println(cityTemperature);

	}

}
