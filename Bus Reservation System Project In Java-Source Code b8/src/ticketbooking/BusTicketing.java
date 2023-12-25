package ticketbooking;

public class BusTicketing extends javax.swing.JFrame{

  
    public BusTicketing() {
        initComponents();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextFieldForm = new javax.swing.JTextField();
        jTextFieldTo = new javax.swing.JTextField();
        jTextFieldDate2 = new javax.swing.JTextField();
        jTextFieldTime2 = new javax.swing.JTextField();
        jTextFieldClass = new javax.swing.JTextField();
        jTextFieldTicketType = new javax.swing.JTextField();
        jTextFieldPassengers2 = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDestination = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonSingle1 = new javax.swing.JRadioButton();
        jRadioButtonEconomy1 = new javax.swing.JRadioButton();
        jRadioButtonReturn1 = new javax.swing.JRadioButton();
        jRadioButtonFirstClass1 = new javax.swing.JRadioButton();
        jTextFieldPassenger1 = new javax.swing.JTextField();
        jComboBoxTime = new javax.swing.JComboBox<>();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldTax = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jButtonTotal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("KOMBAN BUS TICKET SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButtonExit.setBackground(new java.awt.Color(255, 153, 0));
        jButtonExit.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonExitMouseExited(evt);
            }
        });
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel19.setText("Project by MD ISMAIL, MD ABUHURAIRA, MD SUHAIL, MD SIBILI");

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel20.setText("BATCH NO : 8 ");

        jButtonReset.setBackground(new java.awt.Color(255, 0, 0));
        jButtonReset.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel26.setText("From");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel30.setText("To");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel31.setText("Class");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel32.setText("Departure");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel33.setText("Date of Journey");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel34.setText("Amount Paid");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel35.setText("No. of Passangers ");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel36.setText("Ticket Type");

        jTextFieldForm.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormActionPerformed(evt);
            }
        });

        jTextFieldTo.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldToActionPerformed(evt);
            }
        });

        jTextFieldDate2.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldDate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDate2ActionPerformed(evt);
            }
        });

        jTextFieldTime2.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTime2ActionPerformed(evt);
            }
        });

        jTextFieldClass.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassActionPerformed(evt);
            }
        });

        jTextFieldTicketType.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTicketType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTicketTypeActionPerformed(evt);
            }
        });

        jTextFieldPassengers2.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPassengers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassengers2ActionPerformed(evt);
            }
        });

        jTextFieldPrice.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldForm, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPassengers2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldClass, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTicketType, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabel20))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jTextFieldTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jTextFieldTicketType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jTextFieldPassengers2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Destinantion ");

        jComboBoxDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Destination ", "Kerala", "Bangalore", "Kozhicode", "Hosur", "Andhra" }));
        jComboBoxDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDestinationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Date of Journey");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Ticket Type ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Departure");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("No. of Passengers ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Class");

        jRadioButtonSingle1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonSingle1.setText("Single");
        jRadioButtonSingle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSingle1ActionPerformed(evt);
            }
        });

        jRadioButtonEconomy1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonEconomy1.setText("Economy");
        jRadioButtonEconomy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEconomy1ActionPerformed(evt);
            }
        });

        jRadioButtonReturn1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonReturn1.setText("Return");
        jRadioButtonReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonReturn1ActionPerformed(evt);
            }
        });

        jRadioButtonFirstClass1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jRadioButtonFirstClass1.setText("First Class");
        jRadioButtonFirstClass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFirstClass1ActionPerformed(evt);
            }
        });

        jComboBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time", "11:30", "12:30", "1:30", "2:30" }));
        jComboBoxTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPassenger1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxDestination, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jRadioButtonFirstClass1)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jRadioButtonSingle1)
                                                .addGap(50, 50, 50)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonReturn1)
                                            .addComponent(jRadioButtonEconomy1)))
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 57, Short.MAX_VALUE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonReturn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButtonSingle1)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonFirstClass1)
                        .addComponent(jRadioButtonEconomy1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPassenger1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("Total");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Sub Total ");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("Tax ");

        jTextFieldTax.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxActionPerformed(evt);
            }
        });

        jTextFieldTotal.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jTextFieldSubTotal.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jButtonTotal.setBackground(new java.awt.Color(0, 255, 0));
        jButtonTotal.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButtonTotal.setText("Submit");
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setForeground(new java.awt.Color(255, 0, 0));

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel21.setText("Kerala, Bangalore, Kozhicode, Oosur and Andhra");

        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel22.setText("KOMBBAN TRAVELS BUS TICKETING SYSTEM");

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel23.setText(" FROM  TAMILNADU(CHENNAI)");

        jLabel29.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel29.setText("TO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(164, 164, 164))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(255, 255, 255))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel24.setText("WITH GST - 5%");

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel25.setText("KOMBAN TRAVELS");

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel27.setText("FOR MORE VISIT");

        jLabel28.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel28.setText("WWW.KOMBANTRAVELSTN.IN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonTotal)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel28)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonTotal)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonFirstClass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFirstClass1ActionPerformed
        // TODO add your handling code here
        if(jRadioButtonFirstClass1.isSelected()){
        jRadioButtonEconomy1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonFirstClass1ActionPerformed

    private void jRadioButtonEconomy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEconomy1ActionPerformed
        // TODO add your handling code here:
         if(jRadioButtonEconomy1.isSelected()){
        jRadioButtonFirstClass1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonEconomy1ActionPerformed

    private void jTextFieldTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTaxActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jTextFieldSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubTotalActionPerformed

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
        // TODO add your handling code here:
        int fare=50;
        int Tax = 5;
        int miles = 0;
        int Tfare =0;
        int Dtax=0;
        int SubTotal = 0;
      
       if(jComboBoxDestination.getSelectedItem().equals("Bangalore") && jRadioButtonFirstClass1.isSelected()&& 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
    
        int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
          jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
           jTextFieldTo.setText("Banalore");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
       
           miles = 216;
           Tfare= (miles*fare)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
         
       }
        else if(jComboBoxDestination.getSelectedItem().equals("Bangalore") && jRadioButtonEconomy1.isSelected()&& 
                jRadioButtonSingle1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
          int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Bangalore");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
      
           miles = 216;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
        else if(jComboBoxDestination.getSelectedItem().equals("Bangalore") && jRadioButtonFirstClass1.isSelected()&& 
               jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null)) ){
           int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Bangalore");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
          miles = 216;
           Tfare= (miles*fare*1)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
        else if(jComboBoxDestination.getSelectedItem().equals("Bangalore") && jRadioButtonEconomy1.isSelected()&& 
                jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
          int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Bangalore");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
       
           miles = 216;
           Tfare= miles*fare*1;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else if(jComboBoxTime.getSelectedItem().equals("Select Time")){
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Kerala")&& jRadioButtonEconomy1.isSelected()&& 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
     int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
      jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kerala");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");       
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
              miles = 377;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Kerala") && jRadioButtonFirstClass1.isSelected() && 
               jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
           int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kerala");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
                  miles = 377;
           Tfare= (miles*fare)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else{
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Kerala")&& jRadioButtonEconomy1.isSelected()&& 
               jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kerala");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Binalabagan");
       
       miles = 377;
           Tfare= miles*fare*1;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
           if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Kerala") && jRadioButtonFirstClass1.isSelected() && 
               jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kerala");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
      jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
       
      
           miles = 377;
           Tfare= (miles*fare*1)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Kozhicode") && jRadioButtonEconomy1.isSelected() 
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kozhicode");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
       
       miles = 426;
           Tfare= miles*fare*1;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
          if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
           else if(jComboBoxDestination.getSelectedItem().equals("Kozhicode") && jRadioButtonFirstClass1.isSelected()
                   && jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){
          int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kozhicode");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
      jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
       
           miles = 426;
           Tfare= (miles*fare*1)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
       if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Kozhicode") && jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kozhicode");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
      
       miles = 426;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
   if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
           else if(jComboBoxDestination.getSelectedItem().equals("Kozhicode") && jRadioButtonFirstClass1.isSelected()
                   && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Kozhicode");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
      
           miles = 426;
           Tfare= (miles*fare)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Hosur")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
   
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Hosur");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
       
       miles = 7;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("Hosur") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Hosur");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
       
           miles = 193;
           Tfare= (miles*fare*1)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*(Pass);
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
        if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("Hosur")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
       int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Hosur");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
       
       miles = 193;
           Tfare= miles*fare*1;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("Hosur") && jRadioButtonFirstClass1.isSelected()
                  && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Hosur");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
      
           miles = 193;
           Tfare= (miles*fare)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*(Pass);
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
        if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
          else if(jComboBoxDestination.getSelectedItem().equals("Andhra")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Andhra");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("Tamilnadu");
      
        miles = 234;
           Tfare= miles*fare;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
        if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Andhra") && jRadioButtonFirstClass1.isSelected()
               && jRadioButtonSingle1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) ) ){
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Andhra");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("One Way");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
      
           miles = 234;
           Tfare= (miles*fare)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Andhra")&& jRadioButtonEconomy1.isSelected()
               && jRadioButtonReturn1.isSelected()&& (!(jTextFieldPassenger1.getText()== null) )){
      int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
     
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Andhra");
       jTextFieldClass.setText("Economy");
       jTextFieldTicketType.setText("Round Trip");
       jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
       
        miles = 234;
           Tfare= miles*fare*1;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
        jTextFieldPrice.setText(Stotal);
           if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }
         
       }
       else if(jComboBoxDestination.getSelectedItem().equals("Andhra") && jRadioButtonFirstClass1.isSelected()
               && jRadioButtonReturn1.isSelected() && (!(jTextFieldPassenger1.getText()== null) )){           
         int Pass = Integer.parseInt(jTextFieldPassenger1.getText());
      
       jTextFieldPassengers2.setText(jTextFieldPassenger1.getText());
         jTextFieldTo.setText("Andhra");
       jTextFieldClass.setText("First Class");
       jTextFieldTicketType.setText("Round Trip");
      jTextFieldDate2.setText(jDateChooser.getDate().toString());
         jTextFieldForm.setText("TamilNadu");
     
        miles = 234;
           Tfare= (miles*fare*1)+50;
           Dtax = (Tax*Tfare)/100;
           SubTotal = (Dtax + Tfare)*Pass;
          String Totalfare= String.format("%d",Tfare);
          String DisplayTax = String.format("%d",Dtax);
          String Stotal = String.format("%d",SubTotal);    
       jTextFieldTotal.setText(Totalfare);
       jTextFieldTax.setText(DisplayTax);
       jTextFieldSubTotal.setText(Stotal);
       jTextFieldPrice.setText(Stotal);
      jTextFieldTicketType.setText("Round Trip");
         if(jComboBoxTime.getSelectedItem().equals("11:30")){
        jTextFieldTime2.setText("11:30");
        }else if(jComboBoxTime.getSelectedItem().equals("12:30")){
        jTextFieldTime2.setText("12:30");
        }
         else if(jComboBoxTime.getSelectedItem().equals("1:30")){
        jTextFieldTime2.setText("1:30");
        }else if(jComboBoxTime.getSelectedItem().equals("2:30")){jTextFieldTime2.setText("2:30");}
        else {
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
        }  
       }
        else if((!jRadioButtonSingle1.isSelected() && !jRadioButtonReturn1.isSelected()) ||
               (!jRadioButtonFirstClass1.isSelected()&& !jRadioButtonEconomy1.isSelected()) ||
               jComboBoxDestination.getSelectedItem().equals("Select Destination")|| "".equals(jTextFieldPassenger1.getText()) ){
       jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);       
       }       
      
      
       else{
           jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
       }
       
      
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void jComboBoxDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDestinationActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExitMouseExited

    private void jButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitMouseClicked

    private void jRadioButtonSingle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSingle1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonSingle1.isSelected()){       
        jRadioButtonReturn1.setSelected(false);}
    }//GEN-LAST:event_jRadioButtonSingle1ActionPerformed

    private void jRadioButtonReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonReturn1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonReturn1.isSelected()){
        jRadioButtonSingle1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonReturn1ActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
          jTextFieldTo.setText(null);
       jTextFieldTotal.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldPrice.setText(null);
       jTextFieldForm.setText(null);
       jTextFieldDate2.setText(null);
       jTextFieldTime2.setText(null);
       jTextFieldClass.setText(null);
       jTextFieldPassengers2.setText(null);
       jTextFieldTicketType.setText(null);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jComboBoxTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTimeActionPerformed

    private void jTextFieldFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormActionPerformed

    private void jTextFieldToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldToActionPerformed

    private void jTextFieldDate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDate2ActionPerformed

    private void jTextFieldTime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTime2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTime2ActionPerformed

    private void jTextFieldClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClassActionPerformed

    private void jTextFieldTicketTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTicketTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTicketTypeActionPerformed

    private void jTextFieldPassengers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassengers2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassengers2ActionPerformed

    private void jTextFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPriceActionPerformed


//
    
    public static void main(String args[]) {
      
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusTicketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new BusTicketing().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JComboBox<String> jComboBoxDestination;
    private javax.swing.JComboBox<String> jComboBoxTime;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButtonEconomy1;
    private javax.swing.JRadioButton jRadioButtonFirstClass1;
    private javax.swing.JRadioButton jRadioButtonReturn1;
    private javax.swing.JRadioButton jRadioButtonSingle1;
    private javax.swing.JTextField jTextFieldClass;
    private javax.swing.JTextField jTextFieldDate2;
    private javax.swing.JTextField jTextFieldForm;
    private javax.swing.JTextField jTextFieldPassenger1;
    private javax.swing.JTextField jTextFieldPassengers2;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTicketType;
    private javax.swing.JTextField jTextFieldTime2;
    private javax.swing.JTextField jTextFieldTo;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
