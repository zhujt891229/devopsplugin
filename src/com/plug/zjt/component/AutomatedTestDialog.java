package com.plug.zjt.component;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AutomatedTestDialog extends DialogWrapper {

    private AnActionEvent anActionEvent;
    private AutomatedTestSwing automatedTestSwing=new AutomatedTestSwing();

    public AutomatedTestDialog(AnActionEvent anActionEvent){
        super(true);
        this.anActionEvent=anActionEvent;
        setTitle("用例自测");
        init();
    }

    @Override
    protected  JComponent createNorthPanel(){
        return automatedTestSwing.initNorth();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return automatedTestSwing.initCenter();
    }

    @Override
    protected  JComponent createSouthPanel(){
        return automatedTestSwing.initSouth();
    }
}
