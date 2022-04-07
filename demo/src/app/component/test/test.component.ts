import { Component, OnInit } from '@angular/core';
import { TestService } from 'src/app/service/test.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor(private test:TestService) { }

  ngOnInit(): void {
    this.test.testApi().subscribe(
      response=>{
        console.log("**********************"+response);
      },
      error=>{
        console.log(error);
      }
    )
  }

}
