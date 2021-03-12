package Wellcome;

import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Kibria
 */
public class OutputData extends javax.swing.JFrame {

    /**
     * Creates new form OutputData
     */
    private Container c;

    String ss1, ss2;
    int dd, mm, yy;
    int date, month, year;
    String name = null;
    String ch, YY;
    String ddd = null, ZZ = "বঙ্গাব্দ";
    char[] arr;

    public OutputData(String st1, String st2) {
        initComponents();
        c = this.getContentPane();
        Current_Date_Time ff = new Current_Date_Time();
        String Time = ff.Current_Time;
        String Date = ff.Current_Date;
        Current_time.setText(Time);
        Current_date.setText(Date);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(868,713);
        this.setLocation(270, 5);
        this.setResizable(false);
        this.setTitle("Smart_Calender");
        c.setBackground(Color.PINK);
        if (st1.equals("")) {
            DateOutputTextField.setText("Plz Select Date");
            DayOutputTextField.setText("NO Day");
            BanglaDateField.setText("কোন দিন নেই");
            TextAreaInfo.setText("No Date so no information");
        } else {
            ss1 = st1;
            ss2 = st2;
            String allinfo = "";
            DateOutputTextField.setText(ss1);
            DayOutputTextField.setText(ss2);

            String[] Datecut = ss1.split("/");

            dd = Integer.parseInt(Datecut[0]);
            mm = Integer.parseInt(Datecut[1]);
            yy = Integer.parseInt(Datecut[2]);

            if ((yy == 1593 && mm == 4 && dd >= 14) || (yy == 1593 && mm > 4) || (yy > 1593)) {
                date = dd;
                month = mm;
                year = yy;
                if (month >= 4 && month <= 12) {
                    year = year - 593;
                } else {
                    year = year - 1 - 593;
                }

                if (month == 4) {

                    if (date < 14) {
                        month = 12;
                        name = "চৈত্র";
                        date = date + 14 + 3;
                    } else if (date >= 14) {
                        month = 1;
                        name = "বৈশাখ";
                        date = date - 14 + 1;
                    }

                } else if (month == 5) {

                    if (date < 15) {
                        month = 1;
                        name = "বৈশাখ";
                        date = date + 15 + 2;
                    } else if (date >= 15) {
                        month = 2;
                        name = "জৈষ্ট্য";
                        date = date - 15 + 1;
                    }

                } else if (month == 6) {

                    if (date < 15) {
                        month = 2;
                        name = "জৈষ্ট্য";
                        date = date + 15 + 2;
                    } else if (date >= 15) {
                        month = 3;
                        name = "আষাঢ়";
                        date = date - 15 + 1;
                    }
                } else if (month == 7) {

                    if (date < 16) {
                        month = 3;
                        name = "আষাঢ়";
                        date = date + 16;
                    } else if (date >= 16) {
                        month = 4;
                        name = "শ্রাবণ";
                        date = date - 16 + 1;
                    }
                } else if (month == 8) {

                    if (date < 16) {
                        month = 4;
                        name = "শ্রাবণ";
                        date = date + 16;
                    } else if (date >= 16) {
                        month = 5;
                        name = "ভাদ্র";
                        date = date - 16 + 1;
                    }
                } else if (month == 9) {

                    if (date < 16) {
                        month = 5;
                        name = "ভাদ্র";
                        date = date + 16;
                    } else if (date >= 16) {
                        month = 6;
                        name = "আশ্বিন";
                        date = date - 16 + 1;
                    }
                } else if (month == 10) {

                    if (date < 16) {
                        month = 6;
                        name = "আশ্বিন";
                        date = date + 15;
                    } else if (date >= 16) {
                        month = 7;
                        name = "কার্তিক";
                        date = date - 16 + 1;
                    }
                } else if (month == 11) {

                    if (date < 15) {
                        month = 7;
                        name = "কার্তিক";
                        date = date + 15 + 1;
                    } else if (date >= 15) {
                        month = 8;
                        name = "অগ্রাহায়ন";
                        date = date - 15 + 1;
                    }

                } else if (month == 12) {

                    if (date < 15) {
                        month = 8;
                        name = "অগ্রাহায়ন";
                        date = date + 15 + 1;
                    } else if (date >= 15) {
                        month = 9;
                        name = "পৌষ";
                        date = date - 15 + 1;
                    }
                } else if (month == 1) {

                    if (date < 14) {
                        month = 9;
                        name = "পৌষ";
                        date = date + 14 + 3;
                    } else if (date >= 14) {
                        month = 10;
                        name = "মাঘ";
                        date = date - 14 + 1;
                    }

                } else if (month == 2) {

                    if (date < 13) {
                        month = 10;
                        name = "মাঘ";
                        date = date + 13 + 5;
                    } else if (date >= 13) {
                        month = 11;
                        name = "ফাল্গু্ণ";
                        date = date - 13 + 1;
                    }
                } else if (month == 3) {

                    if (date < 15) {
                        month = 11;
                        name = "ফাল্গু্ণ";
                        date = date + 15 + 2;
                    } else if (date >= 15) {
                        month = 12;
                        name = "চৈত্র";
                        date = date - 15 + 1;
                    }
                }
                if (date == 1) {
                    ch = "লা";
                } else if (date == 2 || date == 3) {
                    ch = "রা";
                } else if (date == 4) {
                    ch = "ঠা";
                } else if ((date >= 5) && (date <= 18)) {
                    ch = "ই";
                } else {
                    ch = "শে";
                }
                arr = ("" + year).toCharArray();
                // cout<<date<<"  "<<name<<"  "<<"( Month Number="<<month<<")"<<"  "<<year<<endl;
                for (int i = 0; i < 4; i++) {
                    if (arr[i] == '0') {
                        arr[i] = '০';
                    } else if (arr[i] == '1') {
                        arr[i] = '১';
                    } else if (arr[i] == '2') {
                        arr[i] = '২';
                    } else if (arr[i] == '3') {
                        arr[i] = '৩';
                    } else if (arr[i] == '4') {
                        arr[i] = '৪';
                    } else if (arr[i] == '5') {
                        arr[i] = '৫';
                    } else if (arr[i] == '6') {
                        arr[i] = '৬';
                    } else if (arr[i] == '7') {
                        arr[i] = '৭';
                    } else if (arr[i] == '8') {
                        arr[i] = '৮';
                    } else if (arr[i] == '9') {
                        arr[i] = '৯';
                    }
                }
                if (date == 1) {
                    ddd = "১";
                } else if (date == 2) {
                    ddd = "২";
                } else if (date == 3) {
                    ddd = "৩";
                } else if (date == 4) {
                    ddd = "৪";
                } else if (date == 5) {
                    ddd = "৫";
                } else if (date == 6) {
                    ddd = "৬";
                } else if (date == 7) {
                    ddd = "৭";
                } else if (date == 8) {
                    ddd = "৮";
                } else if (date == 9) {
                    ddd = "৯";
                } else if (date == 10) {
                    ddd = "১০";
                } else if (date == 11) {
                    ddd = "১১";
                } else if (date == 12) {
                    ddd = "১২";
                } else if (date == 13) {
                    ddd = "১৩";
                } else if (date == 14) {
                    ddd = "১৪";
                } else if (date == 15) {
                    ddd = "১৫";
                } else if (date == 16) {
                    ddd = "১৬";
                } else if (date == 17) {
                    ddd = "১৭";
                } else if (date == 18) {
                    ddd = "১৮";
                } else if (date == 19) {
                    ddd = "১৯";
                } else if (date == 20) {
                    ddd = "২০";
                } else if (date == 21) {
                    ddd = "২১";
                } else if (date == 22) {
                    ddd = "২২";
                } else if (date == 23) {
                    ddd = "২৩";
                } else if (date == 24) {
                    ddd = "২৪";
                } else if (date == 25) {
                    ddd = "২৫";
                } else if (date == 26) {
                    ddd = "২৬";
                } else if (date == 27) {
                    ddd = "২৭";
                } else if (date == 28) {
                    ddd = "২৮";
                } else if (date == 29) {
                    ddd = "২৯";
                } else if (date == 30) {
                    ddd = "৩০";
                } else if (date == 31) {
                    ddd = "৩১";
                }
                YY = String.valueOf(arr);
                String bangla = ddd + "" + ch + " " + name + " " + YY + "" + ZZ;
                BanglaDateField.setText(bangla);
            } else {
                BanglaDateField.setText("(date<14/4/1593)out of reach");
            }

            if (dd == 1 && mm == 1 && yy >= 1000) {
                String path = "E:/java/class practiac/Calendars/Info/January/New year .txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 8 && mm == 1 && yy >= 1870) {
                String path = "E:/java/class practiac/Calendars/Info/January/Baul festival 8.1.1870.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 10 && mm == 1 && yy >= 1972) {
                String path = "E:/java/class practiac/Calendars/Info/January/Shodesh prottaborton dibosh10.1.1972.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } 
            else if (dd == 11 && mm == 1 && yy >= 2017) {
                String path = "E:/java/class practiac/Calendars/Info/January/Parity at Work Day.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;

                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 14 && mm == 1 && yy >= 1740) {
                String path = "E:/java/class practiac/Calendars/Info/January/Ghuri festival 14.1.1740.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 18 && mm == 1 && yy >= 1750) {
                String path = "E:/java/class practiac/Calendars/Info/January/World Religion Day.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 23 && mm == 1 && yy >= 1954) {
                String path = "E:/java/class practiac/Calendars/Info/January/Freedom Day.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 27 && mm == 1 && yy >= 1877) {
                String path = "E:/java/class practiac/Calendars/Info/January/hakatoi festival 27.1.1877.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 28 && mm == 1 && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/January/Reducing CO2 Emissions Day.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 30 && mm == 1 && yy >= 1982) {
                String path = "E:/java/class practiac/Calendars/Info/January/Day of Non-Violence .txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 31 && mm == 1 && yy >= 2009) {
                String path = "E:/java/class practiac/Calendars/Info/January/Street children's day.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 2 && mm == 2 && yy >= 1971) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Wetlands Day 2.2.1971.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 4 && mm == 2 && yy >= 2008) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Cancer Day 4.2.2008.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 6 && mm == 2 && yy >= 2015) {
                String path = "E:/java/class practiac/Calendars/Info/February/International Day of Zero Tolerance for Female Genital Mutilation is a United Nations 6.2.2015.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 11 && mm == 2 && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/February/Nelson Mandela's Independence Day11.2.1992.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 11 && mm == 2 && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/February/Nelson Mandela's Independence Day11.2.1992.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } 
            else if (dd == 12 && mm == 2 && yy >= 1993) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Darwin Day12.2.1993.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 14 && mm == 2 && yy >= 1020) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Valentine Day 14.2.1020.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 20 && mm == 2 && yy >= 2009) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Day of Social Justice 20.2.2009.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } else if (dd == 21 && mm == 2 && yy >= 1952) {
                String path = "E:/java/class practiac/Calendars/Info/February/International Mother Language Day 21.2.1952.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            }else if (dd == 22 && mm == 2 && yy >= 1907) {
                String path = "E:/java/class practiac/Calendars/Info/February/World Scout Day22.2.1907.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            } 
            else if (dd == 24 && mm == 2 && yy >= 1996) {
                String path = "E:/java/class practiac/Calendars/Info/February/Al-Quds Day24.2.1996.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 27 && mm == 2 && yy >= 1980) {
                String path = "E:/java/class practiac/Calendars/Info/February/World NGO Day 27.2.1980.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }

            }else if (dd == 7 && mm == 3 && yy >= 1971) {
                String path = "E:/java/class practiac/Calendars/Info/March/Oitihashik vashon07.03.1971.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 8 && mm == 3 && yy >= 1900) {
                String path = "E:/java/class practiac/Calendars/Info/March/International Womens Day 8.3.1900.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 12 && mm == 3 && yy >= 2006) {
                String path = "E:/java/class practiac/Calendars/Info/March/World Kidney Day 12.3.2006.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 14 && mm == 3 && yy >= 1988) {
                String path = "E:/java/class practiac/Calendars/Info/March/World Pi day14.3.1988.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 17 && mm == 3 && yy >= 1920) {
                String path = "E:/java/class practiac/Calendars/Info/March/birth day of father of nation 17.3.1920.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 20 && mm == 3 && yy >= 1000) {
                String path = "E:/java/class practiac/Calendars/Info/March/Holi 20.3.1000.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 21 && mm == 3 && yy >= 2007) {
                String path = "E:/java/class practiac/Calendars/Info/March/International Day of Forests 21.3.2007.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 22 && mm == 3 && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/March/World Water Day  22.3.1992.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 23 && mm == 3 && yy >= 1789) {
                String path = "E:/java/class practiac/Calendars/Info/March/Baha festival 23.3.1789.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } 
            else if (dd == 25 && mm == 3 && yy >= 1971) {
                String path = "E:/java/class practiac/Calendars/Info/March/Genocide day 25.3.1971.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 26 && mm == 3 && yy >= 1971) {
                String path = "E:/java/class practiac/Calendars/Info/March/Bangladesh Independence Day 26.3.1971.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 1 && mm == 4 && yy >= 1668) {
                String path = "E:/java/class practiac/Calendars/Info/April/World April Fools Day 1.4.1668.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 2 && mm == 4 && yy >= 1967) {
                String path = "E:/java/class practiac/Calendars/Info/April/World Autism Awareness Day 2.4.1967.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 7 && mm == 4 && yy >= 1948) {
                String path = "E:/java/class practiac/Calendars/Info/April/World Health Day  7.4.1948.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 13 && mm == 4 && yy >= 1750) {
                String path = "E:/java/class practiac/Calendars/Info/April/Biju Festival 13.4.1750.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 22 && mm == 4 && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/April/International Mother Earth Day 22.4.1992.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 23 && mm == 4 && yy >= 2010) {
                String path = "E:/java/class practiac/Calendars/Info/April/English Language Day 23.4.2010.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 29 && mm == 4 && yy >= 1029) {
                String path = "E:/java/class practiac/Calendars/Info/April/Buddhist Purnima 29.4.1029.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 1 && mm == 5 && yy >= 1921) {
                String path = "E:/java/class practiac/Calendars/Info/April/may day 1.5.1921.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 9 && mm == 5 && yy >= 1861) {
                String path = "E:/java/class practiac/Calendars/Info/April/Rabindra Joyonti09.05.1861.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 10 && mm == 5 && yy >= 2006) {
                String path = "E:/java/class practiac/Calendars/Info/April/World Migratory Bird  Day10.05.2006.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 17 && mm == 5 && yy >= 1888) {
                String path = "E:/java/class practiac/Calendars/Info/May/Lai haoba 17.5.1888.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 1 && mm == 6 && yy >= 1920) {
                String path = "E:/java/class practiac/Calendars/Info/Jun/World child day.1.6.1920.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 5 && mm == 6 && yy >= 1974) {
                String path = "E:/java/class practiac/Calendars/Info/Jun/World Environment day05.06.1974.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 7 && mm == 6 && yy >= 1966) {
                String path = "E:/java/class practiac/Calendars/Info/Jun/six-point movement 7.6.1966.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 24 && mm == 6 && yy >= 1877) {
                String path = "E:/java/class practiac/Calendars/Info/Jun/Monsoon festival 24.6.1877.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 30 && mm == 6 && yy >= 1855) {
                String path = "E:/java/class practiac/Calendars/Info/Jun/Santal rebellion day 30.6.1855.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 11 && mm == 7 && yy >= 1989) {
                String path = "E:/java/class practiac/Calendars/Info/July/World population day 11.7.1989.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 14 && mm == 7 && yy >= 1000) {
                String path = "E:/java/class practiac/Calendars/Info/July/Kang Festival 14.7.1000.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 15 && mm == 8 && yy >= 1975) {
                String path = "E:/java/class practiac/Calendars/Info/August/National Mourning Day 15.8.1975.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 19 && mm == 8 && yy >= 1939) {
                String path = "E:/java/class practiac/Calendars/Info/August/Worl photograpy day 19.8.1939.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }else if (dd == 11 && mm == 9 && yy >= 1200) {
                String path = "E:/java/class practiac/Calendars/Info/September/Heirku Hindongba 11.9.1200.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } 
            else if (dd == 21 && mm == 9 && yy >= 1971) {
                String path = "E:/java/class practiac/Calendars/Info/September/Armdforcesday21.9.1971.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 25 && mm == 9 && yy >= 1899) {
                String path = "E:/java/class practiac/Calendars/Info/September/Najrul joyonti25.9.1899.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 2 && mm == 10 && yy >= 2006) {
                String path = "E:/java/class practiac/Calendars/Info/October/Day of Non-Violence 2.10.2006.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 16 && mm == 10 && yy >= 1765) {
                String path = "E:/java/class practiac/Calendars/Info/October/Partition of Bengal 16.10.1765.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 22 && mm == 10 && yy >= 1997) {
                String path = "E:/java/class practiac/Calendars/Info/October/Safe Road Day 22.10.1997.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            
            else if (dd == 24 && mm == 10 && yy >= 1029) {
                String path = "E:/java/class practiac/Calendars/Info/October/Probarona purnima 24.10.1029.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 1 && mm == 11 && yy >= 1800) {
                String path = "E:/java/class practiac/Calendars/Info/November/Kut Festival 1.11.1800.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 1 && mm == 11 && yy >= 1800) {
                String path = "E:/java/class practiac/Calendars/Info/November/Kut Festival 1.11.1800.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 3 && mm == 11 && yy >= 1975) {
                String path = "E:/java/class practiac/Calendars/Info/November/Jail hotta dibosh 3.11.1975.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 7 && mm == 11 && yy >= 1975) {
                String path = "E:/java/class practiac/Calendars/Info/November/National Revolution and Solidarity Day07.11.1975.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 14 && mm == 11 && yy >= 1878) {
                String path = "E:/java/class practiac/Calendars/Info/November/PiTha festival 14.11.1878.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 15 && mm == 11 && yy >= 1556) {
                String path = "E:/java/class practiac/Calendars/Info/November/Pohela Boishak 15.11.1556.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 21 && mm == 11 && yy >= 2010) {
                String path = "E:/java/class practiac/Calendars/Info/November/Manipur Sangai Festival 21.11.2010.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 25 && mm == 11 && yy >= 1779) {
                String path = "E:/java/class practiac/Calendars/Info/November/Moharaslila 25.11.1779.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 6 && mm == 12 && yy >= 1976) {
                String path = "E:/java/class practiac/Calendars/Info/December/Wangala festival 6.12.1976.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 14 && mm == 12 && yy >= 1971) {
                String path = "E:/java/class practiac/Calendars/Info/December/Shohid buddhijibi dibosh14.12.1971.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } 
            else if (dd == 16 && mm == 12 && yy >= 1971) {
                String path = "E:/java/class practiac/Calendars/Info/December/victory day16.12.1971.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 9 && mm == 12 && yy >= 1994) {
                String path = "E:/java/class practiac/Calendars/Info/December/Rukeya day 9.12.1994.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 21 && mm == 12 && yy >= 1894) {
                String path = "E:/java/class practiac/Calendars/Info/December/Paush Mela 21.12.1894.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            } else if (dd == 25 && mm == 12 && yy >= 1230) {
                String path = "E:/java/class practiac/Calendars/Info/December/Cristmas day 25.12.1230.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd ==12  && mm ==6  && yy >= 1992) {
                String path = "E:/java/class practiac/Calendars/Info/teachers info/Ashrafuzzaman Mollah12.6.1992.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 2 && mm == 7 && yy >=1996 ) {
                String path = "E:/java/class practiac/Calendars/Info/teachers info/Mir lutfur Rahman, 2.7.1996.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd ==11  && mm ==4  && yy >=1992 ) {
                String path = "E:/java/class practiac/Calendars/Info/teachers info/Noushad Sojib 11.4.1992.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd ==9  && mm ==2  && yy >=1991 ) {
                String path = "E:/java/class practiac/Calendars/Info/teachers info/Parvej 9.2.1991.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd == 26 && mm ==1  && yy >= 1995) {
                String path = "E:/java/class practiac/Calendars/Info/teachers info/Pranta Sarkar26.1.1995.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else if (dd ==13  && mm ==11  && yy >=1994 ) {
                String path = "E:/java/class practiac/Calendars/Info/teachers info/Tanjila Mawla Tania13.11.1994.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }
            else {
                String path = "E:/java/class practiac/Calendars/Info/NoEventMessage.txt";
                try {
                    FileReader f = new FileReader(path);
                    BufferedReader br = new BufferedReader(f);
                    while (true) {
                        String line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        allinfo += line;
                    }
                    TextAreaInfo.setLineWrap(true);
                    TextAreaInfo.setWrapStyleWord(true);
                    TextAreaInfo.setText(allinfo);
                } catch (Exception ex) {
                    System.out.println("Error = " + ex.getMessage());
                }
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaInfo = new javax.swing.JTextArea();
        DateOutputLebel = new javax.swing.JLabel();
        DateOutputTextField = new javax.swing.JTextField();
        dayInfoLabel = new javax.swing.JLabel();
        HomeOutputButton = new javax.swing.JButton();
        DayOutputTextField = new javax.swing.JTextField();
        DayOutputLabel = new javax.swing.JLabel();
        separetorout = new javax.swing.JSeparator();
        ExitButton = new javax.swing.JButton();
        BanglaDateLabel = new javax.swing.JLabel();
        BanglaDateField = new javax.swing.JTextField();
        jb9 = new javax.swing.JButton();
        Current_Time2 = new javax.swing.JLabel();
        jb5 = new javax.swing.JButton();
        Current_time = new javax.swing.JTextField();
        jb10 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        Current_Date2 = new javax.swing.JLabel();
        jb2 = new javax.swing.JButton();
        Current_date = new javax.swing.JTextField();
        jb8 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        Time_date = new javax.swing.JTextField();
        jb11 = new javax.swing.JButton();
        jb12 = new javax.swing.JButton();
        jb13 = new javax.swing.JButton();
        jb14 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TextAreaInfo.setEditable(false);
        TextAreaInfo.setBackground(new java.awt.Color(204, 255, 204));
        TextAreaInfo.setColumns(20);
        TextAreaInfo.setRows(5);
        TextAreaInfo.setToolTipText("Date Information");
        TextAreaInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));
        jScrollPane2.setViewportView(TextAreaInfo);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 344, 848, 261);

        DateOutputLebel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        DateOutputLebel.setText("     English Date :");
        DateOutputLebel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 3, true));
        getContentPane().add(DateOutputLebel);
        DateOutputLebel.setBounds(82, 154, 170, 46);

        DateOutputTextField.setEditable(false);
        DateOutputTextField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        DateOutputTextField.setForeground(new java.awt.Color(255, 102, 0));
        DateOutputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DateOutputTextField.setToolTipText("Date");
        DateOutputTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));
        DateOutputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateOutputTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(DateOutputTextField);
        DateOutputTextField.setBounds(20, 218, 291, 49);

        dayInfoLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        dayInfoLabel.setForeground(new java.awt.Color(102, 0, 102));
        dayInfoLabel.setText("       Date Information");
        dayInfoLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 4, true));
        getContentPane().add(dayInfoLabel);
        dayInfoLabel.setBounds(298, 293, 272, 40);

        HomeOutputButton.setBackground(new java.awt.Color(51, 0, 51));
        HomeOutputButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        HomeOutputButton.setForeground(new java.awt.Color(0, 255, 255));
        HomeOutputButton.setText("Home");
        HomeOutputButton.setToolTipText("Home");
        HomeOutputButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));
        HomeOutputButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeOutputButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeOutputButton);
        HomeOutputButton.setBounds(298, 616, 117, 50);

        DayOutputTextField.setEditable(false);
        DayOutputTextField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        DayOutputTextField.setForeground(new java.awt.Color(204, 102, 0));
        DayOutputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DayOutputTextField.setToolTipText("Day");
        DayOutputTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));
        DayOutputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayOutputTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(DayOutputTextField);
        DayOutputTextField.setBounds(513, 218, 345, 49);

        DayOutputLabel.setBackground(new java.awt.Color(204, 204, 204));
        DayOutputLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        DayOutputLabel.setForeground(new java.awt.Color(51, 0, 51));
        DayOutputLabel.setText("     This Day is ");
        DayOutputLabel.setToolTipText("");
        DayOutputLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 3, true));
        getContentPane().add(DayOutputLabel);
        DayOutputLabel.setBounds(344, 218, 136, 49);

        separetorout.setBackground(new java.awt.Color(51, 51, 0));
        separetorout.setForeground(new java.awt.Color(51, 0, 51));
        separetorout.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separetorout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        separetorout.setEnabled(false);
        getContentPane().add(separetorout);
        separetorout.setBounds(10, 273, 848, 9);

        ExitButton.setBackground(new java.awt.Color(51, 0, 51));
        ExitButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(0, 255, 204));
        ExitButton.setText("Exit");
        ExitButton.setToolTipText("Exit");
        ExitButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(453, 616, 113, 50);

        BanglaDateLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BanglaDateLabel.setForeground(new java.awt.Color(51, 0, 51));
        BanglaDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BanglaDateLabel.setText("Bangla Date :");
        BanglaDateLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 0), 3, true));
        getContentPane().add(BanglaDateLabel);
        BanglaDateLabel.setBounds(344, 150, 136, 47);

        BanglaDateField.setEditable(false);
        BanglaDateField.setFont(new java.awt.Font("SolaimanLipi", 3, 24)); // NOI18N
        BanglaDateField.setForeground(new java.awt.Color(153, 102, 0));
        BanglaDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BanglaDateField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(BanglaDateField);
        BanglaDateField.setBounds(513, 148, 345, 47);

        jb9.setBackground(new java.awt.Color(51, 0, 51));
        jb9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb9);
        jb9.setBounds(302, 86, 23, 18);

        Current_Time2.setBackground(new java.awt.Color(204, 204, 204));
        Current_Time2.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        Current_Time2.setForeground(new java.awt.Color(0, 51, 51));
        Current_Time2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Current_Time2.setText("Current_Time");
        Current_Time2.setToolTipText("Current_Time");
        Current_Time2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));
        getContentPane().add(Current_Time2);
        Current_Time2.setBounds(20, 0, 198, 52);

        jb5.setBackground(new java.awt.Color(51, 0, 51));
        jb5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb5);
        jb5.setBounds(477, 34, 23, 18);

        Current_time.setEditable(false);
        Current_time.setBackground(new java.awt.Color(204, 204, 204));
        Current_time.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        Current_time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Current_time.setToolTipText("Current_Time");
        Current_time.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Current_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Current_timeActionPerformed(evt);
            }
        });
        getContentPane().add(Current_time);
        Current_time.setBounds(20, 62, 198, 48);

        jb10.setBackground(new java.awt.Color(153, 255, 204));
        jb10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });
        getContentPane().add(jb10);
        jb10.setBounds(480, 86, 23, 18);

        jb3.setBackground(new java.awt.Color(51, 0, 51));
        jb3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb3);
        jb3.setBounds(358, 34, 23, 18);

        Current_Date2.setBackground(new java.awt.Color(204, 204, 204));
        Current_Date2.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        Current_Date2.setForeground(new java.awt.Color(0, 51, 51));
        Current_Date2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Current_Date2.setText("Current_Date");
        Current_Date2.setToolTipText("Current_Date");
        Current_Date2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));
        getContentPane().add(Current_Date2);
        Current_Date2.setBounds(651, 0, 207, 56);

        jb2.setBackground(new java.awt.Color(153, 255, 204));
        jb2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2);
        jb2.setBounds(300, 34, 23, 18);

        Current_date.setEditable(false);
        Current_date.setBackground(new java.awt.Color(204, 204, 204));
        Current_date.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        Current_date.setForeground(new java.awt.Color(51, 51, 51));
        Current_date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Current_date.setToolTipText("Current_Date");
        Current_date.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Current_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Current_dateActionPerformed(evt);
            }
        });
        getContentPane().add(Current_date);
        Current_date.setBounds(651, 62, 207, 53);

        jb8.setBackground(new java.awt.Color(153, 255, 204));
        jb8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        getContentPane().add(jb8);
        jb8.setBounds(357, 86, 23, 18);

        jb4.setBackground(new java.awt.Color(153, 255, 204));
        jb4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jb4);
        jb4.setBounds(413, 34, 23, 18);

        jb1.setBackground(new java.awt.Color(51, 0, 51));
        jb1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb1);
        jb1.setBounds(247, 34, 23, 18);

        jb6.setBackground(new java.awt.Color(153, 255, 204));
        jb6.setForeground(new java.awt.Color(51, 0, 51));
        jb6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
        getContentPane().add(jb6);
        jb6.setBounds(247, 86, 23, 18);

        jb7.setBackground(new java.awt.Color(51, 0, 51));
        jb7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb7);
        jb7.setBounds(416, 86, 23, 18);

        Time_date.setEditable(false);
        Time_date.setBackground(new java.awt.Color(204, 102, 0));
        Time_date.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        Time_date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Time_date.setToolTipText("");
        Time_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));
        Time_date.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Time_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time_dateActionPerformed(evt);
            }
        });
        getContentPane().add(Time_date);
        Time_date.setBounds(224, 62, 409, 13);

        jb11.setBackground(new java.awt.Color(153, 255, 204));
        jb11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });
        getContentPane().add(jb11);
        jb11.setBounds(534, 34, 23, 18);

        jb12.setBackground(new java.awt.Color(51, 0, 51));
        jb12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb12);
        jb12.setBounds(534, 86, 23, 18);

        jb13.setBackground(new java.awt.Color(51, 0, 51));
        jb13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb13);
        jb13.setBounds(589, 34, 23, 18);

        jb14.setBackground(new java.awt.Color(153, 255, 204));
        jb14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb14ActionPerformed(evt);
            }
        });
        getContentPane().add(jb14);
        jb14.setBounds(592, 86, 23, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wellcome/bek3.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 150, 870, 540);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wellcome/bek3.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 870, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeOutputButtonActionPerformed
        this.dispose();
        ChooseEvent f = new ChooseEvent();
    }//GEN-LAST:event_HomeOutputButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void Current_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Current_timeActionPerformed

    }//GEN-LAST:event_Current_timeActionPerformed

    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb10ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb2ActionPerformed

    private void Current_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Current_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Current_dateActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb6ActionPerformed

    private void Time_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time_dateActionPerformed

    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb11ActionPerformed

    private void jb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb14ActionPerformed

    private void DateOutputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateOutputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateOutputTextFieldActionPerformed

    private void DayOutputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayOutputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DayOutputTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OutputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //OutputData f = new OutputData();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BanglaDateField;
    private javax.swing.JLabel BanglaDateLabel;
    private javax.swing.JLabel Current_Date2;
    private javax.swing.JLabel Current_Time2;
    private javax.swing.JTextField Current_date;
    private javax.swing.JTextField Current_time;
    private javax.swing.JLabel DateOutputLebel;
    private javax.swing.JTextField DateOutputTextField;
    private javax.swing.JLabel DayOutputLabel;
    private javax.swing.JTextField DayOutputTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton HomeOutputButton;
    private javax.swing.JTextArea TextAreaInfo;
    private javax.swing.JTextField Time_date;
    private javax.swing.JLabel dayInfoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb10;
    private javax.swing.JButton jb11;
    private javax.swing.JButton jb12;
    private javax.swing.JButton jb13;
    private javax.swing.JButton jb14;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JSeparator separetorout;
    // End of variables declaration//GEN-END:variables
}
