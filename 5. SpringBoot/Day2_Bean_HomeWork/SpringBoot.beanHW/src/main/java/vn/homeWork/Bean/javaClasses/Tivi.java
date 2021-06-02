package vn.homeWork.Bean.javaClasses;

import org.springframework.beans.factory.annotation.Autowired;

public class Tivi {

    private Panel panel;
    private OS operationSys;

    public Tivi(Panel panel, OS operationSys) {
        this.panel = panel;
        this.operationSys = operationSys;
    }

    @Override
    public String toString() {
        return "Tivi{" +
                "panel=" + panel +
                ", operationSys=" + operationSys +
                '}';
    }

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }

    public OS getOperationSys() {
        return operationSys;
    }

    public void setOperationSys(OS operationSys) {
        this.operationSys = operationSys;
    }
}
