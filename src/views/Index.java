package src.views;
import src.core.Container;
import src.core.View;
import src.core.Audio;
import src.components.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends View implements ActionListener {
    private CButton cbTest;

    public Index(Container container, String name) {
        super(container, name);
        setLayout(new GridBagLayout());
        setVisible(false);

        cbTest = new CButton(this, "Go to test", Color.black, Color.white);

        add(cbTest);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Audio.play("click.wav");
        Object source = e.getSource();

        if (source == cbTest) {changeFocus("Test");}
    }

    @Override
    public void onFocus() {}

    @Override
    public void onShadow() {}

    @Override
    public void onTick(long now) {}

}
