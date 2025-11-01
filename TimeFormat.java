// Represents the hh:mm time format using an AM/PM format. 

public class TimeFormat {

    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        String timeHour, minuteTime; 
		String day = "AM";
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        if (hours < 12) {
            timeHour = hours + ":";
        }
		else if (hours == 12)
		{
			day = "PM";
			timeHour = hours + ":";
		}
		else
		{
			hours = hours - 12;
			timeHour = hours + ":";
			day = "PM";

		}
		if (minutes < 10)
		{
			minuteTime = "0" + minutes;
		}
		else
		{
			minuteTime = "" + minutes;
		}

        System.out.println(timeHour + minuteTime + " " + day);
    }
}
