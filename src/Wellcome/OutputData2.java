/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wellcome;

import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;

/**
 *
 * @author Kibria
 */
public class OutputData2 extends javax.swing.JFrame {

    /**
     * Creates new form OutputData2
     */
    private Container c;

    String ss1, ss2;
    int dd, mm, yy;
    int date, month, year;
    String name = null;
    String ch, YY;
    String ddd = null, ZZ = "বঙ্গাব্দ";
    char[] arr;

    public OutputData2(int x, String st1, String st2) {
        initComponents();
        //System.out.println(x);
        Current_Date_Time ff = new Current_Date_Time();
        String Time = ff.Current_Time;
        String Date = ff.Current_Date;
        Current_time.setText(Time);
        Current_date.setText(Date);
        c = this.getContentPane();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(845,713);
        this.setLocation(270, 2);
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
                  
             if ((yy == 1593 && mm == 4 && dd >= 14) || (yy == 1593 && mm > 4) || (yy > 1593)){
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
            }
            else{
                BanglaDateField.setText("(date<14/4/1593)out of reach");
            }
            
            

            if (x == 1) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event1.txt";
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

            } else if (x == 2) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event2.txt";
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

            } else if (x == 3) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event3.txt";
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

            } else if (x == 4) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event4.txt";
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

            } else if (x == 5) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event5.txt";
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

            } else if (x == 6) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event6.txt";
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

            } else if (x == 7) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event7.txt";
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

            } else if (x == 8) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event8.txt";
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

            } else if (x == 9) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event9.txt";
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

            } else if (x == 10) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event10.txt";
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

            } else if (x == 11) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event11.txt";
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

            } else if (x == 12) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event12.txt";
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

            } else if (x == 13) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event13.txt";
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

            } else if (x == 14) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event14.txt";
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

            } else if (x == 15) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event15.txt";
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

            } else if (x == 16) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event16.txt";
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

            } else if (x == 17) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event17.txt";
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

            } else if (x == 18) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event18.txt";
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

            } else if (x == 19) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event19.txt";
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

            } else if (x == 20) {
                String path = "E:/java/class practiac/Calendars/Info/AddEvent/Event20.txt";
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
        BackOutputButton = new javax.swing.JButton();
        DayOutputTextField = new javax.swing.JTextField();
        DayOutputLabel = new javax.swing.JLabel();
        separetorout = new javax.swing.JSeparator();
        ExitButton = new javax.swing.JButton();
        BanglaDateLabel = new javax.swing.JLabel();
        BanglaDateField = new javax.swing.JTextField();
        jb4 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        Time_date = new javax.swing.JTextField();
        jb11 = new javax.swing.JButton();
        jb12 = new javax.swing.JButton();
        jb13 = new javax.swing.JButton();
        jb14 = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TextAreaInfo.setEditable(false);
        TextAreaInfo.setBackground(new java.awt.Color(204, 255, 204));
        TextAreaInfo.setColumns(20);
        TextAreaInfo.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TextAreaInfo.setRows(5);
        TextAreaInfo.setToolTipText("Date Information");
        TextAreaInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));
        jScrollPane2.setViewportView(TextAreaInfo);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 348, 835, 261);

        DateOutputLebel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        DateOutputLebel.setText("  English Date ");
        DateOutputLebel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 3, true));
        getContentPane().add(DateOutputLebel);
        DateOutputLebel.setBounds(76, 151, 142, 53);

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
        DateOutputTextField.setBounds(10, 215, 273, 46);

        dayInfoLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        dayInfoLabel.setForeground(new java.awt.Color(102, 0, 102));
        dayInfoLabel.setText("       Date Information");
        dayInfoLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 4, true));
        getContentPane().add(dayInfoLabel);
        dayInfoLabel.setBounds(296, 287, 272, 50);

        BackOutputButton.setBackground(new java.awt.Color(51, 0, 51));
        BackOutputButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BackOutputButton.setForeground(new java.awt.Color(0, 255, 255));
        BackOutputButton.setText("Home");
        BackOutputButton.setToolTipText("Home");
        BackOutputButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));
        BackOutputButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackOutputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackOutputButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackOutputButton);
        BackOutputButton.setBounds(292, 627, 117, 50);

        DayOutputTextField.setEditable(false);
        DayOutputTextField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        DayOutputTextField.setForeground(new java.awt.Color(204, 102, 0));
        DayOutputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DayOutputTextField.setToolTipText("Day");
        DayOutputTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));
        getContentPane().add(DayOutputTextField);
        DayOutputTextField.setBounds(493, 214, 314, 49);

        DayOutputLabel.setBackground(new java.awt.Color(204, 204, 204));
        DayOutputLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        DayOutputLabel.setForeground(new java.awt.Color(51, 0, 51));
        DayOutputLabel.setText("   This Day is ");
        DayOutputLabel.setToolTipText("");
        DayOutputLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 3, true));
        getContentPane().add(DayOutputLabel);
        DayOutputLabel.setBounds(344, 216, 139, 49);

        separetorout.setBackground(new java.awt.Color(51, 51, 0));
        separetorout.setForeground(new java.awt.Color(51, 0, 51));
        separetorout.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separetorout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 1, true));
        separetorout.setEnabled(false);
        getContentPane().add(separetorout);
        separetorout.setBounds(10, 271, 815, 10);

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
        ExitButton.setBounds(460, 627, 113, 50);

        BanglaDateLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BanglaDateLabel.setForeground(new java.awt.Color(51, 0, 51));
        BanglaDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BanglaDateLabel.setText("Bangla Date :");
        BanglaDateLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 0), 3, true));
        getContentPane().add(BanglaDateLabel);
        BanglaDateLabel.setBounds(344, 158, 139, 45);

        BanglaDateField.setEditable(false);
        BanglaDateField.setFont(new java.awt.Font("SolaimanLipi", 3, 24)); // NOI18N
        BanglaDateField.setForeground(new java.awt.Color(153, 102, 0));
        BanglaDateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BanglaDateField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BanglaDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanglaDateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(BanglaDateField);
        BanglaDateField.setBounds(493, 153, 314, 51);

        jb4.setBackground(new java.awt.Color(153, 255, 204));
        jb4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jb4);
        jb4.setBounds(391, 45, 23, 18);

        jb1.setBackground(new java.awt.Color(51, 0, 51));
        jb1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb1);
        jb1.setBounds(234, 45, 23, 18);

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
        jb6.setBounds(234, 97, 23, 18);

        jb7.setBackground(new java.awt.Color(51, 0, 51));
        jb7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb7);
        jb7.setBounds(393, 97, 23, 18);

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
        Time_date.setBounds(214, 73, 408, 13);

        jb11.setBackground(new java.awt.Color(153, 255, 204));
        jb11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });
        getContentPane().add(jb11);
        jb11.setBounds(509, 45, 23, 18);

        jb12.setBackground(new java.awt.Color(51, 0, 51));
        jb12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb12);
        jb12.setBounds(510, 97, 23, 18);

        jb13.setBackground(new java.awt.Color(51, 0, 51));
        jb13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb13);
        jb13.setBounds(566, 43, 23, 18);

        jb14.setBackground(new java.awt.Color(153, 255, 204));
        jb14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb14ActionPerformed(evt);
            }
        });
        getContentPane().add(jb14);
        jb14.setBounds(570, 97, 23, 18);

        jb9.setBackground(new java.awt.Color(51, 0, 51));
        jb9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb9);
        jb9.setBounds(284, 97, 23, 18);

        Current_Time2.setBackground(new java.awt.Color(204, 204, 204));
        Current_Time2.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        Current_Time2.setForeground(new java.awt.Color(0, 51, 51));
        Current_Time2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Current_Time2.setText("Current_Time");
        Current_Time2.setToolTipText("Current_Time");
        Current_Time2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));
        getContentPane().add(Current_Time2);
        Current_Time2.setBounds(10, 11, 198, 52);

        jb5.setBackground(new java.awt.Color(51, 0, 51));
        jb5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb5);
        jb5.setBounds(447, 45, 23, 18);

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
        Current_time.setBounds(10, 73, 198, 48);

        jb10.setBackground(new java.awt.Color(153, 255, 204));
        jb10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });
        getContentPane().add(jb10);
        jb10.setBounds(452, 97, 23, 18);

        jb3.setBackground(new java.awt.Color(51, 0, 51));
        jb3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jb3);
        jb3.setBounds(335, 45, 23, 18);

        Current_Date2.setBackground(new java.awt.Color(204, 204, 204));
        Current_Date2.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        Current_Date2.setForeground(new java.awt.Color(0, 51, 51));
        Current_Date2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Current_Date2.setText("Current_Date");
        Current_Date2.setToolTipText("Current_Date");
        Current_Date2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 3, true));
        getContentPane().add(Current_Date2);
        Current_Date2.setBounds(628, 11, 207, 56);

        jb2.setBackground(new java.awt.Color(153, 255, 204));
        jb2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2);
        jb2.setBounds(283, 45, 23, 18);

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
        Current_date.setBounds(628, 73, 207, 53);

        jb8.setBackground(new java.awt.Color(153, 255, 204));
        jb8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));
        jb8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        getContentPane().add(jb8);
        jb8.setBounds(334, 97, 23, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wellcome/bek3.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 150, 840, 550);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Wellcome/bek3.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackOutputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackOutputButtonActionPerformed
        this.dispose();
        ChooseEvent f = new ChooseEvent();
    }//GEN-LAST:event_BackOutputButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void DateOutputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateOutputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateOutputTextFieldActionPerformed

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

    private void BanglaDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanglaDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BanglaDateFieldActionPerformed

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
            java.util.logging.Logger.getLogger(OutputData2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputData2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputData2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputData2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //OutputData2 f= new OutputData2(String st1,String st2);//.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackOutputButton;
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
