package com.codegym.repository;

import com.codegym.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepositoryImpl implements IEmailRepository{

    @Autowired
    IEmailRepository emailRepository;
    static List<Email> emailList = new ArrayList<>();

    static {
        emailList.add(new Email(1,"Chinese",25,true,"Thor"  ));
        emailList.add(new Email(2,"English",50,false,"Lam"  ));
        emailList.add(new Email(3,"VietNamese",100,true,"Linh"  ));
        emailList.add(new Email(4,"Japanese",75,false,"Ngoc"  ));
    }

    public static final List<String> languageList = new ArrayList<>();

    static {
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
    }

    public static final List<Integer> pageSizeList = new ArrayList<>();

    static {
        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(15);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);
    }

    @Override
    public List<Email> findAll() {
        return emailList;
    }

    @Override
    public void save(Integer id, Email email) {
        for (Email value : emailList) {
            if (id.equals(value.getId())) {
                value.setLanguage(email.getLanguage());
                value.setPageSize(email.getPageSize());
                value.setSpamFilter(email.getSpamFilter());
                value.setSignature(email.getSignature());
            }
        }
    }

    @Override
    public Email findById(Integer id) {
        Email email = null;
        for (Email item : emailList) {
            if (item.getId().equals(id)) {
                email = new Email(item.getId(), item.getLanguage(), item.getPageSize(), item.getSpamFilter(), item.getSignature());
            }
        }
        return email;
    }

    @Override
    public List<String> showLanguage() {
        return languageList;
    }

    @Override
    public List<Integer> showPaperSize() {
        return pageSizeList;
    }
}
