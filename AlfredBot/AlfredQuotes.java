import java.time.LocalTime;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return String.format("t is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE

        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if (conversation.indexOf("Alfred") > -1 ) {
            return "At your service. As you wish, naturally.";
        }

        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String guestGreeting(String datePeriod, String name) {
        return String.format("%s %s. Lovely to see you", datePeriod, name);

    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String guestGreetingWithDatePeriod(String name) {
        //DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime datetime = LocalTime.now();

        String datePeriod;

        // To show good morning
        if (datetime.getHour() > 4 && datetime.getHour() < 12) {
             datePeriod = "Good morning";
        }
        // To show good afternoon
        else if (datetime.getHour() > 12 && datetime.getHour() < 17) {
            datePeriod = "Good afternoon";
        }

        // To show good evening
        else {
            datePeriod = "Good evening";
        }

        return String.format("%s %s. Lovely to see you", datePeriod, name);
    }
}