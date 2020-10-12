package com.plug.zjt.component;

import com.intellij.openapi.ui.ComboBox;
import com.intellij.ui.components.JBScrollPane;
import com.intellij.ui.table.JBTable;
import com.michaelbaranov.microba.calendar.DatePicker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AutomatedTestSwing {
    private JLabel r1=new JLabel("ID");
    private JLabel r2=new JLabel("password");
    private JLabel r3=new JLabel("应用名称");
    private JLabel r6=new JLabel("版本");
    private JLabel r4=new JLabel("标志");
    private JLabel r5=new JLabel("服务端口");
    private JLabel r7=new JLabel("打包命令");
    private JLabel r8=new JLabel("运行命令");
    private JTextField jTextField1=new JTextField();
    private JPasswordField jTextField2=new JPasswordField();
    private JTextField jTextField3=new JTextField();
    private DatePicker jTextField6=new DatePicker();
    private JTextField jTextField4=new JTextField();
    private JTextField jTextField5=new JTextField();
    private JTextField jTextField7=new JTextField();
    private JTextField jTextField8=new JTextField();
    JButton jButton=new JButton("获取工作项信息");
    private JLabel cr1=new JLabel("特性分支");
    private ComboBox jComboBox=new ComboBox();
    private JLabel cr2=new JLabel("工作项信息");
    private ComboBox jComboBox1=new ComboBox();

    private JBScrollPane jBScrollPane;
    private JBTable jBTable;
    private JBScrollPane jBScrollPane2;
    private JBTable jBTable2;

    private JButton jButton2=new JButton("调用案例");
    private JLabel sr2=new JLabel("结果");
    private JTextField dispatchResult2=new JTextField();
    private JButton jButton3=new JButton("查询");

    private JButton jButton4=new JButton("打包运行");
    private JButton jButton5=new JButton("开发者门户");

    private JPanel centerOne=new JPanel();
    private JPanel centerTwo = new JPanel();
    private JPanel centerThree=new JPanel();
    private JPanel centerFour=new JPanel();

    private JPanel north=new JPanel();
    private JPanel center=new JPanel();
    private JPanel south=new JPanel();

    public JComponent initNorth() {
        north.setLayout(new GridBagLayout());

        GridBagConstraints r1Constraints=new GridBagConstraints();
        r1Constraints.gridx=0;
        r1Constraints.gridy=0;
        r1Constraints.gridwidth=1;
        r1Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(r1,r1Constraints);

        GridBagConstraints field1Constraints=new GridBagConstraints();
        field1Constraints.gridx=1;
        field1Constraints.gridy=0;
        field1Constraints.gridwidth=1;
        field1Constraints.ipadx=160;
        field1Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(jTextField1,field1Constraints);

        GridBagConstraints r2Constraints=new GridBagConstraints();
        r2Constraints.gridx=2;
        r2Constraints.gridy=0;
        r2Constraints.gridwidth=1;
        r2Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(r2,r2Constraints);

        GridBagConstraints field2Constraints=new GridBagConstraints();
        field2Constraints.gridx=3;
        field2Constraints.gridy=0;
        field2Constraints.gridwidth=1;
        field2Constraints.ipadx=160;
        north.add(jTextField2,field2Constraints);

        GridBagConstraints r3Constraints=new GridBagConstraints();
        r3Constraints.gridx=0;
        r3Constraints.gridy=1;
        r3Constraints.gridwidth=1;
        r3Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(r3,r3Constraints);

        GridBagConstraints field3Constraints=new GridBagConstraints();
        field3Constraints.gridx=1;
        field3Constraints.gridy=1;
        field3Constraints.gridwidth=1;
        field3Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(jTextField3,field3Constraints);

        GridBagConstraints r6Constraints=new GridBagConstraints();
        r6Constraints.gridx=2;
        r6Constraints.gridy=1;
        r6Constraints.gridwidth=1;
        north.add(r6,r6Constraints);

        GridBagConstraints field6Constraints=new GridBagConstraints();
        field6Constraints.gridx=3;
        field6Constraints.gridy=1;
        field6Constraints.gridwidth=1;
        field6Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(jTextField6,field6Constraints);

        GridBagConstraints r4Constraints=new GridBagConstraints();
        r4Constraints.gridx=0;
        r4Constraints.gridy=2;
        r4Constraints.gridwidth=1;
        r4Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(r4,r4Constraints);

        GridBagConstraints field4Constraints=new GridBagConstraints();
        field4Constraints.gridx=1;
        field4Constraints.gridy=2;
        field4Constraints.gridwidth=1;
        field4Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(jTextField4,field4Constraints);

        GridBagConstraints r5Constraints=new GridBagConstraints();
        r5Constraints.gridx=2;
        r5Constraints.gridy=2;
        r5Constraints.gridwidth=1;
        r5Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(r5,r5Constraints);

        GridBagConstraints field5Constraints=new GridBagConstraints();
        field5Constraints.gridx=3;
        field5Constraints.gridy=2;
        field5Constraints.gridwidth=1;
        field5Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(jTextField5,field5Constraints);

        GridBagConstraints r7Constraints=new GridBagConstraints();
        r7Constraints.gridx=0;
        r7Constraints.gridy=3;
        r7Constraints.gridwidth=1;
        r7Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(r7,r7Constraints);

        GridBagConstraints field7Constraints=new GridBagConstraints();
        field7Constraints.gridx=1;
        field7Constraints.gridy=3;
        field7Constraints.gridwidth=1;
        field7Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(jTextField7,field7Constraints);

        GridBagConstraints r8Constraints=new GridBagConstraints();
        r8Constraints.gridx=2;
        r8Constraints.gridy=3;
        r8Constraints.gridwidth=1;
        r8Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(r8,r8Constraints);

        GridBagConstraints field8Constraints=new GridBagConstraints();
        field8Constraints.gridx=3;
        field8Constraints.gridy=3;
        field8Constraints.gridwidth=1;
        field8Constraints.fill=GridBagConstraints.HORIZONTAL;
        north.add(jTextField8,field8Constraints);

        GridBagConstraints buttonConstraints=new GridBagConstraints();
        buttonConstraints.gridx=3;
        buttonConstraints.gridy=4;
        buttonConstraints.gridwidth=1;
        buttonConstraints.fill=GridBagConstraints.HORIZONTAL;

        north.add(jButton,buttonConstraints);

        return north;
    }

    public JComponent initCenter() {
        center.setLayout(new GridBagLayout());
        centerOne.setLayout(new GridBagLayout());
        centerTwo.setLayout(new GridBagLayout());
        centerThree.setLayout(new GridBagLayout());
        centerFour.setLayout(new GridBagLayout());

        GridBagConstraints cr1Constraints=new GridBagConstraints();
        cr1Constraints.gridx=0;
        cr1Constraints.gridy=0;
        centerOne.add(cr1,cr1Constraints);

        GridBagConstraints jcbConstraints=new GridBagConstraints();
        jcbConstraints.gridx=1;
        jcbConstraints.gridy=0;
        jcbConstraints.ipadx=130;
        centerOne.add(jComboBox,jcbConstraints);

        GridBagConstraints cr2Constraints=new GridBagConstraints();
        cr2Constraints.gridx=2;
        cr2Constraints.gridy=0;
        centerOne.add(cr2,cr2Constraints);

        GridBagConstraints jcb2Constraints=new GridBagConstraints();
        jcb2Constraints.gridx=3;
        jcb2Constraints.gridy=0;
        jcb2Constraints.ipadx=130;
        centerOne.add(jComboBox1,jcb2Constraints);

        String[] columns={"案例ID","分支ID","方法名","类名","项目路径","认证号"};
        DefaultTableModel defaultTableModel=new DefaultTableModel();
        defaultTableModel.setColumnIdentifiers(columns);
        jBTable=new JBTable(defaultTableModel);
        jBScrollPane=new JBScrollPane(jBTable);

        GridBagConstraints jbspConstraints=new GridBagConstraints();
        jbspConstraints.gridx=0;
        jbspConstraints.gridy=0;
        jbspConstraints.ipadx=600;
        jbspConstraints.ipady=150;
        centerTwo.add(jBScrollPane,jbspConstraints);

        GridBagConstraints jb2Constraints=new GridBagConstraints();
        jb2Constraints.gridx=0;
        jb2Constraints.gridy=0;
        centerThree.add(jButton2,jb2Constraints);

        GridBagConstraints sr2Constraints = new GridBagConstraints();
        sr2Constraints.gridx=1;
        sr2Constraints.gridy=0;

        centerThree.add(sr2,sr2Constraints);

        GridBagConstraints dr2Constraints=new GridBagConstraints();
        dr2Constraints.gridx=2;
        dr2Constraints.gridy=0;
        dr2Constraints.ipadx=130;
        dr2Constraints.fill=GridBagConstraints.HORIZONTAL;
        centerThree.add(dispatchResult2,dr2Constraints);

        GridBagConstraints jb3Constraints=new GridBagConstraints();
        jb3Constraints.gridx=3;
        jb3Constraints.gridy=0;
        centerThree.add(jButton3,jb3Constraints);

        String[] columns2={"案例ID","应用ID","应用名称","调度名称","测试脚本类名","测试脚本方法名","调度开始时间","调度人","JenkinsURL","案例测试结果"};
        DefaultTableModel defaultTableModel2=new DefaultTableModel();
        defaultTableModel2.setColumnIdentifiers(columns2);
        jBTable2=new JBTable(defaultTableModel);
        jBScrollPane2=new JBScrollPane(jBTable2);
        GridBagConstraints jbsp2Constraints=new GridBagConstraints();
        jbsp2Constraints.gridx=0;
        jbsp2Constraints.gridy=0;
        jbsp2Constraints.ipadx=600;
        jbsp2Constraints.ipady=150;
        centerFour.add(jBScrollPane2,jbsp2Constraints);

        GridBagConstraints oneConstraints=new GridBagConstraints();
        oneConstraints.gridx=0;
        oneConstraints.gridy=0;
        center.add(centerOne,oneConstraints);
        GridBagConstraints twoConstraints=new GridBagConstraints();
        twoConstraints.gridx=0;
        twoConstraints.gridy=1;
        center.add(centerTwo,twoConstraints);
        GridBagConstraints threeConstraints=new GridBagConstraints();
        threeConstraints.gridx=0;
        threeConstraints.gridy=2;
        center.add(centerThree,threeConstraints);
        GridBagConstraints fourConstraints=new GridBagConstraints();
        fourConstraints.gridx=0;
        fourConstraints.gridy=3;
        center.add(centerFour,fourConstraints);
        return center;
    }

    public JComponent initSouth() {
        south.setLayout(new GridBagLayout());
        south.add(jButton4);
        south.add(jButton5);
        return south;
    }
}
