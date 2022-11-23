public class MessageToolBox {
    public static String timeOfDayFormatted(long timeInMillis) {
        final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
        final long SECONDS_IN_AN_HOUR = 60*60 ;
        
        long timeToday = timeInMillis % MILLISECONDS_IN_A_DAY ; 

        // OUTPUT THE CURRENT TIME OF DAY
        long secondsSinceMidnight = timeToday / 1000;
        long hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
        long minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) / 60;
        long second = secondsSinceMidnight % 60;
        
        
        String timeString = String.format("%02d:%02d:%02d\n", hour, minute, second);
        
        return timeString;
    } 
    
    
    
    public static String dayName(long timeInMillis) {
        
        final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
        long daysSince1Jan1970 = System.currentTimeMillis() / MILLISECONDS_IN_A_DAY;
        long dayOfWeek = daysSince1Jan1970 % 7;
        String day = "";
         if (dayOfWeek == 0) {
            day = String.format("%s\n","Thursday");
        }else if(dayOfWeek == 1) {
            day = String.format("%s\n","Friday");
        } else if(dayOfWeek == 2) {
            day = String.format("%s\n","Saturday");
        } else if(dayOfWeek == 3) {
            day = String.format("%s\n","Sunday");
        } else if(dayOfWeek== 4) {
            day = String.format("%s\n","Monday");
        } else if(dayOfWeek== 5) {
            day = String.format("%s\n","Tuesday");
        } else { // Must be 6
            day = String.format("%s\n","Wednesday");
        }
         return day;
    }
    
    public static int ageOfPost(long timeInMillis) {
        
        final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
        long timeNOW = System.currentTimeMillis() ;
        long daysToNow = timeNOW / MILLISECONDS_IN_A_DAY;
        
        long daysToPost = timeInMillis / MILLISECONDS_IN_A_DAY;
        // Step 3. Calculate the difference in days
        long ageOfPost = daysToNow - daysToPost; 
        //daysToNow = timeNOW / MILLISECONDS_IN_A_DAY;
        //daysToPost = sameTimeUpToSixDaysAgo / MILLISECONDS_IN_A_DAY; // In this example we are using ONE of the possible values.
        //ageOfPost = daysToNow - daysToPost;
        int postAge = (int) ageOfPost;
        return postAge;
    }
    
    
    public static String centre(String messagetext, int width) {
        String r = null;
        if (width <= 0) {
            r = "";
        } else if (width <= messagetext.length()) {
            r = "";
        }
        
        if (messagetext.isEmpty()) {
            r = "";
            for (int i = 0; i < width; i++) {
                r = r + " ";
            }
        } else if (messagetext.length() > width) {
            r = messagetext;
        } else {
            r = String.format("%" + (width) + "s", messagetext);
        }
        return r;
    }
    
    
     public static void display(String messageText, int width) {
        if (width <= 0) {
             System.out.print = null;
         } else if (width <= messageText.length()) {
             System.out.print = "";
         }
        
         if (messageText.isEmpty()) {
            
             for (int i = 0; i < width; i++) {
                 r = r + " ";
             }
         } else if (messageText.length() > width) {
             r = messageText;
         } else {
             r = String.format("%" + (width) + "s", messageText);
        }
    }
}
