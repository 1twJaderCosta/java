
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kill
 */
public class puzzle extends javax.swing.JFrame {
    
    // ini conometrooo -----------------------
    
    public long begin, end;
 
    public void start(){
        begin = 0; end = 0;
        begin = System.currentTimeMillis();
    }
 
    public void stop(){
        end = System.currentTimeMillis();
    }
 
    public long getTime() {
        return end-begin;
    }
 
    public long getMilliseconds() {
        return end-begin;
    }
 
    public double getSeconds() {
        return (end - begin) / 1000.0;
    }
 
    public double getMinutes() {
        return (end - begin) / 60000.0;
    }
 
    public double getHours() {
        return (end - begin) / 3600000.0;
    }
 /*
    public static void main(String[] arg) {
        Chronometer ch = new Chronometer();
 
        ch.start();
        for (int i = 1;i<10000000;i++) {}
        ch.stop();
        System.out.println(ch.getTime());
 
        ch.start();
        for (int i = 10000000;i>0;i--) {}
        ch.stop();
        System.out.println(ch.getTime());
    }
    */
    // end conometro ----------------------------

    /**
     * Creates new form puzzle
     */
    public puzzle() {
        initComponents();
        randon ();
    }
    
    Random rn = new Random();
    int a3 = rn.nextInt(8 - 1 +1) + 1;
    int b = rn.nextInt(8 - 1 +1) + 1;
    int c =rn.nextInt(8 - 1 +1) + 1;
    int d = rn.nextInt(8 - 1 +1) + 1;
    int e =rn.nextInt(8 - 1 +1) + 1;
    int f = rn.nextInt(8 - 1 +1) + 1;
    int g =rn.nextInt(8 - 1 +1) + 1;
    int h =rn.nextInt(8 - 1 +1) + 1;
    public void ini_program(){
      int  count = 1;
    int mat[][] = new int[3][3];
        for (int i=0; i< 3; i++){    
            for (int j=0; j< 3; j++){
                mat[i][j] = count;
                        count ++;                      
            }
        }
    mat[2][2] = ' ';
    }
    private Timer cronometro;
    int count1 = 0;
    
    
    public void countMovimento(){
        count1 +=1;
        String rec = Integer.toString(count1);
        movimentosLabel.setText("Movimentos : "+rec);
        checaVencedor();
    }
    
    public void randon (){
       Random rn = new Random();
       int answer = rn.nextInt(8 - 1 +1) + 1;
       funcAle(answer);
    }
    
    public void jEmbaralha(){
        Random rn = new Random();
        int x = rn.nextInt(8 - 1 +1) + 1;
        b=x;c=x;d=x;e=x;f=x;g=x;h=x;

        funcAle(a3);
    }                
    
        
    public int funcAle(int rec){
            
      if(b != a3){
            if(c != a3 && c != b){
                    if(d != a3 && d != b && d != c){
                        if(e != a3 && e != b && e != c && e != d){
                                if(f != a3 && f != b && f != c && f != d && f != e){
                                    if(g != a3 && g != b && g != c && g != d && g != e && g != f){
                                        if(h != a3 && h != b && h != c && h != d && h != e && h != f && h != g){
                                                umButton.setText(String.valueOf(a3));
                                                umButton.setBackground(new Color(59,59,59));
                                                doisButton.setText(Integer.toString(b));
                                                doisButton.setBackground(new Color(59,59,59));
                                                tresButton.setText(Integer.toString(c));
                                                tresButton.setBackground(new Color(59,59,59));
                                                quatroButton.setText(Integer.toString(d));
                                                quatroButton.setBackground(new Color(59,59,59));
                                                cincoButton.setText(Integer.toString(e));
                                                cincoButton.setBackground(new Color(59,59,59));
                                                seisButton.setText(Integer.toString(f));
                                                seisButton.setBackground(new Color(59,59,59));
                                                seteButton.setText(Integer.toString(g));
                                                seteButton.setBackground(new Color(59,59,59));
                                                oitoButton.setText(Integer.toString(h));
                                                oitoButton.setBackground(new Color(59,59,59));
                                                noveButton.setText("");
                                                noveButton.setBackground(Color.BLUE);
                                                
          
                                        }else {
                                          h = rec;
                                          randon ();  
                                        }
          
                                    }else {
                                      g = rec;
                                      randon ();  
                                    }
          
                                }else {
                                  f = rec;
                                  randon ();  
                                }

                        }else {
                          e = rec;
                          randon ();  
                        }
          
                    }else {
                      d = rec;
                      randon ();  
                    }
          
            }else {
              c = rec;
              randon ();  
            }
          
      }else {
        b = rec;
        randon ();  
      }
      
      return 1;
    }
    
    
    
  
    
