package com.yauhenii.main;

import com.yauhenii.main.repository.ExcelSheetRepository;
import com.yauhenii.main.service.ExcelSheetService;
import java.awt.EventQueue;
import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

    @Autowired
    public static ExcelSheetService excelSheetService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(
            MainApplication.class)
            .headless(false)
            .run(args);

        EventQueue.invokeLater(() -> {
            Test test = context.getBean(Test.class);
//            test.printAll();
//            test.saveExcel(new File("/Users/zhenyamordan/Desktop/testfile.xls"));
//            test.printByFile("testfile.xls");
//            test.deleteSheet("testfile.xls");
//            File file = test.writeFile();
//            System.out.println(file.getName());
//            if(test.getFileNames()!=null){
//                System.out.println();
//            } else{
//                System.out.println("Lol");
//            }
        });
    }

}
