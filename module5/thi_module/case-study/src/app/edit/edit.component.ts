import {Component, Inject, OnInit} from '@angular/core';
import {PatientService} from '../service/patient.service';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {Patient} from '../model/patient';
import Swal from 'sweetalert2';
import {Router} from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  patientForm: FormGroup;
  patient: Patient;

  constructor(private patientService: PatientService, @Inject(MAT_DIALOG_DATA) public data) {
    this.patientService.findById(data.id).subscribe(patient => {
      this.patient = patient;
      console.log(this.patient);
      this.patientForm.patchValue(this.patient);
    });
    this.patientForm = new FormGroup({
      id: new FormControl('', [Validators.required]),
      maBenhNhan: new FormControl('', [Validators.required]),
      maBenhAn: new FormControl('', [Validators.required]),
      tenBenhNhan: new FormControl('', [Validators.required, Validators.pattern(/^[a-zA-Z '-]+$/)]),
      liDoNhapVien: new FormControl('', [Validators.required]),
      phuongPhapDieuTri: new FormControl('', [Validators.required]),
      bacSiDieuTri: new FormControl('', [Validators.required]),
      ngayNhapVien: new FormControl('', [Validators.required]),
      ngayRaVien: new FormControl('', [Validators.required]),
    });
  }



  ngOnInit(): void {

  }

  submit() {
    if (this.patientForm.valid) {
      const patient = this.patientForm.value;
      this.patientService.update(patient.id, patient).subscribe(  ()=>{
      }
     );
      alert("Chỉnh sửa thành công");

    } else {
      alert('Chỉnh sửa không thành công');
    }
  }
}
