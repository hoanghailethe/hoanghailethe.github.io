package vn.homeWork.Bean.ConfigBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vn.homeWork.Bean.javaClasses.OS;
import vn.homeWork.Bean.javaClasses.Panel;
import vn.homeWork.Bean.javaClasses.Tivi;

@Configuration
public class ConfigTivi {

    @Value("panel_type")
    private String panelType;

    @Value("${operationSys}")
    private String osType;

    @Autowired
    private Panel panel;
    @Autowired
    private OS operationSys;

    @Bean
    public Tivi tivi() {
        Tivi a = new Tivi(panel, operationSys);
        panel.setType(panelType);
        operationSys.setType(osType);
        return a;
    }
}
