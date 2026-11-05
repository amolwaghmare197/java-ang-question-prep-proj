package com.example.crud_oct.Service;

import com.example.crud_oct.Entity.accountTest;
import com.example.crud_oct.Repo.AccountTestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
@Service
public class csvupload {

    @Autowired
    private AccountTestRepo at;

    public void upload(MultipartFile file) throws Exception{
        List<accountTest> acs = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))){
            String line ;
            boolean isHeader= true;

            while((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String [] data = line.split(",");


                String fname = data[0].trim();           // index 0 = fname
                String lname = data[1].trim();           // index 1 = lname
                String number = data[2].trim();
                LocalDateTime date = LocalDateTime.parse(data[3].trim()); // index 2 = number

                accountTest user = new accountTest( fname, lname, number,date);
                acs.add(user);
            }
            at.saveAll(acs);
        } catch (RuntimeException e) {
            throw new Exception(e);
        }
    }
}
