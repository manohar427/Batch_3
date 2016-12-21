function validation()
{
	var fname = document.studentRegist.fname.value;
	var lname = document.studentRegist.lname.value;
	var email = document.studentRegist.email.value;
	var dob = document.studentRegist.dob.value;
	var gender = document.studentRegist.gender.value;
	var skills = document.studentRegist.skills;
	var university = document.studentRegist.university.value;
	var address = document.studentRegist.address.value;
	
	if(fname.length ==0){
		alert("Please provide Fname");
		document.studentRegist.fname.focus();
		changeRed(document.studentRegist.fname);//.style.backgroundColor = "red";
		return;
	}
	if(lname.length ==0){
		alert("Please provide LastName");
		document.studentRegist.lname.focus();
		changeRed(document.studentRegist.lname);
		return;
	}
	if(email.length ==0){
		alert("Please provide Email");
		return;
	}
	if(dob.length ==0){
		alert("Please provide DOB");
		return;
	}
	
	if(gender.length ==0){
		alert("Please Select Gender");
		return;
	}
	
	var flag = 0;
	for(var i=0;i<skills.length;i++){
		if(skills[i].checked == true){
			flag = flag +1;
		}
	}
	
	if(flag == 0){
		alert("Please select skill");
		return;
	}
	if(flag == 1){
		alert("Please select alleast two skill");
		return;
	}
	
	if(flag == 3){
		alert("Please select max two skills only");
		return;
	}
	
	if(university =="select"){
		alert("Please Select University");
		return;
	}
	if(address.length ==0){
		alert("Please provide Address");
		return;
	}
}
function changeColor(field) {
	field.style.backgroundColor = "white";
}

function changeRed(doc) {
	doc.style.backgroundColor = "red";
}