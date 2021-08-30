import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

import {environment} from '../../environments/environment';
import {Observable} from 'rxjs';
import {Patient} from '../model/patient';

const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  constructor(private http: HttpClient) {
  }

  getAll() {
    return this.http.get<Patient[]>( '/patient/list');
  }

  delete(id: number): Observable<Patient> {
    return this.http.delete<Patient>(API_URL+'/patient/delete?id='+id);
  }

  findById(id: number): Observable<Patient> {
    return this.http.get<Patient>(API_URL+'/patient?id='+id);
  }

  update(id: number, patient: Patient): Observable<Patient> {
    return this.http.put<Patient>(API_URL+'/patient/edit?id='+id, patient);
  }
}
