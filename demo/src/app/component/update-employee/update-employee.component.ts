import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Employee } from 'src/app/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  id!: number;
  employee: Employee = new Employee();

  constructor(private employeeService: EmployeeService,private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.params['id'];
    this.employeeService.getEmployeeById(this.id).subscribe(
      data => {       
        this.employee = data
      },
      error => {      
        console.log(error);
      }
    );
  }

  updateEmployee(){
   
    this.employeeService.updateEmployee(this.id,this.employee).subscribe(
      data =>{
        console.log("success"+this.employee);
        this.goToEmployeeList();
      },
      error => {
        console.log("Error"+this.employee);
      }
    );
  }

  onSubmit(){
    this.updateEmployee();
  }

  goToEmployeeList(){
    this.router.navigate(['/employees']);
  }

}
