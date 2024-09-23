package concurrentmapinterface;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		ConcurrentMap<String, Integer> cityHumidity = new ConcurrentHashMap<>();

		// put
		cityHumidity.put("Vienna", 60);
		cityHumidity.put("Istanbul", 7);
		cityHumidity.put("Bristol", 2);
		cityHumidity.put("New York", 20);
		System.out.println(cityHumidity);

		// putAll
		ConcurrentMap<String, Integer> moreCityHumidity = new ConcurrentHashMap<>();
		moreCityHumidity.put("Paris", 55);
		moreCityHumidity.put("London", 30);
		cityHumidity.putAll(moreCityHumidity);
		System.out.println(cityHumidity);

		// putIfAbsent
		cityHumidity.putIfAbsent("Tokyo", 34);
		System.out.println(cityHumidity);

		// isEmpty
		boolean isEmpty = cityHumidity.isEmpty();
		System.out.println(isEmpty);

		// size
		int size = cityHumidity.size();
		System.out.println(size);

		// hashCode
		int hashCode = cityHumidity.hashCode();
		System.out.println(hashCode);

		// containsKey
		boolean isContainsKey = cityHumidity.containsKey("Barcelona");
		System.out.println(isContainsKey);

		// containsValue
		boolean isContainsValue = cityHumidity.containsValue(77);
		System.out.println(isContainsValue);

		// values
		Collection<Integer> values = cityHumidity.values();
		System.out.println(values);

		// get
		Integer integer = cityHumidity.get("Bristol");
		System.out.println(integer);

		// entrySet
		Set<Entry<String, Integer>> entrySet = cityHumidity.entrySet();
		System.out.println(entrySet);

		// keySet
		Set<String> keySet = cityHumidity.keySet();
		System.out.println(keySet);

		// replace
		Integer replace = cityHumidity.replace("London", 44);
		System.out.println(replace);
		System.out.println(cityHumidity);

		// replaceAll
		cityHumidity.replaceAll((key, value) -> value + 7);
		System.out.println("Update of city humidity: " + cityHumidity);

		// compute
		cityHumidity.compute("Vienna", (key, val) -> (val == null) ? 0 : val + 5);
		cityHumidity.compute("Istanbul", (key, val) -> (val < 10) ? 50 : val);
		System.out.println(cityHumidity);

		// computeIfAbsent
		cityHumidity.computeIfAbsent("Bristol", key -> 0);
		System.out.println(cityHumidity);

		// computeIfPresent
		cityHumidity.computeIfPresent("New York", (k, v) -> v + 10);
		System.out.println(cityHumidity);

		// forEach
		cityHumidity.forEach((city, humidity) -> {
			System.out.println(city + ": " + humidity);
		});

		// toString
		String string = cityHumidity.toString();
		System.out.println(string);

		// remove
		System.out.println(cityHumidity);
		cityHumidity.remove("New York");
		System.out.println(cityHumidity);
		cityHumidity.remove("London", 44);
		System.out.println(cityHumidity);

		// clear
		cityHumidity.clear();
		System.out.println(cityHumidity);

	}

}
