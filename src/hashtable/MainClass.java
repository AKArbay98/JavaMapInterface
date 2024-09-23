package hashtable;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		Hashtable<String, String> phrasalVerbs = new Hashtable<>();

		// put
		System.out.println(phrasalVerbs);
		phrasalVerbs.put("Go back", "Geri dönmek");
		phrasalVerbs.put("Grow up", "Büyümek");
		phrasalVerbs.put("Break down", "Bozulmak");
		phrasalVerbs.put("Try on", "Bir şeyi üzerinde denemek");
		phrasalVerbs.put("Look into", "Bir şeyi araştırmak");
		System.out.println(phrasalVerbs);

		// putAll
		Hashtable<String, String> anotherPhrasalVerbs = new Hashtable<>();
		anotherPhrasalVerbs.put("Bring up", "Bir konudan bahsetmek");
		anotherPhrasalVerbs.put("Come down", "Fiyatı azaltmak");
		phrasalVerbs.putAll(anotherPhrasalVerbs);
		System.out.println(phrasalVerbs);

		// putIfAbsent
		phrasalVerbs.putIfAbsent("Look up", "Bakmak");
		System.out.println(phrasalVerbs);

		// forEach
		phrasalVerbs.forEach((verb, translate) -> {
			System.out.println(verb + ": " + translate);
		});

		// containsKey
		boolean containsKey = phrasalVerbs.containsKey("Get out");
		System.out.println(containsKey);

		// containsValue
		boolean containsValue = phrasalVerbs.containsValue("Uzaklaşmak");
		System.out.println(containsValue);

		// keys()
		Enumeration<String> keys = phrasalVerbs.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key);
		}

		// values()
		Collection<String> values = phrasalVerbs.values();
		System.out.println(values);

		// elements()
		Enumeration<String> elements = phrasalVerbs.elements();
		while (elements.hasMoreElements()) {
			String element = elements.nextElement();
			System.out.println(element);
		}

		// isEmpty
		boolean isEmpty = phrasalVerbs.isEmpty();
		System.out.println(isEmpty);

		// size
		int size = phrasalVerbs.size();
		System.out.println(size);

		// get
		String getLastElement = phrasalVerbs.get("Go back");
		System.out.println(getLastElement);

		// replace
		phrasalVerbs.replace("trial", "trial");
		System.out.println(phrasalVerbs);

		phrasalVerbs.replace("Bring up", "trial");
		System.out.println(phrasalVerbs);

		// replaceAll
		phrasalVerbs.replaceAll((key, value) -> value + "- Phrasal Verb");
		System.out.println(phrasalVerbs);

		// remove
		phrasalVerbs.remove("Break down");
		phrasalVerbs.remove("Look into", "Bir şeyi araştırmak- Phrasal Verb");
		System.out.println(phrasalVerbs);

		// clear
		phrasalVerbs.clear();
		System.out.println(phrasalVerbs);

		// contains
		Hashtable<String, Double> gdpPerCapita = new Hashtable<String, Double>();
		gdpPerCapita.put("Monaco", 240.862);
		gdpPerCapita.put("Ireland", 103.865);
		gdpPerCapita.put("United States", 85.763);
		gdpPerCapita.put("United Kingdom", 51.075);
		System.out.println(gdpPerCapita);
		boolean isContainsCanada = gdpPerCapita.contains("Canada");
		System.out.println(isContainsCanada);

		// compute
		gdpPerCapita.compute("Monaco", (key, value) -> value * 1.1);
		gdpPerCapita.compute("Ireland", (key, value) -> value * 2.5);
		System.out.println(gdpPerCapita);

		// computeIfPresent
		gdpPerCapita.computeIfPresent("United States", (key, value) -> value * 0.5);
		System.out.println(gdpPerCapita);

		// computeIfAbsent
		gdpPerCapita.computeIfAbsent("France", (key) -> 50.0);
		System.out.println(gdpPerCapita);

		// hashCode()
		int hashCode = gdpPerCapita.hashCode();
		System.out.println(hashCode);

		// entrySet()
		Set<Entry<String, Double>> entrySet = gdpPerCapita.entrySet();
		System.out.println(entrySet);

		// keySet
		Set<String> keySet = gdpPerCapita.keySet();
		System.out.println(keySet);

		// equals
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("Key1", 10);
		hashtable.put("key2", 20);
		Hashtable<String, Integer> otherHashtable = new Hashtable<>();
		otherHashtable.put("key1", 10);
		otherHashtable.put("KEY2", 20);
		System.out.println(hashtable.equals(otherHashtable));

		// merge
		gdpPerCapita.merge("Germany", 54.291, (oldValue, newValue) -> oldValue * 1.1);
		System.out.println(gdpPerCapita);

		// toString
		String string = gdpPerCapita.toString();
		System.out.println(string);

	}

}
