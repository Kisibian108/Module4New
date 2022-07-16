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
        emailList.add(new Email(1,"China",25,"Spam filter","Thor"  ));
        emailList.add(new Email(2,"English",50,"Enable Spam filter","Lam"  ));
        emailList.add(new Email(3,"Korea",100,"Spam filter","Linh"  ));
        emailList.add(new Email(4,"France",75,"Enable Spam filter","Ngoc"  ));
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
    public Email findById(int id) {
        return emailRepository.findById(id);
    }
}
