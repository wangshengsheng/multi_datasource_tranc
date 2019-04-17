package com.xidian.multi_datasource_tranc;

import com.xidian.multi_datasource_tranc.config.DBConfig1;
import com.xidian.multi_datasource_tranc.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value={DBConfig1.class, DBConfig2.class})
public class MultiDatasourceTrancApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiDatasourceTrancApplication.class, args);
    }

}
