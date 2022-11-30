class Employee{
    constructor(companyName) {
        this.companyName = companyName;
      }
}

class Developer extends Employee{
    constructor(companyName,employeeName,dept,position,joiningDate,location,emailId,empId,salary){
        super(companyName);
        this.employeeName=employeeName;
        this.dept=dept;
        this.position=position;
        this.joiningDate=joiningDate;
        this.location=location;
        this.emailId=emailId;
        this.empId=empId;
        this.salary=salary;
    }
}

class HR extends Employee{
    constructor(companyName,employeeName,dept,position,joiningDate,location,emailId,empId,salary){
        super(companyName);
        this.employeeName=employeeName;
        this.dept=dept;
        this.position=position;
        this.joiningDate=joiningDate;
        this.location=location;
        this.emailId=emailId;
        this.empId=empId;
        this.salary=salary;
    }
}

class Finance extends Employee{
    constructor(companyName,employeeName,dept,position,joiningDate,location,emailId,empId,salary){
        super(companyName);
        this.employeeName=employeeName;
        this.dept=dept;
        this.position=position;
        this.joiningDate=joiningDate;
        this.location=location;
        this.emailId=emailId;
        this.empId=empId;
        this.salary=salary;
    }
}

class Sales extends Employee{
    constructor(companyName,employeeName,dept,position,joiningDate,location,emailId,empId,salary){
        super(companyName);
        this.employeeName=employeeName;
        this.dept=dept;
        this.position=position;
        this.joiningDate=joiningDate;
        this.location=location;
        this.emailId=emailId;
        this.empId=empId;
        this.salary=salary;
    }
}

class Marketing extends Employee{
    constructor(companyName,employeeName,dept,position,joiningDate,location,emailId,empId,salary){
        super(companyName);
        this.employeeName=employeeName;
        this.dept=dept;
        this.position=position;
        this.joiningDate=joiningDate;
        this.location=location;
        this.emailId=emailId;
        this.empId=empId;
        this.salary=salary;
    }
}

class QA extends Employee{
    constructor(companyName,employeeName,dept,position,joiningDate,location,emailId,empId,salary){
        super(companyName);
        this.employeeName=employeeName;
        this.dept=dept;
        this.position=position;
        this.joiningDate=joiningDate;
        this.location=location;
        this.emailId=emailId;
        this.empId=empId;
        this.salary=salary;
    }
}

let developer = new Developer("Cognizant","HarshDeveloper","ADM","SDE","November 8","Hyderbad","harshDev@cognizant.com","12345","100");
let hr = new HR("Cognizant","HarshHR","HR","SDE","November 9","Delhi","harshhr@cognizant.com","12345","200");
let finance = new Finance("Cognizant","HarshFinance","FNC","SDE","November 10","Bangalore","harshfnc@cognizant.com","12345","300");
let sales = new Sales("Cognizant","HarshSales","ADM","SALES","November 11","Noida","harshsales@cognizant.com","12345","400");
let marketing = new Marketing("Cognizant","HarshMKT","MKT","SALES","November 11","Noida","harshsmkt@cognizant.com","12345","500");
let qa = new QA("Cognizant","Harshqa","QA","SALES","November 11","Noida","harshqa@cognizant.com","12345","600");

console.log(developer);
console.log(hr);
console.log(finance);
console.log(sales);
console.log(marketing);
console.log(qa);
