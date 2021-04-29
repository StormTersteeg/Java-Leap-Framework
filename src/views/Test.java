package src.views;
import src.core.Container;
import src.core.View;
import src.core.Audio;
import src.components.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends View implements ActionListener {
    private CButton cbTest;
    private long sinceLastLog = System.currentTimeMillis() / 1000L;

    public Test(Container parent, String panel_name) {
        super(parent, panel_name);
        setLayout(new GridBagLayout());
        setVisible(false);

        cbTest = new CButton(this, "Go back", Color.black, Color.white);

        add(cbTest);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Audio.play("click.wav");
        Object source = e.getSource();

        if (source == cbTest) {changeFocus("Index");}
    }

    @Override
    public void onFocus() {
        System.out.println("Showing the Test.java view");
    }

    @Override
    public void onShadow() {
        System.out.println("Left the Test.java view");
    }

    @Override
    public void onTick(long now) {
        if (now > (sinceLastLog + 4)) {
            sinceLastLog = now;
            System.out.println("4 Seconds have passed");
        }
    }

}
