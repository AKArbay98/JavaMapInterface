package linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		LinkedHashMap<String, String> britishRockSongs = new LinkedHashMap<>();

		// put
		System.out.println(britishRockSongs);
		britishRockSongs.put("Bohemian Rhapsody", "Queen");
		britishRockSongs.put("Stairway to Heaven", "Led Zeppelin");
		britishRockSongs.put("Imagine", "John Lennon");
		britishRockSongs.put("Wonderwall", "Oasis");
		britishRockSongs.put("Creep", "Radiohead");
		britishRockSongs.put("Another Brick in the Wall", "Pink Floyd");
		britishRockSongs.put("Heroes", "David Bowie");
		britishRockSongs.put("Side", "Travis");
		britishRockSongs.put("Paradise", "Coldplay");
		System.out.println(britishRockSongs);

		// putFirst
		britishRockSongs.putFirst("Soldier of Fortune", "Deep Purple");
		System.out.println(britishRockSongs);

		// putLast
		britishRockSongs.putLast("While My Guitar Gently Weeps", "The Beatles");
		System.out.println(britishRockSongs);

		// putIfAbsent
		britishRockSongs.putIfAbsent("Keane", "Somewhere Only We Know");

		// putAll
		LinkedHashMap<String, String> moreBritishRockSongs = new LinkedHashMap<>();
		moreBritishRockSongs.put("Karma Police", "Radiohead");
		moreBritishRockSongs.put("No Suprises", "Radiohead");
		moreBritishRockSongs.put("Creep", "Radiohead"); // sadece bu eklendi.
		britishRockSongs.putAll(moreBritishRockSongs);

		// get
		String stringOne = britishRockSongs.get("Soldier of Fortune");
		System.out.println(stringOne);

		// isEmpty
		boolean isEmpty = britishRockSongs.isEmpty();
		System.out.println(isEmpty);

		// size
		int size = britishRockSongs.size();
		System.out.println(size);

		// replace
		britishRockSongs.replace("While My Guitar Gently Weeps", "Eric Clapton");
		System.out.println(britishRockSongs);

		// replaceAll
		britishRockSongs.replaceAll((song, band) -> band.toUpperCase());
		System.out.println(britishRockSongs);

		// sequencedEntryset
		SequencedSet<Entry<String, String>> sequencedEntrySet = britishRockSongs.sequencedEntrySet();
		System.out.println("Sequenced Entry Set: " + sequencedEntrySet);

		// sequencedKeyset
		SequencedSet<String> sequencedKeySet = britishRockSongs.sequencedKeySet();
		System.out.println("Sequenced Key Set: " + sequencedKeySet);

		// sequencedValues
		SequencedCollection<String> sequencedValues = britishRockSongs.sequencedValues();
		System.out.println("Sequenced Values: " + sequencedValues);

		// firstEntry
		Entry<String, String> firstEntry = britishRockSongs.firstEntry();
		System.out.println("First Entry: " + firstEntry);

		// lastEntry
		Entry<String, String> lastEntry = britishRockSongs.lastEntry();
		System.out.println("Last Entry: " + lastEntry);

		// keySet
		Set<String> keySet = britishRockSongs.keySet();
		System.out.println("Key Set: " + keySet);

		// values
		Collection<String> values = britishRockSongs.values();
		System.out.println("Values: " + values);

		// hashCode
		int hashCode = britishRockSongs.hashCode();
		System.out.println("HashCode: " + hashCode);

		// toString
		String string = britishRockSongs.toString();
		System.out.println(string);

		// containsKey
		boolean isContainsKey = britishRockSongs.containsKey("Let her go");
		System.out.println("Is Contains Key: " + isContainsKey);

		// containsValue
		boolean isContainsValue = britishRockSongs.containsValue("Willie Nelson");
		System.out.println("Is Contains Values: " + isContainsValue);

		// pollFirstEntry
		Entry<String, String> pollFirstEntry = britishRockSongs.pollFirstEntry();
		System.out.println("Poll First Entry: " + pollFirstEntry);

		// pollLastEntry
		Entry<String, String> pollLastEntry = britishRockSongs.pollLastEntry();
		System.out.println("Poll Last Entry: " + pollLastEntry);

		// forEach
		britishRockSongs.forEach((song, band) -> {
			System.out.println(song + ": " + band);
		});

		// compute
		String compute = britishRockSongs.compute("Soldier of Fortune", (song, band) -> song.substring(3));
		System.out.println(compute);
		System.out.println(britishRockSongs);

		// computeIfAbsent
		String band = britishRockSongs.computeIfAbsent("What a Wonderful World", (key) -> "Louis Armstrong");
		System.out.println(band);
		System.out.println(britishRockSongs);

		// computeIfPresent
		String queen = britishRockSongs.computeIfPresent("Bohemian Rhapsody", (key, oldValue) -> "Queen II");
		System.out.println(queen);
		System.out.println(britishRockSongs);

		// remove
		System.out.println(britishRockSongs);
		britishRockSongs.remove("Bohemian Rhapsody");
		britishRockSongs.remove("Wonderwall", "Oasis");
		System.out.println(britishRockSongs);

		// clear
		britishRockSongs.clear();
		System.out.println(britishRockSongs);

	}

}
