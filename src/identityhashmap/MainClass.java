package identityhashmap;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		IdentityHashMap<String, String> britishRockSongs = new IdentityHashMap<>();

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

		// putAll
		IdentityHashMap<String, String> moreBritishRockSongs = new IdentityHashMap<>();
		moreBritishRockSongs.put("Karma Police", "Radiohead");
		moreBritishRockSongs.put("No Suprises", "Radiohead");
		moreBritishRockSongs.put("Creep", "Radiohead");
		britishRockSongs.putAll(moreBritishRockSongs);

		// putIfAbsent
		britishRockSongs.putIfAbsent("Keane", "Somewhere Only We Know");
		System.out.println(britishRockSongs);

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

		// entrySet
		Set<Entry<String, String>> entrySet = britishRockSongs.entrySet();
		System.out.println(entrySet);

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
