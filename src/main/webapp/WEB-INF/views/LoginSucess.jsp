<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>login sucessfully start booking</h1>
<body style="background-color: powderblue">
<h1>Hi , ${email } Welcome to <strong>Ravi Teja Travels</strong>  Please start Booking</h1>

<form action="book-travel" style="border:1px solid #ccc">
  <div class="container">
    <h1>Booking</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="from_address"><b>From</b></label>
    <input type="text" placeholder="From City" name="from_address" required>

    <label for="to_address"><b>To</b></label>
    <input type="text" placeholder="To City" name="to_address" required>


    
     <label for="travel_date"><b>Select Date</b></label>
    <input type="date" name="travel_date" required>

    
<label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Terms & Conditons
    </label>
    
    <p>By Clicking this  you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="submit" class="cancelbtn">Check Available Buses</button>
     
    </div>
  </div>
</form>
</body>
</html>