/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Network.Network;
import Business.Organization.FarmerOrganization;
import Business.Organization.OfficerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FarmerSubsidyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.joda.time.LocalDate;
import org.joda.time.Months;

/**
 *
 * @author Pranali
 */
public class FarmerViewSubsidyRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private FarmerOrganization organization;
    private Enterprise enterprise;
    private double loss;
    /**
     * Creates new form FarmerViewSubsidyRequestJPanel
     */
    public FarmerViewSubsidyRequestJPanel(JPanel userProcessContainer, UserAccount account, FarmerOrganization organization, Enterprise enterprise, EcoSystem business,double loss) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.loss = loss;
        txtFarmerName.setText(userAccount.getUsername());
        txtLossAmount.setText(String.valueOf(loss));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFarmerName = new javax.swing.JTextField();
        txtLossAmount = new javax.swing.JTextField();
        btnRequestSubsidy = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBackButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("Farmer Name :");

        jLabel2.setText("Losses Amount:");

        txtFarmerName.setEditable(false);
        txtFarmerName.setEnabled(false);

        txtLossAmount.setEditable(false);
        txtLossAmount.setEnabled(false);

        btnRequestSubsidy.setText("Request Subsidy");
        btnRequestSubsidy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestSubsidyActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(47, 72, 147));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Request Subsidy");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Subsidy to compensate for loss");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(287, 287, 287))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnBackButton.setText("<< Back");
        btnBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Farmer/sub.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRequestSubsidy))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(112, 112, 112)
                                .addComponent(txtFarmerName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(102, 102, 102)
                                .addComponent(txtLossAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFarmerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLossAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRequestSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestSubsidyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestSubsidyActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        //FarmerCropWorkRequest fc = null;
//        double loss = 0.0;
//
//        for(WorkRequest workRequest :userAccount.getWorkQueue().getWorkRequestList()){
//            if(workRequest instanceof FarmerCropWorkRequest){
//                FarmerCropWorkRequest fs= (FarmerCropWorkRequest) workRequest;
//                Date date1 = fs.getRequestDate();
//                Date date2 = new Date();
//                if(fs.getCrop().getExpiryDate().before(date2) ){//&& (Months.monthsBetween(new LocalDate(date1), new LocalDate(date2))).getMonths() >= 6){
//                    loss +=fs.getCrop().getQuantity() * fs.getCrop().getPrice();
//                }else{
//                    JOptionPane.showMessageDialog(null, "Subsidy cannot be given as no expired crops"+loss);
//                }
//            }
//        }

        FarmerSubsidyWorkRequest subsidyWorkRequest = null;

        //boolean rejectFlag = true;
        for(WorkRequest workRequest :userAccount.getWorkQueue().getWorkRequestList()){

            if(workRequest instanceof FarmerSubsidyWorkRequest){
                Date date1 = workRequest.getResolveDate();
                Date date2 = new Date();
                
                
                if(((FarmerSubsidyWorkRequest) workRequest).isIsSubsidyApproved()==false && (Months.monthsBetween(new LocalDate(date2), new LocalDate(date1))).getMonths() < 6){
                    flag=false;
                }else{
                     if((Months.monthsBetween(new LocalDate(date2), new LocalDate(date1))).getMonths() >= 6 ){
                    FarmerSubsidyWorkRequest fs= (FarmerSubsidyWorkRequest) workRequest;
                    subsidyWorkRequest = (FarmerSubsidyWorkRequest) workRequest;
                    if(subsidyWorkRequest.isIsSubsidyApproved()){
                        flag = true;
                        break;
                    }
                }else{
                    
//                    if(subsidyWorkRequest.getStatus().equalsIgnoreCase("Rejected")){
//                        rejectFlag= false;
//                    }
                    JOptionPane.showMessageDialog(null, "Subsidy already given before less than 6 months");
                    flag = true;
                    break;
                }
                }
               

            }
        }
        
        
        if(flag){
            JOptionPane.showMessageDialog(null,"Already issued Subsidy!" );
        }
        else
        {
            FarmerSubsidyWorkRequest farmerSubsidyWorkRequest = new FarmerSubsidyWorkRequest();
            farmerSubsidyWorkRequest.setRequestDate(new Date());
            farmerSubsidyWorkRequest.setSender(userAccount);
            farmerSubsidyWorkRequest.setStatus("Sent");
            farmerSubsidyWorkRequest.setRequestedSubsidyValue(loss);

            Organization org = null;
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof GovernmentEnterprise) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof OfficerOrganization) {
                                org = organization;
                                break;
                            }
                        }
                    }

                }
            }

            if (org != null) {
                //if(userAccount.getWorkQueue().getWorkRequestList().size() == 0){
                    org.getWorkQueue().getWorkRequestList().add(farmerSubsidyWorkRequest);
                    userAccount.getWorkQueue().getWorkRequestList().add(farmerSubsidyWorkRequest);
                    JOptionPane.showMessageDialog(null, "You have created request successfully");

                    //                }else{
                    //
                    //                    org.getWorkQueue().getWorkRequestList().add(farmerSubsidyWorkRequest);
                    //                    userAccount.getWorkQueue().getWorkRequestList().add(farmerSubsidyWorkRequest);
                    //                    JOptionPane.showMessageDialog(null, "You have created request successfully");
                    //
                    //                }
            }
    }//GEN-LAST:event_btnRequestSubsidyActionPerformed
    }
    private void btnBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackButtonActionPerformed
        // TODO add your handling code here:
//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel panel = (FarmerWorkAreaJPanel) component;
        panel.populateRequestSubsidyTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackButton;
    private javax.swing.JButton btnRequestSubsidy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtFarmerName;
    private javax.swing.JTextField txtLossAmount;
    // End of variables declaration//GEN-END:variables
}
