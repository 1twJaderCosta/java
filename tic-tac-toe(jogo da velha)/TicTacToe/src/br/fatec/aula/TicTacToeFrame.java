/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.aula;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author kill
 */
public class TicTacToeFrame extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToeFrame
     */
    public TicTacToeFrame() {
        
        initComponents();
    }
    double y = 0;
    Random rand = new Random();
    String h = "x";
    int click = 0;
    

    public void xoFunc(double y, String but) {
        String i;
        if (y % 2 == 0 && !jRadio.isSelected()) {
            i = "x";
        } else {
            i = "O";
        }
        switch (but) {
            case "um":
                umButton.setText(i);
                break;
            case "dois":
                doisButton.setText(i);
                break;
            case "tres":
                tresButton.setText(i);
                break;
            case "quatro":
                quatroButton.setText(i);
                break;
            case "cinco":
                cincoButton.setText(i);
                break;
            case "seis":
                seisButton.setText(i);
                break;
            case "sete":
                seteButton.setText(i);
                break;
            case "oito":
                oitoButton.setText(i);
                break;
            case "nove":
                noveButton.setText(i);
                break;
            default:
                break;
        }

    }

    private void blockTodos() {
        umButton.setText("");
        umButton.setEnabled(true);
        doisButton.setText("");
        doisButton.setEnabled(true);
        tresButton.setText("");
        tresButton.setEnabled(true);
        quatroButton.setText("");
        quatroButton.setEnabled(true);
        cincoButton.setText("");
        cincoButton.setEnabled(true);
        seisButton.setText("");
        seisButton.setEnabled(true);
        seteButton.setText("");
        seteButton.setEnabled(true);
        oitoButton.setText("");
        oitoButton.setEnabled(true);
        noveButton.setText("");
        noveButton.setEnabled(true);
        jogardor1Text.setText("");
        jogardor2Text.setText("");
        y = 0;
        umButton.setForeground(Color.gray);
        doisButton.setForeground(Color.gray);
        tresButton.setForeground(Color.gray);
        quatroButton.setForeground(Color.gray);
        oitoButton.setForeground(Color.gray);
        cincoButton.setForeground(Color.gray);
        seisButton.setForeground(Color.gray);
        seteButton.setForeground(Color.gray);
        noveButton.setForeground(Color.gray);
    }

    public void blockTodos1() {
        umButton.setEnabled(false);
        doisButton.setEnabled(false);
        tresButton.setEnabled(false);
        quatroButton.setEnabled(false);
        cincoButton.setEnabled(false);
        seisButton.setEnabled(false);
        seteButton.setEnabled(false);
        oitoButton.setEnabled(false);
        noveButton.setEnabled(false);
    }
    
    public String getBot(int num){
        String compara = "";
        switch (num) {
                case 1:
                    compara = umButton.getText();
                    break;
                case 2:
                    compara = doisButton.getText();
                    break;
                case 3:
                    compara = tresButton.getText();
                    break;
                case 4:
                    compara = quatroButton.getText();
                    break;
                case 5:
                   compara = cincoButton.getText();
                    break;
                case 6:
                   compara = seisButton.getText();
                    break;
                case 7:
                   compara = seteButton.getText();
                    break;
                case 8:
                   compara = oitoButton.getText();
                    break;
                case 9:
                  compara =  noveButton.getText();
                    break;
                default:
                    JOptionPane.showOptionDialog(null, " ERRO RANDOM.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    break;
            }
        return compara;
    }
    
    public void setBot(int num){
        switch (num) {
                case 1:
                    umButton.setText(h);
                    umButton.setEnabled(false); 
                    break;
                case 2:
                    doisButton.setText(h);
                    doisButton.setEnabled(false); 
                    break;
                case 3:
                    tresButton.setText(h);
                    tresButton.setEnabled(false); 
                    break;
                case 4:
                    quatroButton.setText(h);
                    quatroButton.setEnabled(false); 
                    break;
                case 5:
                   cincoButton.setText(h);
                   cincoButton.setEnabled(false); 
                    break;
                case 6:
                   seisButton.setText(h);
                   seisButton.setEnabled(false); 
                    break;
                case 7:
                   seteButton.setText(h);
                   seteButton.setEnabled(false); 
                    break;
                case 8:
                   oitoButton.setText(h);
                   oitoButton.setEnabled(false); 
                    break;
                case 9:
                  noveButton.setText(h);
                  noveButton.setEnabled(false); 
                    break;
                default:
                    JOptionPane.showOptionDialog(null, " ERRO RANDOM.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    break;
            }
    }
    
    public void bot1(){
        String um = umButton.getText();
        String dois = doisButton.getText();
        String tres = tresButton.getText();
        String quatro = quatroButton.getText();
        String cinco = cincoButton.getText();
        String seis = seisButton.getText();
        String sete = seteButton.getText();
        String oito = oitoButton.getText();
        String nove = noveButton.getText();
        int  n = rand.nextInt(9) + 1;
        String rec = getBot(n);
            
            
            if(um.equals("") && dois.equals("") && tres.equals("") && quatro.equals("") && cinco.equals("") && seis.equals("") && sete.equals("") && oito.equals("") && nove.equals("") ){             
                 h = "x";
                 setBot(n);
                 checkResult();
            }
            else if(!um.equals("") && !dois.equals("") && !tres.equals("") && !quatro.equals("") && !cinco.equals("") && !seis.equals("") && !sete.equals("") && !oito.equals("") && !nove.equals("") ){
                botPlay.setEnabled(false); 
            }
            else if(rec.equals("")){
                setBot(n);
                checkResult();
            }
            else {
               bot1(); 
            }
            
    }

    public void checkResult() {
        String um = umButton.getText();
        String dois = doisButton.getText();
        String tres = tresButton.getText();
        String quatro = quatroButton.getText();
        String cinco = cincoButton.getText();
        String seis = seisButton.getText();
        String sete = seteButton.getText();
        String oito = oitoButton.getText();
        String nove = noveButton.getText();

        if (um.equals("O") && cinco.equals("O") && nove.equals("O")) {
            String jogador = jogardor1Text.getText();
            umButton.setForeground(Color.green);
            cincoButton.setForeground(Color.green);
            noveButton.setForeground(Color.green);
            if (jogador.equals("")) {
                jogador = "Jogador 1";
            }
            //int input = JOptionPane.showMessageDialog(null, jogador+" Venceu.");
            int input = JOptionPane.showOptionDialog(null, jogador + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();

            }
        } else if (um.equals("x") && cinco.equals("x") && nove.equals("x")) {
            String jogador2 = jogardor2Text.getText();
            umButton.setForeground(Color.green);
            cincoButton.setForeground(Color.green);
            noveButton.setForeground(Color.green);
            if (jogador2.equals("")) {
                jogador2 = "Jogador 2";
            }
            int input = JOptionPane.showOptionDialog(null, jogador2 + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (tres.equals("O") && cinco.equals("O") && sete.equals("O")) {
            tresButton.setForeground(Color.green);
            cincoButton.setForeground(Color.green);
            seteButton.setForeground(Color.green);
            String jogador = jogardor1Text.getText();
            if (jogador.equals("")) {
                jogador = "Jogador 1";
            }
            int input = JOptionPane.showOptionDialog(null, jogador + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (tres.equals("x") && cinco.equals("x") && sete.equals("x")) {
            String jogador2 = jogardor2Text.getText();
            tresButton.setForeground(Color.green);
            cincoButton.setForeground(Color.green);
            seteButton.setForeground(Color.green);
            if (jogador2.equals("")) {
                jogador2 = "Jogador 2";
            }
            int input = JOptionPane.showOptionDialog(null, jogador2 + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (um.equals("O") && dois.equals("O") && tres.equals("O")) {
            tresButton.setForeground(Color.green);
            umButton.setForeground(Color.green);
            doisButton.setForeground(Color.green);
            String jogador = jogardor1Text.getText();
            if (jogador.equals("")) {
                jogador = "Jogador 1";
            }
            int input = JOptionPane.showOptionDialog(null, jogador + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (um.equals("x") && dois.equals("x") && tres.equals("x")) {
            String jogador2 = jogardor2Text.getText();
            tresButton.setForeground(Color.green);
            umButton.setForeground(Color.green);
            doisButton.setForeground(Color.green);
            if (jogador2.equals("")) {
                jogador2 = "Jogador 2";
            }
            int input = JOptionPane.showOptionDialog(null, jogador2 + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (tres.equals("O") && seis.equals("O") && nove.equals("O")) {
            tresButton.setForeground(Color.green);
            seisButton.setForeground(Color.green);
            noveButton.setForeground(Color.green);
            String jogador = jogardor1Text.getText();
            if (jogador.equals("")) {
                jogador = "Jogador 1";
            }
            int input = JOptionPane.showOptionDialog(null, jogador + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (tres.equals("x") && seis.equals("x") && nove.equals("x")) {
            String jogador2 = jogardor2Text.getText();
            tresButton.setForeground(Color.green);
            seisButton.setForeground(Color.green);
            noveButton.setForeground(Color.green);
            if (jogador2.equals("")) {
                jogador2 = "Jogador 2";
            }
            int input = JOptionPane.showOptionDialog(null, jogador2 + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (nove.equals("O") && oito.equals("O") && sete.equals("O")) {
            String jogador = jogardor1Text.getText();
            noveButton.setForeground(Color.green);
            oitoButton.setForeground(Color.green);
            seteButton.setForeground(Color.green);
            if (jogador.equals("")) {
                jogador = "Jogador 1";
            }
            int input = JOptionPane.showOptionDialog(null, jogador + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (nove.equals("x") && oito.equals("x") && sete.equals("x")) {
            String jogador2 = jogardor2Text.getText();
            noveButton.setForeground(Color.green);
            oitoButton.setForeground(Color.green);
            seteButton.setForeground(Color.green);
            if (jogador2.equals("")) {
                jogador2 = "Jogador 2";
            }
            int input = JOptionPane.showOptionDialog(null, jogador2 + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (sete.equals("O") && quatro.equals("O") && um.equals("O")) {
            String jogador = jogardor1Text.getText();
            umButton.setForeground(Color.green);
            quatroButton.setForeground(Color.green);
            seteButton.setForeground(Color.green);
            if (jogador.equals("")) {
                jogador = "Jogador 1";
            }
            int input = JOptionPane.showOptionDialog(null, jogador + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (sete.equals("x") && quatro.equals("x") && um.equals("x")) {
            String jogador2 = jogardor2Text.getText();
            umButton.setForeground(Color.green);
            quatroButton.setForeground(Color.green);
            seteButton.setForeground(Color.green);
            if (jogador2.equals("")) {
                jogador2 = "Jogador 2";
            }
            int input = JOptionPane.showOptionDialog(null, jogador2 + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (quatro.equals("O") && cinco.equals("O") && seis.equals("O")) {
            String jogador = jogardor1Text.getText();
            seisButton.setForeground(Color.green);
            quatroButton.setForeground(Color.green);
            cincoButton.setForeground(Color.green);
            if (jogador.equals("")) {
                jogador = "Jogador 1";
            }
            int input = JOptionPane.showOptionDialog(null, jogador + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (quatro.equals("x") && cinco.equals("x") && seis.equals("x")) {
            String jogador2 = jogardor2Text.getText();
            seisButton.setForeground(Color.green);
            quatroButton.setForeground(Color.green);
            cincoButton.setForeground(Color.green);
            if (jogador2.equals("")) {
                jogador2 = "Jogador 2";
            }
            int input = JOptionPane.showOptionDialog(null, jogador2 + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (dois.equals("O") && cinco.equals("O") && oito.equals("O")) {
            String jogador = jogardor1Text.getText();
            doisButton.setForeground(Color.green);
            oitoButton.setForeground(Color.green);
            cincoButton.setForeground(Color.green);
            if (jogador.equals("")) {
                jogador = "Jogador 1";
            }
            int input = JOptionPane.showOptionDialog(null, jogador + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (dois.equals("x") && cinco.equals("x") && oito.equals("x")) {
            String jogador2 = jogardor2Text.getText();
            doisButton.setForeground(Color.green);
            oitoButton.setForeground(Color.green);
            cincoButton.setForeground(Color.green);
            if (jogador2.equals("")) {
                jogador2 = "Jogador 2";
            }
            int input = JOptionPane.showOptionDialog(null, jogador2 + " Venceu.", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if (input == JOptionPane.OK_OPTION) {
                blockTodos();
            }
        } else if (!(um.equals("")) && !(dois.equals("")) && !(tres.equals("")) && !(quatro.equals("")) && !(cinco.equals("")) && !(seis.equals("")) && !(sete.equals("")) && !(oito.equals("")) && !(nove.equals(""))) {
            JOptionPane.showMessageDialog(null, " Empatou.");
        }

    }
    
    public String verificaVez(int i){
        if(!jRadio.isSelected()){
        return "verdadeiro";
        }else if(click == 1 && i == 1){
           return "false"; 
        }else if(click == 2 && i == 2){
           return "false"; 
        }else{
            return "verdadeiro";
        }
    }
    
    public void nVez(){
        JOptionPane.showOptionDialog(null, " Não é sua vez de jogar ! ", "TicTacToe byJader", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jogardor1Text = new javax.swing.JTextField();
        jogardor2Text = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tresButton = new javax.swing.JButton();
        doisButton = new javax.swing.JButton();
        cincoButton = new javax.swing.JButton();
        oitoButton = new javax.swing.JButton();
        seisButton = new javax.swing.JButton();
        umButton = new javax.swing.JButton();
        noveButton = new javax.swing.JButton();
        seteButton = new javax.swing.JButton();
        quatroButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jRadio = new javax.swing.JRadioButton();
        botPlay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToeTitle");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        jLabel2.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Jogador 1");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("X");

        jogardor2Text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Jogador 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jogardor1Text)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jogardor2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jogardor2Text, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jogardor1Text))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tresButton.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        tresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresButtonActionPerformed(evt);
            }
        });

        doisButton.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        doisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisButtonActionPerformed(evt);
            }
        });

        cincoButton.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        cincoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoButtonActionPerformed(evt);
            }
        });

        oitoButton.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        oitoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoButtonActionPerformed(evt);
            }
        });

        seisButton.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        seisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisButtonActionPerformed(evt);
            }
        });

        umButton.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        umButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umButtonActionPerformed(evt);
            }
        });

        noveButton.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        noveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveButtonActionPerformed(evt);
            }
        });

        seteButton.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        seteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteButtonActionPerformed(evt);
            }
        });

        quatroButton.setFont(new java.awt.Font("Noto Sans CJK KR Bold", 0, 48)); // NOI18N
        quatroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(68, 68, 68));
        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Reiniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadio.setText("Ativar BOT");
        jRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioActionPerformed(evt);
            }
        });

        botPlay.setText("BOT JOGAR");
        botPlay.setEnabled(false);
        botPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(umButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quatroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cincoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(oitoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(doisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jRadio)
                .addGap(18, 18, 18)
                .addComponent(botPlay)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadio)
                            .addComponent(botPlay))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(umButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cincoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quatroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(seisButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oitoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        //botPlay.setEnabled(false);
    private void umButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umButtonActionPerformed

        if( verificaVez(1).equals("verdadeiro") ){
          
        umButton.setEnabled(false);
        y += 1;
        xoFunc(y, "um");
        checkResult();
        click = 1;
        }else {
            nVez();
        }

    }//GEN-LAST:event_umButtonActionPerformed

    private void doisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisButtonActionPerformed
       if( verificaVez(1).equals("verdadeiro") ){
           
        doisButton.setEnabled(false);
        y += 1;
        xoFunc(y, "dois");
        checkResult();
        click = 1;
        
        }else {
            nVez();
        }
    }//GEN-LAST:event_doisButtonActionPerformed

    private void tresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresButtonActionPerformed
        if( verificaVez(1).equals("verdadeiro") ){
        
        tresButton.setEnabled(false);
        y += 1;
        xoFunc(y, "tres");
        checkResult();
        click = 1;
        
        }else {
            nVez();
        }
    }//GEN-LAST:event_tresButtonActionPerformed

    private void quatroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroButtonActionPerformed
       
        if( verificaVez(1).equals("verdadeiro") ){
          
        quatroButton.setEnabled(false);
        y += 1;
        xoFunc(y, "quatro");
        checkResult();
        click = 1;
        
        }else {
            nVez();
        }
        
        
    }//GEN-LAST:event_quatroButtonActionPerformed

    private void cincoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoButtonActionPerformed
        if( verificaVez(1).equals("verdadeiro") ){
         
        cincoButton.setEnabled(false);
        y += 1;
        xoFunc(y, "cinco");
        checkResult();
        click = 1;
        
        }else {
            nVez();
        }
    }//GEN-LAST:event_cincoButtonActionPerformed

    private void seisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisButtonActionPerformed
        if( verificaVez(1).equals("verdadeiro") ){
        
        seisButton.setEnabled(false);
        y += 1;
        xoFunc(y, "seis");
        checkResult();
        click = 1;
        
        }else {
            nVez();
        }
    }//GEN-LAST:event_seisButtonActionPerformed

    private void seteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteButtonActionPerformed
        if( verificaVez(1).equals("verdadeiro") ){
        
        seteButton.setEnabled(false);
        y += 1;
        xoFunc(y, "sete");
        checkResult();
        click = 1;
        
        }else {
            nVez();
        }
    }//GEN-LAST:event_seteButtonActionPerformed

    private void oitoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoButtonActionPerformed
        if( verificaVez(1).equals("verdadeiro") ){
        
        oitoButton.setEnabled(false);
        y += 1;
        xoFunc(y, "oito");
        checkResult();
        click = 1;
        
        }else {
            nVez();
        }
    }//GEN-LAST:event_oitoButtonActionPerformed

    private void noveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveButtonActionPerformed
        if( verificaVez(1).equals("verdadeiro") ){
        
        noveButton.setEnabled(false);
        y += 1;
        xoFunc(y, "nove");
        checkResult();
        click = 1;
        
        }else {
            nVez();
        }
    }//GEN-LAST:event_noveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        umButton.setText("");
        umButton.setEnabled(true);
        doisButton.setText("");
        doisButton.setEnabled(true);
        tresButton.setText("");
        tresButton.setEnabled(true);
        quatroButton.setText("");
        quatroButton.setEnabled(true);
        cincoButton.setText("");
        cincoButton.setEnabled(true);
        seisButton.setText("");
        seisButton.setEnabled(true);
        seteButton.setText("");
        seteButton.setEnabled(true);
        oitoButton.setText("");
        oitoButton.setEnabled(true);
        noveButton.setText("");
        noveButton.setEnabled(true);
        jogardor1Text.setText("");
        jogardor2Text.setText("");
        y = 0;
        umButton.setForeground(Color.gray);
        doisButton.setForeground(Color.gray);
        tresButton.setForeground(Color.gray);
        quatroButton.setForeground(Color.gray);
        oitoButton.setForeground(Color.gray);
        cincoButton.setForeground(Color.gray);
        seisButton.setForeground(Color.gray);
        seteButton.setForeground(Color.gray);
        noveButton.setForeground(Color.gray);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioActionPerformed
        if(jRadio.isSelected()){
            botPlay.setEnabled(true);
        }else{
            botPlay.setEnabled(false);  
        }
    }//GEN-LAST:event_jRadioActionPerformed

    private void botPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPlayActionPerformed
        if( verificaVez(2).equals("verdadeiro") ){
            bot1();
           click = 2;      
        }else {
            nVez();
        }
        
     
     
    }//GEN-LAST:event_botPlayActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botPlay;
    private javax.swing.JButton cincoButton;
    private javax.swing.JButton doisButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadio;
    private javax.swing.JTextField jogardor1Text;
    private javax.swing.JTextField jogardor2Text;
    private javax.swing.JButton noveButton;
    private javax.swing.JButton oitoButton;
    private javax.swing.JButton quatroButton;
    private javax.swing.JButton seisButton;
    private javax.swing.JButton seteButton;
    private javax.swing.JButton tresButton;
    private javax.swing.JButton umButton;
    // End of variables declaration//GEN-END:variables
}
