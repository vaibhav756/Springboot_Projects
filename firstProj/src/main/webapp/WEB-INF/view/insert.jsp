<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Data</title>
<style>
#a
{
  margin:auto;
  border:solid black 2px;
  width:400px;
  padding:8px; 
}

</style>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>




</head>
<body>

<!--      <form id="a" action="/addEmployee" method="post"> -->
<!--      Enter Id<input type="text" name="id" id="id"><br> -->
<!--      Enter Name<input type="text" name="name" id="nametext"><br>   -->
<!--      Enter Gender<input type="text" name="gender" id="gender"><br> -->
<!--      Enter Mobile no<input type="text" name="mobile"id="mobile"><br>    -->
<!--      Enter Department<input type="text" name="department" id="department"><br> -->
<!--      Enter Salary<input type="text" name="salary" id="salary"><br> -->
<!--      <button type="submit">Submit</button> -->
<!--      </form> -->
     
     
      
     
       <div class="container">
         <div class="row justify-content-md-center">
              <div class="col col-lg-6">
               <a href="/" class="btn btn-outline-primary" role="button" aria-pressed="true" text-align="center">Back</a><strong style="margin-left: 140px;font-size: x-large;color:red;">Add Employee</strong>
  <form action="/addEmployee" autocomplete="off" name="formsbt" method="post" id="form" style="border:solid black 5px;padding:10px" >
  <div class="form-group">
    <label for="id">Enter ID</label>
    <input type="text" class="form-control" name="id" id="id">
  </div> 
  <div class="form-group">
    <label for="name">Enter Name</label>
    <input type="text" class="form-control" name="name" id="nametext">
  </div>
   
  <div class="form-group">Select Gender
    <select name="gender" id="gender" name="gender">
    <option value="Male">Male</option>
    <option value="Female">Female</option>
    </select>
  </div>


  <div class="form-group">
    <label for="mobile">Enter Mobile no</label>
    <input type="text" class="form-control" name="mobile" id="mobile">
  </div>
  <div class="form-group">
    <label for="department">Enter Department</label>
    <input type="text" class="form-control" name="department" id="department">
  </div>
  <div class="form-group">
    <label for="salary">Enter Salary</label>
    <input type="text" class="form-control" name="salary" id="salary">
  </div>
  <div class="mx-auto" style="width: 200px;">
  <button type="button" class="btn btn-primary" id="submitBtn">Submit</button>
    <button type="button" class="btn btn-primary" id="cancel1">Cancel</button>
  </div>
  
</form>
              
              </div>         
         </div>
    </div>
    
 
 <script>
     var idpt=/^[0-9]{0,6}$/;
     var namept=/^[a-zA-Z .]{0,30}$/;
     var departmentpt=/^[a-zA-Z -(,&-,)]{0,50}$/;    ///^[a-zA-Z]{1,30}$/;
     var mobilept=/^[987][0-9]{0,9}$/;
     var salarypt=/^[0-9,.]{0,8}$/;                  ///^[0-9]{1,6}$/;
     var id=document.getElementById("id");
     var namenew=document.getElementById("nametext");
     var gender=document.getElementById("gender");
     var mobile=document.getElementById("mobile");
     var department=document.getElementById("department");
     var salary=document.getElementById("salary");
     //var cancel=document.getElementById("cancel1");
     
     var sbt=document.getElementById("submitBtn");
     sbt.addEventListener("click",function(){
    	 var formSubmit=document.getElementById("form");
     	 swal({
    		  title: "Do you want to submit?",
    		  text: "Once Submited,can't refill again!",
    		  icon: "warning",
    		  buttons: true,
    		  dangerMode: true,
    		  closeOnClickOutside: false
    		})
    		.then((submitform) => {
    		  if(submitform) {
    		     swal("Submitted Successfully", {
    		      icon: "success",
    		    }); 
    		    //confirm=true; 
    		    formSubmit.submit();
    		  } else {
    		    //swal("Fill form",{
    		    //});
    		    return false;
    		  }
    		}); 
    		
    		
     });
     
    		      
     id.addEventListener("input",function(){
    	 if(!(id.value.match(idpt)))
         {
    		 swal("ID must be number and it should not be greater than 6 digit");
    		 id.value="";
         }
     });
     
     namenew.addEventListener("input",function(){
    	if(!(namenew.value.match(namept)))
    		{
    		  swal("Name must be text and should not be greater than 30");
    		  namenew.value="";
    		}
     });
     
     mobile.addEventListener("input",function(){
    	if(!(mobile.value.match(mobilept)))
    	{
    		swal("Mobile no must be digit should start with 9/8/7 and must be with 10 digit");
    		mobile.value="";
    	}
     });
     
     department.addEventListener("input",function(){
    	if(!(department.value.match(departmentpt)))
    		{
    		  swal("Department must be text");
    		  department.value="";
    		}
     });
     
     salary.addEventListener("input",function(){
    	if(!(salary.value.match(salarypt)))
    		{
    		  swal("Salary must be in digit");
    		  salary.value="";
    		}
     });
     
     
//      name.addEventListener("keyup",function(){
//     	if(name.value.match(pattern))
//     	{
//     		 alert("Enter valid name");
//     		 console.log("Entered");
//     	}
//      });
     
     
     
     </script>
     
    

</body>
</html>