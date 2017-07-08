package spring.txQ2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executer {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-tx-config.xml");
        AccountServices accountServices =applicationContext.getBean(AccountServices.class);
        UserAccount userAccount1 = new UserAccount("Bhavin",25000.56);
        UserAccount userAccount2 = new UserAccount("Snigdha",27540.80);
        accountServices.addEntry(userAccount1);
        accountServices.addEntry(userAccount2);
        accountServices.update("Snigdha",45000);
        UserAccount userAccount =accountServices.getData("Snigdha");
        System.out.println(userAccount);
        accountServices.delete("Bhavin");
    }
}
