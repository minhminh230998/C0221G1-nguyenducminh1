import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {PatientService} from '../service/patient.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(private patientService: PatientService, @Inject(MAT_DIALOG_DATA) public data) { }

  ngOnInit(): void {
  }
  delete(id: any){
    this.patientService.delete(id).subscribe();
    console.log(id)
  }
}
