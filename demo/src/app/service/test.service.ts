import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TestService {

  private baseUrl: string = "http://localhost:8080/"

  constructor(private http:HttpClient) { }

  testApi(){
    return this.http.get('http://localhost:8081/test');
  }


}
