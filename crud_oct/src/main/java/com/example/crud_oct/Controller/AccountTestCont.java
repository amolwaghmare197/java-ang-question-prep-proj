package com.example.crud_oct.Controller;

import com.example.crud_oct.Entity.accountTest;
import com.example.crud_oct.Service.AccountSer;
import com.example.crud_oct.Service.LifecycleWorkerService;
import com.example.crud_oct.Service.csvupload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountTestCont {

    @Autowired
    private AccountSer as;

    @Autowired
    private csvupload cs;

    @Autowired
    private LifecycleWorkerService workerService;

    @GetMapping("/All")
    public ResponseEntity<List<accountTest>>findAll(){
        List<accountTest> at = as.getAll();
        return ResponseEntity.status(200).body(at);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<accountTest>findById(@PathVariable int id){
        accountTest at = as.getByid(id);
        return ResponseEntity.status(200).body(at);
    }

    @DeleteMapping("/id/{id}")
    public String DeleteById(@PathVariable int id){
        as.delete(id);
        return ResponseEntity.status(204).body("successfully deleted").toString();
    }

    @PostMapping("/create")
    public ResponseEntity<accountTest> create(@RequestBody accountTest it){
        accountTest anew = as.create(it);
        return ResponseEntity.status(204).body(anew);
    }

    @PostMapping("/update")
    public ResponseEntity<accountTest> update(@RequestBody accountTest it){
        accountTest anew = as.update(it);
        return ResponseEntity.status(204).body(anew);
    }

    @PostMapping(value= "/upload", consumes = org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity upload(@RequestParam("file") MultipartFile file) throws Exception {
        cs.upload(file);
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/test")
    public ResponseEntity<String> fireLifecycleTest() {
        System.out.println("\n--- 🌊 FLOODING SYSTEM WITH 6 TASKS IMMEDIATELY ---");

        // Loop 6 times to instantly fill Core, Queue, Max, and trigger Rejection
        for (int i = 1; i <= 6; i++) {
            try {
                workerService.executeLongTask(i);
                System.out.println("📤 Task #" + i + " successfully submitted to the pool.");
            } catch (Exception e) {
                System.err.println("🔥 Task #" + i + " CRASHED / REJECTED! Error: " + e.getMessage());
            }
        }

        return ResponseEntity.ok("Lifecycle test executed. Check your IDE terminal logs!");
    }
}
