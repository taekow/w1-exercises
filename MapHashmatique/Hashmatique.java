import java.util.HashMap;

public class Hashmatique {

    public static void main(String[] args) {

        // Create a trackList of type HashMap
        HashMap<String, String> taskList = new HashMap<String, String>();

        // Add in at least 4 songs that are stored by title
        taskList.put("Wake Me up", "Feeling my way through the darkness");
        taskList.put("Oceans Away","I never let My guard go down");
        taskList.put("Something Just Like This", "I've been reading books of old");
        taskList.put("Fields Of Gold", "You'll remember me when the west wind moves");

        // Pull out one of the songs by its track title
        String title = taskList.get("Wake Me up");
        System.out.println(title);

        //  Print out all the track names and lyrics in the format Track: Lyrics
        for (String key : taskList.keySet()) {
            System.out.println(String.format("Track name: %s Lyric: %s", key, taskList.get(key)));
        }
    }
}
