import { Component, OnInit } from '@angular/core';
import * as XLSX from 'xlsx';

@Component({
  selector: 'app-csv-viewer',
  templateUrl: './csv-viewer-component.component.html',
  styleUrls: ['./csv-viewer-component.component.css']
})
export class CsvViewerComponent implements OnInit {
  rows: any[] = [];

  ngOnInit(): void {

    const fileUrl = '/assets/temp.xlsx';

    console.log('Loading file:', fileUrl);

    fetch(fileUrl)
      .then(response => {

        console.log('Status:', response.status);

        return response.arrayBuffer();

      })
      .then(data => {

        const workbook = XLSX.read(data);

        const sheetName = workbook.SheetNames[0];

        const worksheet = workbook.Sheets[sheetName];

        this.rows = XLSX.utils.sheet_to_json(worksheet);

        console.log('Rows:', this.rows);

      })
      .catch(error => {

        console.error('Excel Load Error:', error);

      });

  }

}
