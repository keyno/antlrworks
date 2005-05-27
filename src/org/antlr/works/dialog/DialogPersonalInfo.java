package org.antlr.works.dialog;

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.*;
import edu.usfca.xj.appkit.frame.XJDialog;
import org.antlr.works.util.IconManager;
import org.antlr.works.util.Localizable;

import javax.swing.*;
import java.awt.*;

/*

[The "BSD licence"]
Copyright (c) 2004-05 Jean Bovet
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

1. Redistributions of source code must retain the above copyright
notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
notice, this list of conditions and the following disclaimer in the
documentation and/or other materials provided with the distribution.
3. The name of the author may not be used to endorse or promote products
derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

*/

public class DialogPersonalInfo extends XJDialog {

    public DialogPersonalInfo(Container parent) {
        super(parent, true);
        
        initComponents();

        setSize(780, 550);
        iconButton.setIcon(IconManager.shared().getIconApplication());
        setTitle(Localizable.getLocalizedString(Localizable.APP_NAME)+" "+Localizable.getLocalizedString(Localizable.APP_VERSION_LONG));

        setDefaultButton(okButton);
        setOKButton(okButton);
    }

    public void dialogWillCloseOK() {
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        dialogPane = new JPanel();
        contentPane = new JPanel();
        iconButton = new JButton();
        label6 = new JLabel();
        textArea1 = new JTextArea();
        typeCombo = new JComboBox();
        label1 = new JLabel();
        activityCombo = new JComboBox();
        label7 = new JLabel();
        label8 = new JLabel();
        comboBox1 = new JComboBox();
        languageExperienceSpinner = new JSpinner();
        label2 = new JLabel();
        programmingExperienceSpinner = new JSpinner();
        label3 = new JLabel();
        countryField = new JTextField();
        label4 = new JLabel();
        funField = new JTextField();
        label5 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        CellConstraints cc = new CellConstraints();

        //======== this ========
        setTitle("ANTLRWorks early access 1");
        Container contentPane2 = getContentPane();
        contentPane2.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(Borders.DIALOG_BORDER);
            dialogPane.setPreferredSize(new Dimension(750, 500));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPane ========
            {
                contentPane.setLayout(new FormLayout(
                    new ColumnSpec[] {
                        FormFactory.DEFAULT_COLSPEC,
                        FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
                        new ColumnSpec(Sizes.dluX(50)),
                        FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
                        new ColumnSpec("max(min;100dlu):grow"),
                        FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
                        new ColumnSpec("max(default;30dlu)"),
                        FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
                        FormFactory.DEFAULT_COLSPEC
                    },
                    new RowSpec[] {
                        new RowSpec(RowSpec.FILL, Sizes.DEFAULT, FormSpec.NO_GROW),
                        FormFactory.LINE_GAP_ROWSPEC,
                        new RowSpec(Sizes.DLUY5),
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        new RowSpec(Sizes.DLUY5),
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        FormFactory.DEFAULT_ROWSPEC,
                        FormFactory.LINE_GAP_ROWSPEC,
                        new RowSpec(RowSpec.CENTER, Sizes.DEFAULT, FormSpec.DEFAULT_GROW)
                    }));

                //---- iconButton ----
                iconButton.setBorder(null);
                iconButton.setBorderPainted(false);
                iconButton.setContentAreaFilled(false);
                iconButton.setDefaultCapable(false);
                iconButton.setEnabled(true);
                iconButton.setFocusPainted(false);
                iconButton.setFocusable(false);
                iconButton.setIcon(new ImageIcon("/Users/bovet/Dev/Projects/ANTLRWorks/classes/org/antlr/works/icons/app.png"));
                iconButton.setOpaque(false);
                iconButton.setRequestFocusEnabled(false);
                iconButton.setVerifyInputWhenFocusTarget(false);
                iconButton.setVerticalAlignment(SwingConstants.TOP);
                contentPane.add(iconButton, cc.xywh(1, 1, 1, 37));

                //---- label6 ----
                label6.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
                label6.setText("Welcome to ANTLRWorks!");
                contentPane.add(label6, cc.xywh(3, 1, 5, 1));

                //---- textArea1 ----
                textArea1.setBackground(UIManager.getColor("window"));
                textArea1.setEditable(false);
                textArea1.setLineWrap(true);
                textArea1.setOpaque(false);
                textArea1.setText("Please take a few seconds to fill out some information about yourself to help us improve our products.  Thank you!");
                textArea1.setWrapStyleWord(true);
                contentPane.add(textArea1, cc.xywh(3, 5, 5, 1));

                //---- typeCombo ----
                typeCombo.setModel(new DefaultComboBoxModel(new String[] {
                    "Professional programmer",
                    "Researcher",
                    "Graduate student",
                    "Undergraduate student",
                    "Professor"
                }));
                contentPane.add(typeCombo, cc.xywh(3, 11, 3, 1));

                //---- label1 ----
                label1.setHorizontalAlignment(SwingConstants.LEFT);
                label1.setText("Who are you?");
                contentPane.add(label1, cc.xywh(3, 9, 3, 1));

                //---- activityCombo ----
                activityCombo.setModel(new DefaultComboBoxModel(new String[] {
                    "Industry",
                    "Government",
                    "Academe",
                    "Military",
                    "Other"
                }));
                contentPane.add(activityCombo, cc.xywh(3, 15, 3, 1));

                //---- label7 ----
                label7.setHorizontalAlignment(SwingConstants.LEFT);
                label7.setText("What is your sector of activity?");
                contentPane.add(label7, cc.xywh(3, 13, 3, 1));

                //---- label8 ----
                label8.setText("What is your primary development environment?");
                contentPane.add(label8, cc.xywh(3, 17, 3, 1));

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel(new String[] {
                    "Eclipse",
                    "IntelliJ",
                    "Microsoft Visual Studio",
                    "Borland JBuilder",
                    "Xcode",
                    "Text Editor (vi, emacs) - hardcore old-school \"I don't need no stinkin' IDE coder\"",
                    "Other"
                }));
                contentPane.add(comboBox1, cc.xywh(3, 19, 3, 1));

                //---- languageExperienceSpinner ----
                languageExperienceSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
                contentPane.add(languageExperienceSpinner, cc.xy(3, 23));

                //---- label2 ----
                label2.setHorizontalAlignment(SwingConstants.LEFT);
                label2.setText("How many years of experience with language translation/implementation?");
                contentPane.add(label2, cc.xywh(3, 21, 3, 1));

                //---- programmingExperienceSpinner ----
                programmingExperienceSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
                contentPane.add(programmingExperienceSpinner, cc.xy(3, 27));

                //---- label3 ----
                label3.setHorizontalAlignment(SwingConstants.LEFT);
                label3.setText("How many years of programming experience?");
                contentPane.add(label3, cc.xywh(3, 25, 3, 1));
                contentPane.add(countryField, cc.xywh(3, 31, 3, 1));

                //---- label4 ----
                label4.setHorizontalAlignment(SwingConstants.LEFT);
                label4.setText("In which country do you currently live?");
                contentPane.add(label4, cc.xywh(3, 29, 3, 1));
                contentPane.add(funField, cc.xywh(3, 35, 3, 1));

                //---- label5 ----
                label5.setHorizontalAlignment(SwingConstants.LEFT);
                label5.setText("What is your preferred caffeinated beverage?");
                contentPane.add(label5, cc.xywh(3, 33, 3, 1));
            }
            dialogPane.add(contentPane, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(Borders.BUTTON_BAR_GAP_BORDER);
                buttonBar.setLayout(new FormLayout(
                    new ColumnSpec[] {
                        FormFactory.GLUE_COLSPEC,
                        FormFactory.BUTTON_COLSPEC
                    },
                    RowSpec.decodeSpecs("pref")));

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, cc.xy(2, 1));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane2.add(dialogPane, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPane;
    private JButton iconButton;
    private JLabel label6;
    private JTextArea textArea1;
    private JComboBox typeCombo;
    private JLabel label1;
    private JComboBox activityCombo;
    private JLabel label7;
    private JLabel label8;
    private JComboBox comboBox1;
    private JSpinner languageExperienceSpinner;
    private JLabel label2;
    private JSpinner programmingExperienceSpinner;
    private JLabel label3;
    private JTextField countryField;
    private JLabel label4;
    private JTextField funField;
    private JLabel label5;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
