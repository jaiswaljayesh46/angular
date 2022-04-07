import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './component/test/test.component';
import { TestService } from './service/test.service';
import { EmployeeListComponent } from './component/employee-list/employee-list.component';
import { EmployeeService } from './service/employee.service';
import { CreateEmployeeComponent } from './component/create-employee/create-employee.component';
import { FormsModule } from '@angular/forms';
import { UpdateEmployeeComponent } from './component/update-employee/update-employee.component';
import { ViewEmployeeComponent } from './component/view-employee/view-employee.component';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    EmployeeListComponent,
    CreateEmployeeComponent,
    UpdateEmployeeComponent,
    ViewEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [TestService,EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
