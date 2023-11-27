import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class LabseqService {
  private readonly baseUrl: string;

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:8080/v1/labseq';
  }

  calcule(n: number): Observable<number> {
    const url: string = `${this.baseUrl}/${n}`;
    return this.http.get<number>(url);
  }
}
