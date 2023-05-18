<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to My Website</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <!-- Custom CSS -->
    <style>
        .jumbotron {
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <div class="jumbotron text-center">
        <h1>Welcome <B>${username}</B> to my page </h1>
        <p>This is a sample homepage created using Bootstrap and HTML.</p>
    </div>
    <!-- Include Bootstrap JS -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
