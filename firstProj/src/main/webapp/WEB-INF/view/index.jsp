<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpringBootApp</title>
<style>
table,th,td
{
border:solid 2px black;
}
#a
{
 margin:auto;
 width:500px;
 
}
</style>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>    
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    

</head>
<body>
    
     <!--<div id="a">
     <a href="/insertPage">Add Employee</a><br>
     <table>
     <tr>
     <th>ID</th>
     <th>NAME</th>
     <th>DEPARTMENT</th>
     <th>SALARY</th>
     <th>EDIT</th>
     <th>DELETE</th>
     </tr>
     <c:forEach items="${empObject}" var="e">
     <tr>
     <td>${e.id}</td>
     <td>${e.name}</td>
     <td>${e.department}</td>
     <td>${e.salary}</td>
     <td><a href="/updatePage/${e.id}">Edit</a></td>
     <td><a href="/deleteEmployee/${e.id}">Delete</a></td>     
     </tr>
     </c:forEach>
     </table>
     </div>-->
     <table class="table table-hover">
  <thead class="thead-dark">
  <div class="mx-auto" style="width:100px;"><a href="/insertPage" class="btn btn-outline-primary" role="button" aria-pressed="true">Add Employee</a></div>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">NAME</th>
      <th scope="col">GENDER</th>
      <th scope="col">MOBILE NO</th>
      <th scope="col">DEPARTMENT</th>
      <th scope="col">SALARY</th>
      <th scope="col">EDIT</th>
      <th scope="col">DELETE</th>
      <th scope="col">VIEW</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${empObject}" var="e">
    <tr>
      <td id="value">${e.id}</td>
      <td>${e.name}</td>
      <td>${e.gender}</td>
      <td>${e.mobile}</td>
      <td>${e.department}</td>
      <td>${e.salary}</td>
      <td><a href="/updatePage/${e.id}" class="btn btn-outline-primary" role="button" aria-pressed="true">EDIT</a></td>
      <td><button class="btn btn-outline-primary" role="button" aria-pressed="true" id="deleteBtn" onClick="abc(${e.id})">DELETE</button></td>
      <td><button type="button" class="btn btn-outline-primary" data-toggle="modal" data-target="#exampleModal">VIEW</button></td>
      
      
      <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Employee Details</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>ID:     ${e.id}</p>
        <p>Name:     ${e.name}</p>
        <p>Gender:     ${e.gender}</p>
        <p>Mobile:     ${e.mobile}</p>
        <p>Department:     ${e.department}</p>
        <p>Salary:     ${e.salary}</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
    </tr>     
    </c:forEach>
  </tbody>
</table>

<!-- Modal -->
 

 
<script>

function abc(id){
	//alert(id);
	var data=id;
	swal({
		  title: "Are you sure you want to delete?",
		  text: "Once deleted, you will not be able to recover this details!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((willDelete) => {
		  if (willDelete) {
		    swal("Employee Data has been deleted!", {
		      icon: "success",
		    });
		    window.location.assign('/deleteEmployee/'+data);
		    
		  } else {
		    //swal("Didn't delete employee data!");
		    return false;
		  }
		});
	
}



//var DeleteBtn=document.getElementById("deleteBtn");
//console.log(DeleteBtn);
/* DeleteBtn.addEventListener("click",function()
		{
	alert('ddddddddddddddddd');
	var value=document.getElementById("value");
	alert('ddddddddddddddddd'+value);
  document.getElementById("value")='';
  var value1=document.getElementById("value");
	alert('ddddddddddddddddd'+value1);
	
	var val=document.getElementById("identity");
	var val1=document.getElementById("identity").innerHTML;
	console.log("Pressed"+val);
	console.log("Inside"+val1);
	var form=document.getElementById("deleteForm"+val);
	/* swal({
		  title: "Are you sure you want to delete?",
		  text: "Once deleted, you will not be able to recover this details!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((willDelete) => {
		  if (willDelete) {
		    swal("Employee Data has been deleted!", {
		      icon: "success",
		    });
		    window.location.assign('/delete/id');
		    
		  } else {
		    swal("Didn't delete employee data!");
		    return false;
		  }
		});
 */		
      //  val1="";
		
		//});

</script>

</body>
</html>