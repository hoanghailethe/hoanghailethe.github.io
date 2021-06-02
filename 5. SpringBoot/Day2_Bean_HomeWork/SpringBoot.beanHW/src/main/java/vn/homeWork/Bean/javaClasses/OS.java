package vn.homeWork.Bean.javaClasses;

import org.springframework.stereotype.Component;

@Component
public class OS {
    private String type;

    @Override
    public String toString() {
        return "OS type " + type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
