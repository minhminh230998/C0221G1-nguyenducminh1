import {Component, OnInit} from '@angular/core';
import {PatientService} from '../service/patient.service';
import {MatDialog} from '@angular/material/dialog';
import {DeleteComponent} from '../delete/delete.component';
import {EditComponent} from '../edit/edit.component';
import {Patient} from '../model/patient';

@Component({
  selector: 'app-customer-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  patients: Patient[]=[];

  config: any;
  key = 'id';
  a: boolean = false;

  constructor(private patientService: PatientService, private dialog: MatDialog) {

    this.config = {
      itemsPerPage: 2,
      currentPage: 1,
      totalItems: this.patients.length
    };

  }
  sort(key: any) {
    this.key = key;
    this.a = !this.a;
    this.config = {
      itemsPerPage: 2,
      currentPage: 1,
      totalItems: this.patients.length
    };

  }

  pageChanged(event) {
    this.config.currentPage = event;
  }

  ngOnInit(): void {
    this.patientService.getAll().subscribe(patient => {
      this.patients = patient;
      console.log(this.patients)
    });
  }

  openDialog(id: any,maBenhNhan: any) {
    let dialogRef = this.dialog.open(DeleteComponent, {
      data: {id,maBenhNhan}
    });
    dialogRef.afterClosed().subscribe(() => {
      this.patientService.getAll().subscribe(patient => {
        this.patients = patient;
      });
    });

  }

  openDialogEdit(id: any) {
    let dialogRef = this.dialog.open(EditComponent, {
      data: {id}
    });
    dialogRef.afterClosed().subscribe(() => {
      this.patientService.getAll().subscribe(patient => {
        this.patients = patient;
      });
    });
  }
}
