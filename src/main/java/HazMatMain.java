/*
This is a NETBEANS project
Recommend cloning it to desktop then open as new project in NETBEANS

 Some testing code in main is commented out, check

  INCLUDE AT YOUR OWN PERIL
*/

import java.util.Date;

public class HazMatMain  extends javax.swing.JFrame  {

                        private javax.swing.JButton jButton1;
                        private javax.swing.JButton jButton2;
                        private javax.swing.JButton jButton3;
                        private javax.swing.JButton jButton4;
                        private javax.swing.JButton jButton5;
                        private javax.swing.JButton jButton6;
                        private javax.swing.JLabel jLabel1;
                        private javax.swing.JLabel jLabel2;
                        
                    // constructor for front gui and driver code    
                public HazMatMain(){
                    
                   initComponents();
                    
                }
                
                private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("MSDS Management System");

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("MSDS");
        /*jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        }); */

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setText("Manager");

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton3.setText("Employee");

        jButton4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton4.setText("HazMat");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\james\\Documents\\NetBeansProjects\\MSDSproj\\src\\msdsimage.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        jButton5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton5.setText("Help");

        jButton6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton6.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(50, 50, 50)
                        .addComponent(jButton6))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(13, 13, 13)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton6)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }
    
		public static void main(String[] args){
         
			System.out.println("main page is running..");
		//	employeeTest();
		//	inventoryTest();
                        
                         try {
                            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                    break;
                                }
                            }
                        } catch (ClassNotFoundException ex) {
                            java.util.logging.Logger.getLogger(frontGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            java.util.logging.Logger.getLogger(frontGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            java.util.logging.Logger.getLogger(frontGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                            java.util.logging.Logger.getLogger(frontGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        }
                        //</editor-fold>

                        /* Create and display the form */
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new frontGUI().setVisible(true);
                            }
                        });

	}

		//testing for HazMatInventory
		public static void inventoryTest() {
			HazMatInventory test = new HazMatInventory();
			for(int i = 0 ; i < 5 ; i++) {
				test.addHazMatItemToInventory();
			}
			System.out.println(test.ToString());
		}

		//testing for employee class hierarchy
		public static void employeeTest(){
			HazMatEmployee test = new HazMatEmployee("Capt Stubing","Isaac Washinton","9/24/1977",
				"12/7/1979","night","Stewards");
			System.out.println(test.toString());
		}

		//testing for MSDSObject class
		public static void MSDSTest() {
			MSDSObject test = new MSDSObject();
			test.Ask_and_Set_All_Input();
		}
}
