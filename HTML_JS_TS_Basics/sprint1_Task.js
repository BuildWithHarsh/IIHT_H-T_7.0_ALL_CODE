function afterNext(event) {
    event.preventDefault();
    clearError();
    var flag = true;
    var userData = {};
    userData.name = document.getElementById('name').value,
        userData.dob = document.getElementById("dob").value,
        userData.email = document.getElementById("email").value,
        userData.phone = document.getElementById("phone").value,
        userData.gender = document.getElementById("Gender").value,
        userData.occupation = document.getElementById("occupation").value,
        userData.idType = document.getElementById("idType").value,
        userData.idNumber = document.getElementById("idNumber").value,
        userData.issueAuth = document.getElementById("issueAuth").value,
        userData.issueDate = document.getElementById("issueDate").value,
        userData.issueState = document.getElementById("issueState").value,
        userData.expDate = document.getElementById("expDate").value
    if (userData.name.length == 0 || userData.name.trim() == "") {
        console.log("Please Enter Name")
        flag=false;
        setError("namediv","* Please Enter a correct Name")
    }  if (userData.dob.length == 0 || userData.dob.trim() == "") {
        console.log("Please Enter Date of birth")
        flag=false;
        setError("dobdiv","* Please Enter Date of birth")
    }  if (userData.email.length == 0 || userData.email.trim() == "") {
        console.log("Please Enter email")
        flag=false;
        setError("emaildiv","* Please Enter the correct email")
    }  if (userData.phone.length == 0 || userData.phone.trim() == "") {
        console.log("Please Enter phone")
        flag=false;y
        setError("phonediv","* Please Enter correct Phone")
    }  if (userData.gender.length == 0 || userData.gender.trim() == "") {
        console.log("Please Enter gender")
        flag=false;
        setError("genderdiv","* Please select correct gender")
    }  if (userData.occupation.length == 0 || userData.occupation.trim() == "") {
        console.log("Please Enter occupation")
        flag=false;
        setError("occupationdiv","*Please enter the correct occupation")
    }  if (userData.idType.length == 0 || userData.idType.trim() == "") {
        console.log("Please Enter idType")
        flag=false;
        setError("idTypediv","* Please Enter correct id Type")
    }  if (userData.idNumber.length == 0 || userData.idNumber.trim() == "") {
        console.log("Please Enter id Number")
        flag=false;
        setError("idNumberdiv","* Please enter correct id Number")
    }  if (userData.issueAuth.length == 0 || userData.issueAuth.trim() == "") {
        console.log("Please Enter issue Autority")
        flag=false;
    }  if (userData.issueDate.length == 0 || userData.issueDate.trim() == "") {
        console.log("Please Enter issueDate")
        flag=false;
    }  if (userData.expDate.length == 0 || userData.expDate.trim() == "") {
        console.log("Please Enter ExpiryDate")
        flag=false;
    } if(flag) {
        console.log(userData);
        swal("Thank You!", "Your details have been safely saved with Us!", "success");
    }
}

function clearError(){
   errors = document.getElementsByClassName('form-error')
   for(let item of errors){
       item.innerHTML = "";
   }
}

function setError(id,error){
    element = document.getElementById(id);
    element.getElementsByClassName('form-error')[0].innerHTML = error;
}

function mouseFunc(){
    console.log("The button was hovered")
}