    public void checaVencedor(){
       String um = umButton.getText();
       String dois = umButton.getText();
       String tres = umButton.getText();
       String quatro = umButton.getText();
       String cinco = umButton.getText();
       String seis = umButton.getText();
       String sete = umButton.getText();
       String oito = umButton.getText();
       if(um.equals("1") && dois.equals("2") && tres.equals("3") && quatro.equals("4") && cinco.equals("5") && seis.equals("6") && sete.equals("7") && oito.equals("8")){
         JOptionPane.showMessageDialog(null, "SEquencia de 1 a 8, voce ganhou");
           
       }else{}
    }
    
   
          
    
   public void zerarJogo(){
       
       umButton.setText("1");
       umButton.setBackground(new Color(59,59,59));
       doisButton.setText("2");
       doisButton.setBackground(new Color(59,59,59));
       tresButton.setText("3");
       tresButton.setBackground(new Color(59,59,59));
       quatroButton.setText("4");
       quatroButton.setBackground(new Color(59,59,59));
       cincoButton.setText("5");
       cincoButton.setBackground(new Color(59,59,59));
       seisButton.setText("6");
       seisButton.setBackground(new Color(59,59,59));
       seteButton.setText("7");
       seteButton.setBackground(new Color(59,59,59));
       oitoButton.setText("8");
       oitoButton.setBackground(new Color(59,59,59));
       noveButton.setText("");
       noveButton.setBackground(Color.BLUE);
       
   }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tempoLabel = new javax.swing.JLabel();
        movimentosLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tempLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        umButton = new javax.swing.JButton();
        tresButton = new javax.swing.JButton();
        quatroButton = new javax.swing.JButton();
        cincoButton = new javax.swing.JButton();
        doisButton = new javax.swing.JButton();
        seteButton = new javax.swing.JButton();
        oitoButton = new javax.swing.JButton();
        noveButton = new javax.swing.JButton();
        seisButton = new javax.swing.JButton();
        finalizarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        exitMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        embaralharMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(99, 121, 132));

        jPanel3.setBackground(new java.awt.Color(76, 76, 76));

        tempoLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        tempoLabel.setForeground(new java.awt.Color(254, 254, 254));
        tempoLabel.setText("Tempo 00:00:00");

        movimentosLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        movimentosLabel.setForeground(new java.awt.Color(254, 254, 254));
        movimentosLabel.setText("Movimentos: 000");

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 245, 245));
        jLabel1.setText("Tempo de jogo : ");

        tempLabel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        tempLabel.setForeground(new java.awt.Color(255, 245, 245));
        tempLabel.setText("0:00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tempoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movimentosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(movimentosLabel)
                    .addComponent(jLabel1)
                    .addComponent(tempLabel))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(76, 76, 76));

        umButton.setBackground(new java.awt.Color(59, 59, 59));
        umButton.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        umButton.setForeground(new java.awt.Color(254, 254, 254));
        umButton.setText("1");
        umButton.setToolTipText("");
        umButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umButtonActionPerformed(evt);
            }
        });

        tresButton.setBackground(new java.awt.Color(59, 59, 59));
        tresButton.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        tresButton.setForeground(new java.awt.Color(254, 254, 254));
        tresButton.setText("3");
        tresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresButtonActionPerformed(evt);
            }
        });

        quatroButton.setBackground(new java.awt.Color(59, 59, 59));
        quatroButton.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        quatroButton.setForeground(new java.awt.Color(254, 254, 254));
        quatroButton.setText("4");
        quatroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroButtonActionPerformed(evt);
            }
        });

        cincoButton.setBackground(new java.awt.Color(59, 59, 59));
        cincoButton.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        cincoButton.setForeground(new java.awt.Color(254, 254, 254));
        cincoButton.setText("5");
        cincoButton.setToolTipText("");
        cincoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoButtonActionPerformed(evt);
            }
        });

        doisButton.setBackground(new java.awt.Color(59, 59, 59));
        doisButton.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        doisButton.setForeground(new java.awt.Color(254, 254, 254));
        doisButton.setText("2");
        doisButton.setToolTipText("");
        doisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisButtonActionPerformed(evt);
            }
        });

        seteButton.setBackground(new java.awt.Color(59, 59, 59));
        seteButton.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        seteButton.setForeground(new java.awt.Color(254, 254, 254));
        seteButton.setText("7");
        seteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteButtonActionPerformed(evt);
            }
        });

        oitoButton.setBackground(new java.awt.Color(59, 59, 59));
        oitoButton.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        oitoButton.setForeground(new java.awt.Color(254, 254, 254));
        oitoButton.setText("8");
        oitoButton.setToolTipText("");
        oitoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoButtonActionPerformed(evt);
            }
        });

        noveButton.setBackground(new java.awt.Color(22, 12, 220));
        noveButton.setForeground(new java.awt.Color(254, 254, 254));
        noveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveButtonActionPerformed(evt);
            }
        });

        seisButton.setBackground(new java.awt.Color(59, 59, 59));
        seisButton.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        seisButton.setForeground(new java.awt.Color(254, 254, 254));
        seisButton.setText("6");
        seisButton.setToolTipText("");
        seisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisButtonActionPerformed(evt);
            }
        });

        finalizarButton.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        finalizarButton.setText("Finalizar");
        finalizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(finalizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quatroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(umButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cincoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oitoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(noveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quatroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cincoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(seisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oitoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finalizarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        exitMenu.setText("Game");

        jMenuItem2.setText("Sequencia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoJogoMenu(evt);
            }
        });
        exitMenu.add(jMenuItem2);

        embaralharMenu.setText("Embaralhar");
        embaralharMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                embaralharMenuActionPerformed(evt);
            }
        });
        exitMenu.add(embaralharMenu);
        exitMenu.add(jSeparator1);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenu(evt);
            }
        });
        exitMenu.add(jMenuItem3);

        jMenuBar1.add(exitMenu);

        jMenu2.setText("Ajuda");

        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        jMenu2.add(Sobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        JaderProfile jp = new JaderProfile();
 
        jp.setVisible(true);
        
    }//GEN-LAST:event_SobreActionPerformed

    private void umButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umButtonActionPerformed
        String um = umButton.getText();
        if(um.equals(' ')){
            JOptionPane.showMessageDialog(null, "Nao eh possivel mover um campo Nulo");
        }else if(doisButton.getText().equals("")){
            doisButton.setText(um);
            umButton.setText("");
            doisButton.setBackground(new Color(59,59,59));
            umButton.setBackground(Color.BLUE);
            countMovimento();
 
        }else if(quatroButton.getText().equals("")){
            quatroButton.setText(um);
            umButton.setText("");
            quatroButton.setBackground(new Color(59,59,59));
            umButton.setBackground(Color.BLUE);
            countMovimento();
        }else{
            JOptionPane.showMessageDialog(null, "Necessário campo livre na vertical ou horizontal para mover");
        }
    }//GEN-LAST:event_umButtonActionPerformed

    private void doisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisButtonActionPerformed
        String dois = doisButton.getText();
        if(dois.equals(' ')){
            JOptionPane.showMessageDialog(null, "Nao eh possivel mover um campo Nulo");
        }else if(umButton.getText().equals("")){
            umButton.setText(dois);
            doisButton.setText("");
            umButton.setBackground(new Color(59,59,59));
            doisButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(tresButton.getText().equals("")){
            tresButton.setText(dois);
            doisButton.setText("");
            tresButton.setBackground(new Color(59,59,59));
            doisButton.setBackground(Color.BLUE);
            countMovimento();
        }
        else if(cincoButton.getText().equals("")){
            cincoButton.setText(dois);
            doisButton.setText("");
            cincoButton.setBackground(new Color(59,59,59));
            doisButton.setBackground(Color.BLUE);
            countMovimento();
        }else{
            JOptionPane.showMessageDialog(null, "Necessário campo livre na vertical ou horizontal para mover");
        }
    }//GEN-LAST:event_doisButtonActionPerformed

    private void tresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresButtonActionPerformed
        String tres = tresButton.getText();
        if(tres.equals(' ')){
            JOptionPane.showMessageDialog(null, "Nao eh possivel mover um campo Nulo");
        }else if(doisButton.getText().equals("")){
            doisButton.setText(tres);
            tresButton.setText("");
            doisButton.setBackground(new Color(59,59,59));
            tresButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(seisButton.getText().equals("")){
            seisButton.setText(tres);
            tresButton.setText("");
            seisButton.setBackground(new Color(59,59,59));
            tresButton.setBackground(Color.BLUE);
            countMovimento();
        }else{
            JOptionPane.showMessageDialog(null, "Necessário campo livre na vertical ou horizontal para mover");
        }
    }//GEN-LAST:event_tresButtonActionPerformed

    private void quatroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroButtonActionPerformed
        String quatro = quatroButton.getText();
        if(quatro.equals(' ')){
            JOptionPane.showMessageDialog(null, "Nao eh possivel mover um campo Nulo");
        }else if(umButton.getText().equals("")){
            umButton.setText(quatro);
            quatroButton.setText("");
            umButton.setBackground(new Color(59,59,59));
            quatroButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(seteButton.getText().equals("")){
            seteButton.setText(quatro);
            quatroButton.setText("");
            seteButton.setBackground(new Color(59,59,59));
            quatroButton.setBackground(Color.BLUE);
            countMovimento();
        }
        else if(cincoButton.getText().equals("")){
            cincoButton.setText(quatro);
            quatroButton.setText("");
            cincoButton.setBackground(new Color(59,59,59));
            quatroButton.setBackground(Color.BLUE);
            countMovimento();
        }else{
            JOptionPane.showMessageDialog(null, "Necessário campo livre na vertical ou horizontal para mover");
        }
    }//GEN-LAST:event_quatroButtonActionPerformed

    private void cincoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoButtonActionPerformed
        String cinco = cincoButton.getText();
        if(cinco.equals(' ')){
            JOptionPane.showMessageDialog(null, "Nao eh possivel mover um campo Nulo");
        }else if(quatroButton.getText().equals("")){
            quatroButton.setText(cinco);
            cincoButton.setText("");
            quatroButton.setBackground(new Color(59,59,59));
            cincoButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(seisButton.getText().equals("")){
            seisButton.setText(cinco);
            cincoButton.setText("");
            seisButton.setBackground(new Color(59,59,59));
            cincoButton.setBackground(Color.BLUE);
            countMovimento();
        }
        else if(doisButton.getText().equals("")){
            doisButton.setText(cinco);
            cincoButton.setText("");
            doisButton.setBackground(new Color(59,59,59));
            cincoButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(oitoButton.getText().equals("")){
            oitoButton.setText(cinco);
            cincoButton.setText("");
            oitoButton.setBackground(new Color(59,59,59));
            cincoButton.setBackground(Color.BLUE);
            countMovimento();
        }else{
            JOptionPane.showMessageDialog(null, "Necessário campo livre na vertical ou horizontal para mover");
        }
    }//GEN-LAST:event_cincoButtonActionPerformed

    private void seisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisButtonActionPerformed
        String seis = seisButton.getText();
        if(seis.equals(' ')){
            JOptionPane.showMessageDialog(null, "Nao eh possivel mover um campo Nulo");
        }else if(tresButton.getText().equals("")){
            tresButton.setText(seis);
            seisButton.setText("");
            tresButton.setBackground(new Color(59,59,59));
            seisButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(noveButton.getText().equals("")){
            noveButton.setText(seis);
            seisButton.setText("");
            noveButton.setBackground(new Color(59,59,59));
            seisButton.setBackground(Color.BLUE);
            countMovimento();
        }
        else if(cincoButton.getText().equals("")){
            cincoButton.setText(seis);
            seisButton.setText("");
            cincoButton.setBackground(new Color(59,59,59));
            seisButton.setBackground(Color.BLUE);
            countMovimento();
        }else{
            JOptionPane.showMessageDialog(null, "Necessário campo livre na vertical ou horizontal para mover");
        }
    }//GEN-LAST:event_seisButtonActionPerformed

    private void seteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteButtonActionPerformed
        String sete = seteButton.getText();
        if(sete.equals(' ')){
            JOptionPane.showMessageDialog(null, "Nao eh possivel mover um campo Nulo");
        }else if(quatroButton.getText().equals("")){
            quatroButton.setText(sete);
            seteButton.setText("");
            quatroButton.setBackground(new Color(59,59,59));
            seteButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(oitoButton.getText().equals("")){
            oitoButton.setText(sete);
            seteButton.setText("");
            oitoButton.setBackground(new Color(59,59,59));
            seteButton.setBackground(Color.BLUE);
            countMovimento();
        }
        else{
            JOptionPane.showMessageDialog(null, "Necessário campo livre na vertical ou horizontal para mover");
        }
    }//GEN-LAST:event_seteButtonActionPerformed

    private void oitoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoButtonActionPerformed
        String oito = oitoButton.getText();
        if(oito.equals(' ')){
            JOptionPane.showMessageDialog(null, "Nao eh possivel mover um campo Nulo");
        }else if(seteButton.getText().equals("")){
            seteButton.setText(oito);
            oitoButton.setText("");
            seteButton.setBackground(new Color(59,59,59));
            oitoButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(noveButton.getText().equals("")){
            noveButton.setText(oito);
            oitoButton.setText("");
            noveButton.setBackground(new Color(59,59,59));
            oitoButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(cincoButton.getText().equals("")){
            cincoButton.setText(oito);
            oitoButton.setText("");
            cincoButton.setBackground(new Color(59,59,59));
            oitoButton.setBackground(Color.BLUE);
            countMovimento();
        }
        else{
            JOptionPane.showMessageDialog(null, "Necessário campo livre na vertical ou horizontal para mover");
        }
    }//GEN-LAST:event_oitoButtonActionPerformed

    private void noveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveButtonActionPerformed
        String nove = noveButton.getText();
        if(nove.equals(' ')){
            JOptionPane.showMessageDialog(null, "Nao eh possivel mover um campo Nulo");
        }else if(seisButton.getText().equals("")){
            seisButton.setText(nove);
            noveButton.setText("");
            seisButton.setBackground(new Color(59,59,59));
            noveButton.setBackground(Color.BLUE);
            countMovimento();
        }else if(oitoButton.getText().equals("")){
            oitoButton.setText(nove);
            noveButton.setText("");
            oitoButton.setBackground(new Color(59,59,59));
            noveButton.setBackground(Color.BLUE);
            countMovimento();
        }
        else{
            JOptionPane.showMessageDialog(null, "Necessário campo livre na vertical ou horizontal para mover");
        }
    }//GEN-LAST:event_noveButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cronometro = new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                tempoLabel.setText(sdf.format(new Date()));
                
               
            }
        });
        
        start();
        for (int i = 1;i<10000000;i++) {}
    
        cronometro.start();
    }//GEN-LAST:event_formWindowOpened

    private void novoJogoMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoJogoMenu
        zerarJogo();
    }//GEN-LAST:event_novoJogoMenu

    private void sairMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenu
        System.exit(0);
    }//GEN-LAST:event_sairMenu

    private void embaralharMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_embaralharMenuActionPerformed
        Random rn = new Random();
        int x = rn.nextInt(8 - 1 +1) + 1;
        b=x;c=x;d=x;e=x;f=x;g=x;h=x;

        funcAle(a3);
    }//GEN-LAST:event_embaralharMenuActionPerformed

    private void finalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarButtonActionPerformed
        
        for (int i = 1;i<10000000;i++) {}
        stop();
        long x = getTime();
        x /= 1000;
        tempLabel.setText(x+" segundos");
        JFrame frame = new JFrame();
        String[] options = new String[2];
        options[0] = new String("Jogar");
        options[1] = new String("Sair");
        int n = JOptionPane.showOptionDialog(frame.getContentPane(),"Deseja continuar jogando, ou sair?","Puzzle Fodastico", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
        if(n == 0){
            jEmbaralha();
            tempLabel.setText("0:00");
            movimentosLabel.setText("Movimentos: 000");
            count1 = 0;
            start();
        }else {
            System.exit(0);
        }
    }//GEN-LAST:event_finalizarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puzzle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JButton cincoButton;
    private javax.swing.JButton doisButton;
    private javax.swing.JMenuItem embaralharMenu;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JButton finalizarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel movimentosLabel;
    private javax.swing.JButton noveButton;
    private javax.swing.JButton oitoButton;
    private javax.swing.JButton quatroButton;
    private javax.swing.JButton seisButton;
    private javax.swing.JButton seteButton;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JLabel tempoLabel;
    private javax.swing.JButton tresButton;
    private javax.swing.JButton umButton;
    // End of variables declaration//GEN-END:variables
}




