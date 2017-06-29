/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogresstracking.classes;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author overlord_96
 */
public class StudentPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentPage
     */
    private String stname,bloodgrp,email,area,city,date,department,division,year;
    private long rollno,mobileno,pincode;
    
    private String fthname,mthname;
    private long fthmobile,mthmobile;
    
    private String activityname,activitydate,achievement,institutename;
    
    private int scr1,scr2,scr3,scr4,scr5;
    
    private String mentname,mentdept,mentquali,mentemail;
    private long mentmobile;
    private int mentid;
    private long ment_id;
    
    Login obj = new Login();
    
    long currentUser;
    
    public StudentPage() {
        initComponents();
    }
    public StudentPage(Login l){
        initComponents();
        obj = l;
        currentUser = obj.usrcurrent;
        
        try{
            MongoClient client = new MongoClient("localhost", 27017);
            DB db = client.getDB("StudentProgressTracking");
            DBCollection student = db.getCollection("student");
            DBCollection mentor = db.getCollection("mentor");
            DBCollection extra = db.getCollection("extracurricular");
            
            DefaultTableModel table = (DefaultTableModel)studentextratable.getModel();
            
            DBCursor cursor = student.find(new BasicDBObject("_id", currentUser));
            for(DBObject obj:cursor){
                stname = (String)obj.get("Name");
                rollno = (long)obj.get("_id");
                department = (String)obj.get("Department");
                division = (String)obj.get("Division");
                year = (String)obj.get("Year");
                bloodgrp = (String)obj.get("BloodGroup");
                mobileno = (long)obj.get("MobileNo");
                email = (String)obj.get("EmailID");
                date = (String)obj.get("DateOfBirth");
                
                DBObject addr = (BasicDBObject)obj.get("Address");
                area = (String)addr.get("Area");
                city = (String)addr.get("City");
                pincode = (long)addr.get("Pincode");
                
                fthname = (String)obj.get("FatherName");
                mthname = (String)obj.get("MotherName");
                fthmobile = (long)obj.get("FatherMobileNo");
                mthmobile = (long)obj.get("MotherMobileNo");
                
                ment_id = (long)obj.get("Mentor_ID");
            }
   
            parea.setText(area);
            pblood.setText(bloodgrp);
            pcity.setText(city);
            pdepartment.setText(department);
            pdiv.setText(division);
            pdob.setText(date);
            pemail.setText(email);
            pfathermob.setText(fthmobile+"");
            pfathername.setText(fthname);
            pmothermob.setText(mthmobile+"");
            pmothername.setText(mthname);
            pname.setText(stname);
            ppin.setText(pincode+"");
            prollno.setText(rollno+"");
            pstudentmob.setText(mobileno+"");
            pyear.setText(year);
            
            DBCursor cursorextra = extra.find(new BasicDBObject("Student_ID", currentUser));
            for(DBObject obj:cursorextra){
                activityname = (String)obj.get("ActivityName");
                activitydate = (String)obj.get("Date");
                achievement = (String)obj.get("Achievement");
                institutename = (String)obj.get("Institute");
                
                table.addRow(new Object[]{activityname,activitydate,institutename,achievement});
            }

            DBCursor cursormentor = mentor.find(new BasicDBObject("Mentor_ID", (int)ment_id));
            for(DBObject obj:cursormentor){
                mentname = (String)obj.get("Mentor_name");
                mentid = (int)obj.get("Mentor_ID");
                mentdept = (String)obj.get("Department_name");
                mentemail = (String)obj.get("Email_ID");
                mentmobile = (long)obj.get("Phone_no");
                mentquali = (String)obj.get("Qualification");   
            }

            mentordepartment.setText(mentdept);
            mentoremail.setText(mentemail);
            mentorid.setText(mentid+"");
            mentormobile.setText(mentmobile+"");
            mentorname.setText(mentname);
            mentorqualification.setText(mentquali);

            
            }
            catch(Exception e){
                e.printStackTrace();
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pdiv = new javax.swing.JLabel();
        pyear = new javax.swing.JLabel();
        prollno = new javax.swing.JLabel();
        pblood = new javax.swing.JLabel();
        pdepartment = new javax.swing.JLabel();
        pfathername = new javax.swing.JLabel();
        pmothername = new javax.swing.JLabel();
        pdob = new javax.swing.JLabel();
        parea = new javax.swing.JLabel();
        ppin = new javax.swing.JLabel();
        pcity = new javax.swing.JLabel();
        pstudentmob = new javax.swing.JLabel();
        pemail = new javax.swing.JLabel();
        pfathermob = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        pmothermob = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        signoutbtn = new javax.swing.JButton();
        changepasswbtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        feradiobtn = new javax.swing.JRadioButton();
        seradiobtn = new javax.swing.JRadioButton();
        teradiobtn = new javax.swing.JRadioButton();
        beradiobtn = new javax.swing.JRadioButton();
        showmarksbtn = new javax.swing.JButton();
        updtstudentmarksbtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentextratable = new javax.swing.JTable();
        studentextraupdbtn = new javax.swing.JButton();
        transPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        mentorqualification = new javax.swing.JLabel();
        mentorname = new javax.swing.JLabel();
        mentorid = new javax.swing.JLabel();
        mentoremail = new javax.swing.JLabel();
        mentordepartment = new javax.swing.JLabel();
        mentormobile = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(115, 27, 43, 19);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RollNO:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 75, 52, 19);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(68, 225, 86, 19);

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Division:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(97, 319, 61, 19);

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Year:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(122, 270, 37, 19);

        jLabel24.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Blood Group:");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(60, 360, 93, 19);

        jLabel14.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MobileNo:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(578, 27, 71, 19);

        jLabel15.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email ID:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(590, 69, 59, 19);

        jLabel16.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Date of Birth:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(551, 226, 92, 19);

        jLabel20.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Address:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(519, 272, 82, 19);

        jLabel21.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Area:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(613, 272, 36, 19);

        jLabel22.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("City:");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(620, 319, 30, 19);

        jLabel23.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("PinCode:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(585, 358, 63, 19);

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Father's Name:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(48, 117, 104, 19);

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mother's Name:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(43, 178, 109, 19);

        jLabel17.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Father's MobileNo:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(507, 126, 149, 19);

        pdiv.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pdiv.setForeground(new java.awt.Color(255, 255, 255));
        pdiv.setText("Label");
        jPanel2.add(pdiv);
        pdiv.setBounds(196, 315, 171, 24);

        pyear.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pyear.setForeground(new java.awt.Color(255, 255, 255));
        pyear.setText("Label");
        jPanel2.add(pyear);
        pyear.setBounds(196, 266, 171, 24);

        prollno.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        prollno.setForeground(new java.awt.Color(255, 255, 255));
        prollno.setText("Label");
        jPanel2.add(prollno);
        prollno.setBounds(195, 71, 171, 24);

        pblood.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pblood.setForeground(new java.awt.Color(255, 255, 255));
        pblood.setLabelFor(jLabel24);
        pblood.setText("Label");
        jPanel2.add(pblood);
        pblood.setBounds(196, 356, 171, 24);

        pdepartment.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pdepartment.setForeground(new java.awt.Color(255, 255, 255));
        pdepartment.setText("Label");
        jPanel2.add(pdepartment);
        pdepartment.setBounds(196, 221, 171, 24);

        pfathername.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pfathername.setForeground(new java.awt.Color(255, 255, 255));
        pfathername.setText("Label");
        jPanel2.add(pfathername);
        pfathername.setBounds(195, 113, 171, 24);

        pmothername.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pmothername.setForeground(new java.awt.Color(255, 255, 255));
        pmothername.setText("Label");
        jPanel2.add(pmothername);
        pmothername.setBounds(195, 174, 245, 24);

        pdob.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pdob.setForeground(new java.awt.Color(255, 255, 255));
        pdob.setText("Label");
        jPanel2.add(pdob);
        pdob.setBounds(674, 222, 171, 24);

        parea.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        parea.setForeground(new java.awt.Color(255, 255, 255));
        parea.setText("Label");
        jPanel2.add(parea);
        parea.setBounds(678, 268, 171, 24);

        ppin.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        ppin.setForeground(new java.awt.Color(255, 255, 255));
        ppin.setText("Label");
        jPanel2.add(ppin);
        ppin.setBounds(678, 354, 171, 24);

        pcity.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pcity.setForeground(new java.awt.Color(255, 255, 255));
        pcity.setText("Label");
        jPanel2.add(pcity);
        pcity.setBounds(678, 315, 171, 24);

        pstudentmob.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pstudentmob.setForeground(new java.awt.Color(255, 255, 255));
        pstudentmob.setText("Label");
        jPanel2.add(pstudentmob);
        pstudentmob.setBounds(678, 23, 171, 24);

        pemail.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pemail.setForeground(new java.awt.Color(255, 255, 255));
        pemail.setText("Label");
        jPanel2.add(pemail);
        pemail.setBounds(678, 65, 290, 24);

        pfathermob.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pfathermob.setForeground(new java.awt.Color(255, 255, 255));
        pfathermob.setText("Label");
        jPanel2.add(pfathermob);
        pfathermob.setBounds(678, 122, 171, 24);

        pname.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pname.setForeground(new java.awt.Color(255, 255, 255));
        pname.setText("Label");
        jPanel2.add(pname);
        pname.setBounds(195, 23, 171, 24);

        pmothermob.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        pmothermob.setForeground(new java.awt.Color(255, 255, 255));
        pmothermob.setText("Label");
        jPanel2.add(pmothermob);
        pmothermob.setBounds(678, 179, 171, 24);

        jLabel36.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Mother's MobileNo:");
        jPanel2.add(jLabel36);
        jLabel36.setBounds(503, 183, 137, 19);

        signoutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutbtnActionPerformed(evt);
            }
        });
        jPanel2.add(signoutbtn);
        signoutbtn.setBounds(890, 10, 80, 30);

        changepasswbtn.setBackground(new java.awt.Color(102, 0, 0));
        changepasswbtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        changepasswbtn.setForeground(new java.awt.Color(255, 255, 255));
        changepasswbtn.setText("Change Password");
        changepasswbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changepasswbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswbtnActionPerformed(evt);
            }
        });
        jPanel2.add(changepasswbtn);
        changepasswbtn.setBounds(780, 390, 200, 25);

        jPanel8.setBackground(new Color(51,0,0,180));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(-10, -40, 1030, 520);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/bigstock-Old-grunge-brick-wall-backgrou-47476903.jpg"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 1010, 470);

        jTabbedPane1.addTab("Profile", jPanel2);

        jPanel3.setLayout(null);

        feradiobtn.setBackground(new Color(0,0,0,0));
        buttonGroup1.add(feradiobtn);
        feradiobtn.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        feradiobtn.setForeground(new java.awt.Color(255, 255, 255));
        feradiobtn.setText("FE");
        feradiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feradiobtnActionPerformed(evt);
            }
        });
        jPanel3.add(feradiobtn);
        feradiobtn.setBounds(42, 33, 65, 27);

        seradiobtn.setBackground(new Color(0,0,0,0));
        buttonGroup1.add(seradiobtn);
        seradiobtn.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        seradiobtn.setForeground(new java.awt.Color(255, 255, 255));
        seradiobtn.setText("SE");
        seradiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seradiobtnActionPerformed(evt);
            }
        });
        jPanel3.add(seradiobtn);
        seradiobtn.setBounds(155, 33, 58, 27);

        teradiobtn.setBackground(new Color(0,0,0,0));
        buttonGroup1.add(teradiobtn);
        teradiobtn.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        teradiobtn.setForeground(new java.awt.Color(255, 255, 255));
        teradiobtn.setText("TE");
        jPanel3.add(teradiobtn);
        teradiobtn.setBounds(255, 33, 46, 27);

        beradiobtn.setBackground(new Color(0,0,0,0));
        buttonGroup1.add(beradiobtn);
        beradiobtn.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        beradiobtn.setForeground(new java.awt.Color(255, 255, 255));
        beradiobtn.setText("BE");
        jPanel3.add(beradiobtn);
        beradiobtn.setBounds(354, 33, 81, 27);

        showmarksbtn.setBackground(new java.awt.Color(102, 0, 0));
        showmarksbtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        showmarksbtn.setForeground(new java.awt.Color(255, 255, 255));
        showmarksbtn.setText("Show Marks");
        showmarksbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showmarksbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showmarksbtnActionPerformed(evt);
            }
        });
        jPanel3.add(showmarksbtn);
        showmarksbtn.setBounds(459, 29, 142, 25);

        updtstudentmarksbtn.setBackground(new java.awt.Color(102, 0, 0));
        updtstudentmarksbtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        updtstudentmarksbtn.setForeground(new java.awt.Color(255, 255, 255));
        updtstudentmarksbtn.setText("UPDATE MARKS");
        updtstudentmarksbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updtstudentmarksbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtstudentmarksbtnActionPerformed(evt);
            }
        });
        jPanel3.add(updtstudentmarksbtn);
        updtstudentmarksbtn.setBounds(674, 29, 149, 25);

        jPanel9.setBackground(new Color(51,0,0,180));

        jPanel6.setBackground(new Color(51,0,0,150));

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SEM-II");

        table2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUBJECT", "SCORE"
            }
        ));
        jScrollPane3.setViewportView(table2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel10)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        jPanel5.setBackground(new Color(51,0,0,150));

        table1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUBJECT", "SCORE"
            }
        ));
        jScrollPane2.setViewportView(table1);

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SEM-I");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel9)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel9);
        jPanel9.setBounds(0, 0, 1030, 470);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/bigstock-Old-grunge-brick-wall-backgrou-47476903.jpg"))); // NOI18N
        jPanel3.add(jLabel28);
        jLabel28.setBounds(0, 0, 1020, 510);

        jTabbedPane1.addTab("Academic", jPanel3);

        jPanel4.setLayout(null);

        studentextratable.setBackground(new Color(51,0,0,150));
        studentextratable.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        studentextratable.setForeground(new java.awt.Color(255, 255, 255));
        studentextratable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Activity Name", "Date", "Institute Name", "Achievement"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentextratable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentextratable.setOpaque(false);
        jScrollPane1.setViewportView(studentextratable);
        if (studentextratable.getColumnModel().getColumnCount() > 0) {
            studentextratable.getColumnModel().getColumn(0).setResizable(false);
            studentextratable.getColumnModel().getColumn(1).setResizable(false);
            studentextratable.getColumnModel().getColumn(2).setResizable(false);
            studentextratable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(52, 55, 452, 306);

        studentextraupdbtn.setBackground(new java.awt.Color(102, 0, 0));
        studentextraupdbtn.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        studentextraupdbtn.setForeground(new java.awt.Color(255, 255, 255));
        studentextraupdbtn.setText("UPDATE");
        studentextraupdbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentextraupdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentextraupdbtnActionPerformed(evt);
            }
        });
        jPanel4.add(studentextraupdbtn);
        studentextraupdbtn.setBounds(630, 55, 140, 25);

        transPanel.setBackground(new Color(51,0,0,180));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Activities Performed");

        javax.swing.GroupLayout transPanelLayout = new javax.swing.GroupLayout(transPanel);
        transPanel.setLayout(transPanelLayout);
        transPanelLayout.setHorizontalGroup(
            transPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
        );
        transPanelLayout.setVerticalGroup(
            transPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(423, Short.MAX_VALUE))
        );

        jPanel4.add(transPanel);
        transPanel.setBounds(0, 0, 1010, 465);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/bigstock-Old-grunge-brick-wall-backgrou-47476903.jpg"))); // NOI18N
        jPanel4.add(jLabel27);
        jLabel27.setBounds(0, 0, 1010, 470);

        jTabbedPane1.addTab("Extra-Curricular", jPanel4);

        jPanel7.setPreferredSize(new java.awt.Dimension(984, 465));
        jPanel7.setLayout(null);

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mentor ID:");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(116, 55, 120, 24);

        jLabel19.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Mobile No:");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(116, 217, 120, 24);

        jPanel10.setBackground(new Color(51,0,0,180));

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Name:");

        jLabel18.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Qualification:");

        jLabel25.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Email-ID:");

        jLabel26.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Department:");

        mentorqualification.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        mentorqualification.setForeground(new java.awt.Color(255, 255, 255));
        mentorqualification.setText("jLabel5");

        mentorname.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        mentorname.setForeground(new java.awt.Color(255, 255, 255));
        mentorname.setText("jLabel5");

        mentorid.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        mentorid.setForeground(new java.awt.Color(255, 255, 255));
        mentorid.setText("jLabel5");

        mentoremail.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        mentoremail.setForeground(new java.awt.Color(255, 255, 255));
        mentoremail.setText("jLabel5");

        mentordepartment.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        mentordepartment.setForeground(new java.awt.Color(255, 255, 255));
        mentordepartment.setText("jLabel5");

        mentormobile.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        mentormobile.setForeground(new java.awt.Color(255, 255, 255));
        mentormobile.setText("jLabel5");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mentordepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mentorqualification, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mentoremail, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mentormobile, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mentorname, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(mentorid, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(mentorid)
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mentorname))
                .addGap(32, 32, 32)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mentorqualification))
                .addGap(29, 29, 29)
                .addComponent(mentormobile)
                .addGap(35, 35, 35)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mentoremail))
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mentordepartment))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel10);
        jPanel10.setBounds(0, 0, 1070, 560);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentprogresstracking/bigstock-Old-grunge-brick-wall-backgrou-47476903.jpg"))); // NOI18N
        jPanel7.add(jLabel29);
        jLabel29.setBounds(0, 0, 1030, 500);

        jTabbedPane1.addTab("Mentor Details", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentextraupdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentextraupdbtnActionPerformed
        this.setVisible(false);
        new Enterextracurricular(obj).setVisible(true);        
    }//GEN-LAST:event_studentextraupdbtnActionPerformed

    private void feradiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feradiobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feradiobtnActionPerformed

    private void seradiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seradiobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seradiobtnActionPerformed

    private void updtstudentmarksbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtstudentmarksbtnActionPerformed
       
       // int temp2=(int)table.getValueAt(menteestable.getSelectedRow(),menteestable.getSelectedColumn());
        new UpdateMarks(currentUser).setVisible(true);
        
        
    }//GEN-LAST:event_updtstudentmarksbtnActionPerformed

    private void showmarksbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showmarksbtnActionPerformed
        
        try{
            MongoClient client = new MongoClient("localhost", 27017);
            DB db = client.getDB("StudentProgressTracking");
            DBCollection academic = db.getCollection("academics");

            DefaultTableModel t2 = (DefaultTableModel)table1.getModel();
            DefaultTableModel t = (DefaultTableModel)table2.getModel();

            t2.setRowCount(0);
            t.setRowCount(0);
        
        
        
            if(feradiobtn.isSelected()){



                int i=0;

                DBCursor cur1 = academic.find(new BasicDBObject("Student_ID", currentUser));

                for (DBObject r:cur1){

                    BasicDBList sub = (BasicDBList)r.get("FE_SEM-I");
                    
                    BasicDBObject[] subarr = sub.toArray(new BasicDBObject[0]);

                    for(BasicDBObject obj:subarr){
                        if(i == 0){
                            scr1 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"M-I",scr1});                   
                        }
                        if(i == 1){
                            scr2 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"Physics",scr2});

                        }
                        if(i == 2){
                            scr3 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"Electrical",scr3});

                        }
                        if(i == 3){
                            scr4 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"Civil",scr4});

                        }
                        if(i == 4){
                            scr5 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"EGR-I",scr5});
                        }
                        i++;
                    }

                }

                DBCursor cur2 = academic.find(new BasicDBObject("Student_ID", currentUser));

                i = 0;

                for (DBObject s:cur2){

                    BasicDBList sub = (BasicDBList)s.get("FE_SEM-II");
                    BasicDBObject[] subarr = sub.toArray(new BasicDBObject[0]);



                    for(BasicDBObject obj:subarr){
                        if(i == 0){
                            scr1 = (int)obj.get("Score");
                            t.addRow(new Object[]{"M-II",scr1});                   
                        }
                        if(i == 1){
                            scr2 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Chemistry",scr2});

                        }
                        if(i == 2){
                            scr3 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Mechanics",scr3});

                        }
                        if(i == 3){
                            scr4 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Electronics",scr4});

                        }
                        if(i == 4){
                            scr5 = (int)obj.get("Score");
                            t.addRow(new Object[]{"EGR-II",scr5});
                        }
                        i++;
                    }

                }

            }
            else if(seradiobtn.isSelected()){



                int i=0;

                DBCursor cur1 = academic.find(new BasicDBObject("Student_ID", currentUser));

                for (DBObject r:cur1){

                    BasicDBList sub = (BasicDBList)r.get("SE_SEM-I");
                    BasicDBObject[] subarr = sub.toArray(new BasicDBObject[0]);

                    for(BasicDBObject obj:subarr){
                        if(i == 0){
                            scr1 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"DS",scr1});                   
                        }
                        if(i == 1){
                            scr2 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"DSPS",scr2});

                        }
                        if(i == 2){
                            scr3 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"DELD",scr3});

                        }
                        if(i == 3){
                            scr4 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"OSA",scr4});

                        }
                        if(i == 4){
                            scr5 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"MA",scr5});
                        }
                        i++;
                    }

                }

                DBCursor cur2 = academic.find(new BasicDBObject("Student_ID", currentUser));

                i = 0;

                for (DBObject s:cur2){

                    BasicDBList sub = (BasicDBList)s.get("SE_SEM-II");
                    BasicDBObject[] subarr = sub.toArray(new BasicDBObject[0]);

                    for(BasicDBObject obj:subarr){
                        if(i == 0){
                            scr1 = (int)obj.get("Score");
                            t.addRow(new Object[]{"M-III",scr1});                   
                        }
                        if(i == 1){
                            scr2 = (int)obj.get("Score");
                            t.addRow(new Object[]{"OOMP",scr2});

                        }
                        if(i == 2){
                            scr3 = (int)obj.get("Score");
                            t.addRow(new Object[]{"MIT",scr3});

                        }
                        if(i == 3){
                            scr4 = (int)obj.get("Score");
                            t.addRow(new Object[]{"CGG",scr4});

                        }
                        if(i == 4){
                            scr5 = (int)obj.get("Score");
                            t.addRow(new Object[]{"CO",scr5});
                        }
                        i++;
                    }

                }

            }
            else if(teradiobtn.isSelected()){



                int i=0;

                DBCursor cur1 = academic.find(new BasicDBObject("Student_ID", currentUser));

                for (DBObject r:cur1){

                    BasicDBList sub = (BasicDBList)r.get("TE_SEM-I");
                    BasicDBObject[] subarr = sub.toArray(new BasicDBObject[0]);

                    for(BasicDBObject obj:subarr){
                        if(i == 0){
                            scr1 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"TOC",scr1});                   
                        }
                        if(i == 1){
                            scr2 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"DCWSN",scr2});

                        }
                        if(i == 2){
                            scr3 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"CF&CA",scr3});

                        }
                        if(i == 3){
                            scr4 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"DBMSA",scr4});

                        }
                        if(i == 4){
                            scr5 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"OSD",scr5});
                        }
                        i++;
                    }

                }

                DBCursor cur2 = academic.find(new BasicDBObject("Student_ID", currentUser));

                i = 0;

                for (DBObject s:cur2){

                    BasicDBList sub = (BasicDBList)s.get("TE_SEM-II");
                    BasicDBObject[] subarr = sub.toArray(new BasicDBObject[0]);

                    for(BasicDBObject obj:subarr){
                        if(i == 0){
                            scr1 = (int)obj.get("Score");
                            t.addRow(new Object[]{"PCDP",scr1});                   
                        }
                        if(i == 1){
                            scr2 = (int)obj.get("Score");
                            t.addRow(new Object[]{"EOS",scr2});

                        }
                        if(i == 2){
                            scr3 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Computer Network",scr3});

                        }
                        if(i == 3){
                            scr4 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Software Eng.",scr4});

                        }
                        if(i == 4){
                            scr5 = (int)obj.get("Score");
                            t.addRow(new Object[]{"DSPA",scr5});
                        }
                        i++;
                    }

                }
            }
            else if(beradiobtn.isSelected()){



                int i=0;

                DBCursor cur1 = academic.find(new BasicDBObject("Student_ID", currentUser));

                for (DBObject r:cur1){

                    BasicDBList sub = (BasicDBList)r.get("BE_SEM-I");
                    BasicDBObject[] subarr = sub.toArray(new BasicDBObject[0]);

                    for(BasicDBObject obj:subarr){
                        if(i == 0){
                            scr1 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"Image Processing",scr1});                   
                        }
                        if(i == 1){
                            scr2 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"CNDM",scr2});

                        }
                        if(i == 2){
                            scr3 = (int)obj.get("CF&CA");
                            t2.addRow(new Object[]{"Advanced Computer Programing",scr3});

                        }
                        if(i == 3){
                            scr4 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"Data Mining tech. and Applications",scr4});

                        }
                        if(i == 4){
                            scr5 = (int)obj.get("Score");
                            t2.addRow(new Object[]{"Embedded Security",scr5});
                        }
                        i++;
                    }

                }

                DBCursor cur2 = academic.find(new BasicDBObject("Student_ID", currentUser));

                i = 0;

                for (DBObject s:cur2){

                    BasicDBList sub = (BasicDBList)s.get("BE_SEM-II");
                    BasicDBObject[] subarr = sub.toArray(new BasicDBObject[0]);

                    for(BasicDBObject obj:subarr){
                        if(i == 0){
                            scr1 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Mobile Computing",scr1});                   
                        }
                        if(i == 1){
                            scr2 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Web Technology",scr2});

                        }
                        if(i == 2){
                            scr3 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Cloud Computing",scr3});

                        }
                        if(i == 3){
                            scr4 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Cyber Security",scr4});

                        }
                        if(i == 4){
                            scr5 = (int)obj.get("Score");
                            t.addRow(new Object[]{"Mobile Applications",scr5});
                        }
                        i++;
                    }

                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Please specify the Year", "Oops", JOptionPane.ERROR_MESSAGE);
            }
        
        }
        catch(Exception e){
            
        }
            
    }//GEN-LAST:event_showmarksbtnActionPerformed

    private void signoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to sign out?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);    
        if(choice == 0){   
            new Login().setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_signoutbtnActionPerformed

    private void changepasswbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswbtnActionPerformed
        String passw = JOptionPane.showInputDialog(this, "Enter new password", "New Password",JOptionPane.INFORMATION_MESSAGE);
        if(!(passw == null)){
            MongoClient client = new MongoClient("localhost", 27017);
            DB db = client.getDB("StudentProgressTracking");
            DBCollection student = db.getCollection("student");
            
            student.update(new BasicDBObject("_id", currentUser), new BasicDBObject("$set", new BasicDBObject("Password", passw)));
        }
    }//GEN-LAST:event_changepasswbtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton beradiobtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton changepasswbtn;
    private javax.swing.JRadioButton feradiobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel mentordepartment;
    private javax.swing.JLabel mentoremail;
    private javax.swing.JLabel mentorid;
    private javax.swing.JLabel mentormobile;
    private javax.swing.JLabel mentorname;
    private javax.swing.JLabel mentorqualification;
    private javax.swing.JLabel parea;
    private javax.swing.JLabel pblood;
    private javax.swing.JLabel pcity;
    private javax.swing.JLabel pdepartment;
    private javax.swing.JLabel pdiv;
    private javax.swing.JLabel pdob;
    private javax.swing.JLabel pemail;
    private javax.swing.JLabel pfathermob;
    private javax.swing.JLabel pfathername;
    private javax.swing.JLabel pmothermob;
    private javax.swing.JLabel pmothername;
    private javax.swing.JLabel pname;
    private javax.swing.JLabel ppin;
    private javax.swing.JLabel prollno;
    private javax.swing.JLabel pstudentmob;
    private javax.swing.JLabel pyear;
    private javax.swing.JRadioButton seradiobtn;
    private javax.swing.JButton showmarksbtn;
    private javax.swing.JButton signoutbtn;
    private javax.swing.JTable studentextratable;
    private javax.swing.JButton studentextraupdbtn;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JRadioButton teradiobtn;
    private javax.swing.JPanel transPanel;
    private javax.swing.JButton updtstudentmarksbtn;
    // End of variables declaration//GEN-END:variables
}
