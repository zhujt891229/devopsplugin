package com.plug.zjt.action;

import b.d.A;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vcs.CommitMessageI;
import com.plug.zjt.component.AutomatedTestDialog;
import org.jetbrains.annotations.NotNull;

public class MyPlug extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        // TODO: insert action logic here
//        Messages.showMessageDialog("Hello World !", "Information", Messages.getInformationIcon());

//        Project project = event.getData(PlatformDataKeys.PROJECT);
//        Messages.showInputDialog(
//                project,
//                "What is your name?",
//                "Input your name",
//                Messages.getQuestionIcon());

        AutomatedTestDialog automatedTestDialog=new AutomatedTestDialog(event);
        automatedTestDialog.setResizable(true);
        automatedTestDialog.show();
    }
}
