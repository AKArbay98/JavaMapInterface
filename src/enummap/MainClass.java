package enummap;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		EnumMap<DayOfWeek, String> dayOfWeekMap = new EnumMap<>(DayOfWeek.class);

		// put
		dayOfWeekMap.put(DayOfWeek.MONDAY, "Mathematics");
		dayOfWeekMap.put(DayOfWeek.FRIDAY, "Physics");
		dayOfWeekMap.put(DayOfWeek.SATURDAY, "Geography");
		dayOfWeekMap.put(DayOfWeek.SUNDAY, "History");
		dayOfWeekMap.put(DayOfWeek.TUESDAY, "Football");
		dayOfWeekMap.put(DayOfWeek.THURSDAY, "Turkish");
		dayOfWeekMap.put(DayOfWeek.WEDNESDAY, "English");
		System.out.println(dayOfWeekMap);

		// putAll
		EnumMap<DayOfWeek, String> otherDayOfWeekMap = new EnumMap<>(DayOfWeek.class);
		otherDayOfWeekMap.put(DayOfWeek.MONDAY, "Science");
		otherDayOfWeekMap.put(DayOfWeek.FRIDAY, "Chemistry");
		dayOfWeekMap.putAll(otherDayOfWeekMap);
		System.out.println(dayOfWeekMap);

		// putIfAbsent
		String subject = dayOfWeekMap.putIfAbsent(DayOfWeek.MONDAY, "Science");
		System.out.println(subject);
		System.out.println(dayOfWeekMap);

		// size
		int size = dayOfWeekMap.size();
		System.out.println(size);

		// isEmpty
		boolean isEmpty = dayOfWeekMap.isEmpty();
		System.out.println(isEmpty);

		// values
		Collection<String> values = dayOfWeekMap.values();
		for (String string : values) {
			System.out.println(string);
		}

		// keySet
		Set<DayOfWeek> keySet = dayOfWeekMap.keySet();
		for (DayOfWeek dayOfWeek : keySet) {
			System.out.println(dayOfWeek);
		}

		// toString
		String string = dayOfWeekMap.toString();
		System.out.println(string);

		// containsKey
		boolean isContainsKey = dayOfWeekMap.containsKey(DayOfWeek.FRIDAY);
		System.out.println(isContainsKey);

		// containsValue
		boolean isContainsValue = dayOfWeekMap.containsValue("Mathematics");
		System.out.println(isContainsValue);

		// hashCode
		int hashCode = dayOfWeekMap.hashCode();
		System.out.println(hashCode);

		// entrySet
		Set<Entry<DayOfWeek, String>> entrySet = dayOfWeekMap.entrySet();
		System.out.println(entrySet);

		// get
		String lessonOfSunday = dayOfWeekMap.get(DayOfWeek.SUNDAY);
		System.out.println(lessonOfSunday);

		// getOrDefault
		String mondayCourse = dayOfWeekMap.getOrDefault(DayOfWeek.MONDAY, "Unknown");
		System.out.println(mondayCourse);
		System.out.println(dayOfWeekMap);

		// replace
		String oldSubject = dayOfWeekMap.replace(DayOfWeek.MONDAY, "Football");
		System.out.println(oldSubject);
		System.out.println(dayOfWeekMap);

		// replaceAll
		dayOfWeekMap.replaceAll((key, value) -> value + "II");
		System.out.println(dayOfWeekMap);

		// forEach
		dayOfWeekMap.forEach((day, subject1) -> {
			System.out.println(day + ": " + subject1);
		});

		// compute
		dayOfWeekMap.compute(DayOfWeek.FRIDAY, (day, subject1) -> subject1 + " (Advanced)");
		System.out.println(dayOfWeekMap);

		// computeIfAbsent
		String subjectTwo = dayOfWeekMap.computeIfAbsent(DayOfWeek.FRIDAY, (day) -> "Science");
		System.out.println(subjectTwo);
		System.out.println(dayOfWeekMap);

		// computeIfPresent
		dayOfWeekMap.computeIfPresent(DayOfWeek.SATURDAY, (day, subject1) -> subject1 + " (University)");
		System.out.println(dayOfWeekMap);

		// remove
		System.out.println(dayOfWeekMap);
		dayOfWeekMap.remove(DayOfWeek.TUESDAY);
		System.out.println(dayOfWeekMap);

		// clear
		dayOfWeekMap.clear();
		System.out.println(dayOfWeekMap);

	}

}
