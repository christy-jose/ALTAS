
import java.awt.Component;
import java.sql.Connection;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandu6177
 */
public class ExaminerUI extends javax.swing.JFrame {

    /**
     * Creates new form ExaminerUI
     */
    private String Uname;
    private Component frame;
    private String TestID;
//    FacultyHomePage facultyHomePage;
    public ExaminerUI(String username,HomeWindow prev) {
        Uname = username;
        TestID = Long.toString(System.nanoTime());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TestNameField = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        DurationHourField = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        day = new javax.swing.JTextField();
        shour = new javax.swing.JTextField();
        sminute = new javax.swing.JTextField();
        ssecond = new javax.swing.JTextField();
        DurationMinField = new javax.swing.JTextField();
        createTest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5,javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1 = new javax.swing.JScrollPane(jPanel5);
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6,javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2 = new javax.swing.JScrollPane(jPanel6);
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Test Name");

        jLabel2.setText("Date");

        jLabel3.setText("Start Time");

        jLabel4.setText("Duration");

        TestNameField.setText("[Eg. Test123]");

        year.setText("yyyy");
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        DurationHourField.setText("Hours");

        month.setText("mm");

        day.setText("dd");
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        shour.setText("hh");
        shour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shourActionPerformed(evt);
            }
        });

        sminute.setText("mm");

        ssecond.setText("ss");
        ssecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssecondActionPerformed(evt);
            }
        });

        DurationMinField.setText("Minutes");

        createTest.setText("Create New Test");
        createTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TestNameField)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(DurationHourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(DurationMinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(shour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sminute, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(ssecond, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(221, 221, 221))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(createTest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TestNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sminute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DurationHourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DurationMinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(createTest)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Create New Test", jPanel1);

        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                DisplayTest(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Upcoming Tests", jPanel2);

        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                DisplayPreviousTest(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Previous Tests", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        jTabbedPane6.addTab("Settings", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void shourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shourActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void ssecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssecondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssecondActionPerformed

    private void createTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTestActionPerformed
        // TODO add your handling code here:
        String date=year.getText()+"-"+month.getText()+"-"+day.getText();
        String time=shour.getText()+":"+sminute.getText()+":"+ssecond.getText();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startTimet;
        LocalDateTime endTimet; 
        try{
            startTimet = LocalDateTime.parse(date+" "+time,dtf);
        }catch(DateTimeParseException dtpe){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Incorrect Date or Time Format");
            return;
        }
        try{
            
            endTimet = startTimet.plusHours(Integer.parseInt(DurationHourField.getText()));
            endTimet = endTimet.plusMinutes(Integer.parseInt(DurationMinField.getText()));
        }catch(NumberFormatException nfe){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Incorrect format for duration");
            return;
        }
        
        Timestamp startTime = Timestamp.valueOf(startTimet);
        Timestamp endTime = Timestamp.valueOf(endTimet);
        String TestName = TestNameField.getText();
        Timestamp curTime = new Timestamp(System.currentTimeMillis());
        try
        {
            if(curTime.after(startTime)){
                throw new StartTimeException("Start time cannot be before the current time");
            }
        }catch(StartTimeException ste){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Start time cannot be before the current time");
            return;
        }
        Connection conn = null;
        ConnectDB DB = new ConnectDB();
        DB.connect();
        conn = DB.getconn();
        
        Map data = new HashMap();
        AddTestModule atm = new AddTestModule(conn);
        data.put("TestID",TestID);
        data.put("starttime","'"+startTime+"'");
        data.put("endTime","'"+endTime+"'");
        data.put("TestName","'"+TestName+"'");
        
        atm.AddToTest(data);
        this.setVisible(false);
        new AddQuestion(this,TestID).setVisible(true);
    }//GEN-LAST:event_createTestActionPerformed

    private void DisplayTest(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DisplayTest
        // TODO add your handling code here:
        // displays the details of the upcomming tests
        int retStat;
        ArrayList<Test> E;
        jPanel5.removeAll();
        ConnectDB DB = new ConnectDB();
        retStat = DB.connect();
        if(retStat == 1) {
            javax.swing.JOptionPane.showMessageDialog(this,"Couldn't connect to DB");
            return;
        }
        else if(retStat == 2) {
            javax.swing.JOptionPane.showMessageDialog(this,"No JDBC driver");
            return;
        }
        SearchModule SER = new SearchModule();
        SER.setconn(DB.getconn());
        E = SER.UpcomingTestDetails();
        if(E.size()==0) {
            retStat = DB.disconnect();
            javax.swing.JOptionPane.showMessageDialog(this,"No upcomming tests to show");
            return;
        }
        UpcomingTestUIExaminer U; 
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormater = new SimpleDateFormat("hh:mm:ss a");
        for(int i=0;i<E.size();i++) {
            U = new UpcomingTestUIExaminer();
            U.set1(E.get(i).Testname);
            U.set2(String.valueOf(E.get(i).Testid));
            U.set3(dateFormater.format(E.get(i).Starttime));
            U.set4(timeFormater.format(E.get(i).Starttime));
            U.set5(dateFormater.format(E.get(i).Endtime));
            U.set6(timeFormater.format(E.get(i).Endtime));
            jPanel5.add(U);
        }
        retStat = DB.disconnect();
    }//GEN-LAST:event_DisplayTest

    private void DisplayPreviousTest(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DisplayPreviousTest
        // TODO add your handling code here:
        int retStat;
        ArrayList<Test> E;
        jPanel6.removeAll();
        ConnectDB DB = new ConnectDB();
        retStat = DB.connect();
        if(retStat == 1) {
            javax.swing.JOptionPane.showMessageDialog(this,"Couldn't connect to DB");
            return;
        }
        else if(retStat == 2) {
            javax.swing.JOptionPane.showMessageDialog(this,"No JDBC driver");
            return;
        }
        SearchModule SER = new SearchModule();
        SER.setconn(DB.getconn());
        E = SER.PreviousTestDetails();
        if(E.size()==0) {
            retStat = DB.disconnect();
            javax.swing.JOptionPane.showMessageDialog(this,"No upcomming tests to show");
            return;
        }
        PreviousTestUIExaminer U; 
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormater = new SimpleDateFormat("hh:mm:ss a");
        for(int i=0;i<E.size();i++) {
            U = new PreviousTestUIExaminer();
            U.set1(E.get(i).Testname);
            U.set2(String.valueOf(E.get(i).Testid));
            U.set3(dateFormater.format(E.get(i).Starttime));
            U.set4(timeFormater.format(E.get(i).Starttime));
            U.set5(dateFormater.format(E.get(i).Endtime));
            U.set6(timeFormater.format(E.get(i).Endtime));
            jPanel6.add(U);
        }
        retStat = DB.disconnect();
    }//GEN-LAST:event_DisplayPreviousTest

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DurationHourField;
    private javax.swing.JTextField DurationMinField;
    private javax.swing.JTextField TestNameField;
    private javax.swing.JButton createTest;
    private javax.swing.JTextField day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTextField month;
    private javax.swing.JTextField shour;
    private javax.swing.JTextField sminute;
    private javax.swing.JTextField ssecond;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}