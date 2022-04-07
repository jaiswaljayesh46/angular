import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees!: Employee[];

  constructor(private employeeService: EmployeeService, private router: Router) { }

  ngOnInit(): void {
    this.getEmployees();
  }

  getEmployees(){
    this.employeeService.getEmployeeList().subscribe(
      data => { 
        this.employees=data;      
      });
  }
  
  updateEmployee(id: number){
      this.router.navigate(['update-employee',id]);
  }

  deleteEmployee(id: number){
    this.employeeService.deleteEmployee(id).subscribe(
      data => {
        this.getEmployees();
        this.router.navigate(['/employees']);
      },
      error => {
        console.log(error);
      }
    );
    
  }

  viewEmployee(id: number){
    this.router.navigate(['view-employee',id]);
  }

}
