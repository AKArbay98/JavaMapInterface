package mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		Map<Integer, String> skinsCharacters = new HashMap<Integer, String>();

		// put
		System.out.println("Skins Characters: " + skinsCharacters);
		skinsCharacters.put(1, "Effie Stonem");
		skinsCharacters.put(2, "Cassie Ainsworth");
		skinsCharacters.put(3, "James Cook");
		skinsCharacters.put(4, "Sid Jenkins");
		skinsCharacters.put(5, "Tony Stonem");
		skinsCharacters.put(6, "Freddie McClair");
		skinsCharacters.put(7, "Maxxie Oliver");
		skinsCharacters.put(8, "Michelle Richardson");
		System.out.println("Skins Characters: " + skinsCharacters);

		// putIfAbsent
		skinsCharacters.putIfAbsent(9, "Chris Miles");
		skinsCharacters.putIfAbsent(10, "Katie Fitch");
		System.out.println("Skins Characters: " + skinsCharacters);

		// putAll
		Map<Integer, String> moreSkinsCharacters = new HashMap<Integer, String>();
		moreSkinsCharacters.put(9, "Anwar Kharral");
		moreSkinsCharacters.put(10, "Pandora Moon");
		moreSkinsCharacters.put(11, "Posh Kenneth");
		moreSkinsCharacters.put(12, "JJ Jones");
		moreSkinsCharacters.put(13, "Naomi Campbell");
		skinsCharacters.putAll(moreSkinsCharacters);
		System.out.println("Skins Characters: " + skinsCharacters);

		// isEmpty
		boolean isEmpty = skinsCharacters.isEmpty();
		System.out.println(isEmpty);

		// size()
		int size = skinsCharacters.size();
		System.out.println("Size of Skins Character: " + size);

		// containsKey
		boolean isContainsKey = skinsCharacters.containsKey(2);
		System.out.println("is Contains Key: " + isContainsKey);

		// containsValue
		boolean isContainsValue = skinsCharacters.containsValue("Katie");
		System.out.println("is Contains Value: " + isContainsValue);

		// entrySet
		Set<Entry<Integer, String>> entrySet = skinsCharacters.entrySet();
		System.out.println("Entry Set: " + entrySet);

		// keySet
		Set<Integer> keySet = skinsCharacters.keySet();
		System.out.println("Key Set: " + keySet);

		// hashCode
		int hashCode = skinsCharacters.hashCode();
		System.out.println("HashCode: " + hashCode);

		// values
		Collection<String> values = skinsCharacters.values();
		System.out.println("Values: " + values);

		// get
		String stringOne = skinsCharacters.get(1);
		System.out.println(stringOne);

		// getOrDefault
		String stringTwo = skinsCharacters.getOrDefault(5, "a");
		System.out.println(stringTwo);

		// forEach
		skinsCharacters.forEach((id, name) -> {
			System.out.println(id + ": " + name);
		});

		// toString
		String string = skinsCharacters.toString();
		System.out.println("String: " + string);

		// replace
		skinsCharacters.replace(7, "Max Oliver");
		System.out.println("Replaced: " + skinsCharacters);

		// replaceAll
		skinsCharacters.replaceAll((id, name) -> name.toUpperCase());
		System.out.println("Replaced All: " + skinsCharacters);

		// compute
		String compute = skinsCharacters.compute(4, (id, name) -> name.substring(3));
		System.out.println(compute);
		System.out.println(skinsCharacters);

		// computeIfAbsent
		String skins = skinsCharacters.computeIfAbsent(4, (name) -> "");
		System.out.println(skins);
		System.out.println(skinsCharacters);

		// computeIfPresent
		String skinsTwo = skinsCharacters.computeIfPresent(2, (key, oldValue) -> "Cas");
		System.out.println(skinsTwo);
		System.out.println(skinsCharacters);

		// remove
		skinsCharacters.remove(9);
		System.out.println(skinsCharacters);

		// clear
		skinsCharacters.clear();
		System.out.println(skinsCharacters);

	}

}
