package src.core;

import java.util.TimerTask;

public class Worker extends TimerTask {
    private ViewContainer parent;

    public Worker(ViewContainer parent) {
        this.parent = parent;
    }

    @Override
    public void run() {
        long now = System.currentTimeMillis() / 1000L;
        parent.getCurrentPanel().onTick(now);
    }
    
}