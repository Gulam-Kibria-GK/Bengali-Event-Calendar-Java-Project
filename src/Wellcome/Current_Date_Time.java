 package Wellcome;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Current_Date_Time {
    //Current_Time.....
    LocalTime time = LocalTime.now();
    DateTimeFormatter formater = DateTimeFormatter.ofPattern("hh:mm:ss");
    String Current_Time = time.format(formater);

    //Current_Date......
    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
    String Current_Date = dateFormat.format(date);
}
