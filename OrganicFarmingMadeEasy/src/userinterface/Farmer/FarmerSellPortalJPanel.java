/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.Crop.Crop;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FarmerCropWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aishwarya
 */
public class FarmerSellPortalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerSellPortalJPanel
     */
    private JPanel userProcessContainer;
    private FarmerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    
    public FarmerSellPortalJPanel(JPanel userProcessContainer, UserAccount account, FarmerOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        
//        dateChooserManufacture.getJCalendar().setMinSelectableDate(new Date());
        dateChooserExpiry.getJCalendar().setMinSelectableDate(new Date());
        
//        dateChooserManufacture.setMinSelectableDate(new Date());
        dateChooserExpiry.setMinSelectableDate(new Date());
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
        txtCropName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnSubmitCrop = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dateChooserExpiry = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("Crop Name:");

        txtCropName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCropNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity:");

        jLabel3.setText("Price:");

        btnSubmitCrop.setText("Submit Crop");
        btnSubmitCrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitCropActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setText("Expiry date:");

        jPanel1.setBackground(new java.awt.Color(47, 72, 147));

        jLabel4.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Farmer Sell Portal");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Provides facilty to upload crops for sale");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(673, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 89, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(45, 45, 45))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Farmer/o1.jpg"))); // NOI18N

        jLabel8.setText("Lbs");

        jLabel9.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCropName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateChooserExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubmitCrop))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCropName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dateChooserExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmitCrop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCropNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCropNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCropNameActionPerformed
    
    public boolean validateStrings(String name){
        
        Pattern pattern = Pattern.compile("[a-zA-Z ]*");
        Matcher matcher = pattern.matcher(name);
         if (!matcher.matches()) {
            return false;
      }
        return true;
    }
    
    private void btnSubmitCropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitCropActionPerformed
        // TODO add your handling code here:
        Crop crop = new Crop();
        FarmerCropWorkRequest farmerCropWorkRequest = new FarmerCropWorkRequest();
        
         if(txtCropName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Crop Name cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(!validateStrings(txtCropName.getText())){
            JOptionPane.showMessageDialog(null, "Please Enter valid string value", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        try{
            int quantity = Integer.parseInt(txtQuantity.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter quantity in proper format!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            double p = Double.parseDouble(txtPrice.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter price in proper format!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(dateChooserExpiry.getDate() == null){
            JOptionPane.showMessageDialog(null, "Please enter date!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        crop.setCropName(txtCropName.getText());
        crop.setPrice(Double.parseDouble(txtPrice.getText()));
        crop.setQuantity(Integer.parseInt(txtQuantity.getText()));
//        Date manuDate = dateChooserManufacture.getDate();
//        crop.setManufacturingDate(manuDate);
        Date expDate = dateChooserExpiry.getDate();
        crop.setExpiryDate(expDate);
        
       
        
         Organization org = null;
            for(Network network : business.getNetworkList()){
                for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof CustomerOrganization){
                            org = organization;
                            break;
                        }
                    }
                }
            }
            
//            if(manuDate.after(new Date())){
//                JOptionPane.showMessageDialog(null, "Manufacturing date cannot be greater than current date!");
//                return;
//            }
            
            if(expDate.after(new Date())){
                if(userAccount.getWorkQueue().getWorkRequestList().size()==0){
                farmerCropWorkRequest.setCrop(crop);
                org.getWorkQueue().getWorkRequestList().add(farmerCropWorkRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(farmerCropWorkRequest);
                JOptionPane.showMessageDialog(null, "Crop added successfully!");
                
            }else{
                boolean flag = true;
                List<WorkRequest> temp = new ArrayList<>();
                for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()){
                    System.out.println("inside for:"+wr);
                    if(wr instanceof FarmerCropWorkRequest){
                        temp.add(wr);
//                        org.getWorkQueue().getWorkRequestList().remove(wr);
                        //userAccount.getWorkQueue().getWorkRequestList().remove(wr);
                        
                    FarmerCropWorkRequest fw = (FarmerCropWorkRequest) wr;
                        System.out.println("fw : " + fw+ "cropname"+fw.getCrop().getCropName());
                    if(fw.getCrop().getCropName().equalsIgnoreCase(txtCropName.getText()))
                    {
                    fw.getCrop().setQuantity(fw.getCrop().getQuantity() + Integer.parseInt(txtQuantity.getText()));
                    flag = false;
                    }
                }
            }
//                System.out.println("Temp" +temp);
//                userAccount.getWorkQueue().getWorkRequestList().removeAll(temp);
//                org.getWorkQueue().getWorkRequestList().removeAll(temp);
//                for(WorkRequest w: org.getWorkQueue().getWorkRequestList()){
//                    System.out.println("Type"+ w);
//                }
//                System.out.println("Org size"+org.getWorkQueue().getWorkRequestList());
//                System.out.println("User Ac size"+userAccount.getWorkQueue().getWorkRequestList());
                if(flag){
                System.out.println("Org"+org);
                farmerCropWorkRequest.setCrop(crop);
                org.getWorkQueue().getWorkRequestList().add(farmerCropWorkRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(farmerCropWorkRequest);
                JOptionPane.showMessageDialog(null, "Crop added successfully!");
                }            
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Expiry date cannot be less than Current date!");
                return;
            }          
        farmerCropWorkRequest.setSender(userAccount);
        farmerCropWorkRequest.setStatus("Sent To Customer");
        txtCropName.setEditable(false);
        txtCropName.setEnabled(false);
        txtPrice.setEditable(false);
        txtPrice.setEnabled(false);
        txtQuantity.setEnabled(false);
        txtQuantity.setEditable(false);
        dateChooserExpiry.setEnabled(false);
    }//GEN-LAST:event_btnSubmitCropActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel panel = (FarmerWorkAreaJPanel) component;
        panel.populateSellOrganicCropsTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmitCrop;
    private com.toedter.calendar.JDateChooser dateChooserExpiry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCropName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
