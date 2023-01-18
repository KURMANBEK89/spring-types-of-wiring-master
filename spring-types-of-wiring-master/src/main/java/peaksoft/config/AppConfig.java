package peaksoft.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.KoscheiTheDeathless;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {
//    @Bean
//    public Ocean1 getOcean(){
//        return new Ocean1(getIsland(new Wood3(new Rabbit4(new Duck5(new Egg6(new Needle7(new Deth8())))))));
//    }
}