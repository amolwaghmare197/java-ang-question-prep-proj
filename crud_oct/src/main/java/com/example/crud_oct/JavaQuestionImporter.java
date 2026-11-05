package com.example.crud_oct;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class JavaQuestionImporter {

    public static void main(String[] args) {

        if (args.length < 4) {
            System.err.println("Usage:");
            System.err.println("java JavaQuestionImporter <FILE_PATH> <DB_URL> <DB_USER> <DB_PASSWORD>");
            System.exit(1);
        }

        String excelFilePath = args[0];
        String dbUrl = args[1];
        String dbUser = args[2];
        String dbPassword = args[3];

        String sql = """
                INSERT INTO question
                (
                    technology_id,
                    question,
                    answer,
                    difficulty,
                    created_at,
                    updated_at
                )
                VALUES
                (
                    ?, ?, ?, ?, ?, ?
                )
                """;

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis);
             Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement ps = connection.prepareStatement(sql)) {

            Sheet sheet = workbook.getSheetAt(0);

            int count = 0;

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                Row row = sheet.getRow(i);

                if (row == null || row.getCell(0) == null) {
                    continue;
                }

                String question = row.getCell(0).getStringCellValue();

                ps.setString(1, "8");
                ps.setString(2, question);
                ps.setString(3, "Answer Pending");
                ps.setString(4, "Medium");
                ps.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
                ps.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now()));

                ps.addBatch();

                count++;
            }

            ps.executeBatch();

            System.out.println("=================================");
            System.out.println("Import Successful");
            System.out.println("Technology : HIBERNATE");
            System.out.println("Questions inserted : " + count);
            System.out.println("=================================");

        } catch (Exception e) {

            System.err.println("Import Failed");

            e.printStackTrace();
        }
    }
}
