package com.example.crud_oct.Service;

import com.example.crud_oct.Entity.accountTest;
import com.example.crud_oct.Exception.AccountNotFoundException;
import com.example.crud_oct.Repo.AccountTestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountSer {

    @Autowired
    private AccountTestRepo ar;

    public List<accountTest> getAll(){
        return ar.findAll();
    }

    @Cacheable(value = "accounts", key = "#id")
    public accountTest getByid(int id){
       return ar.findById((long) id).orElseThrow(()->new AccountNotFoundException("not found"));
    }

    public accountTest create (accountTest at){
        return ar.save(at);
    }

    @CachePut(value = "accounts", key = "#at.id")
    public accountTest update (accountTest at){
        accountTest a1 = ar.findById(at.getId()).orElse(null);
        if(a1 != null){
            a1.setFname(at.getFname());
            a1.setLname(at.getLname());
            a1.setNumber(at.getNumber());
            return ar.save(at);
        } else {
            throw new AccountNotFoundException("user not found");
        }

    }

    @CacheEvict(value = "accounts", key = "#id")
    public void delete(int id){
        ar.deleteById((long) id);
    }
}
