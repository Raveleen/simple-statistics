<%@ page import="com.raveleen.DataBase" %><%--
  Created by IntelliJ IDEA.
  User: Святослав
  Date: 23.11.2016
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Simple statistics</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="style.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="header clearfix">
        <h3 class="text-muted">Simple statistics</h3>
    </div>

    <div class="jumbotron">
        <h3>Site visitors.</h3>
        <div class="row marketing">
            <div class="col-lg-6">
                <h4>Country</h4>
                <% int[] array = DataBase.getCountryStatistics(); %>
                <h5>Ukraine</h5>
                <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: <%= array[0] %>%;">
                        <%= array[0] %>%
                    </div>
                </div>
                <h5>Poland</h5>
                <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: <%= array[1] %>%;">
                        <%= array[1] %>%
                    </div>
                </div>
                <h5>Russia</h5>
                <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: <%= array[2] %>%;">
                        <%= array[2] %>%
                    </div>
                </div>
                <h5>Germany</h5>
                <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: <%= array[3] %>%;">
                        <%= array[3] %>%
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <h4>Gender</h4>
                <% int[] gender = DataBase.getGenderStatistics(); %>
                <h5>Male</h5>
                <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: <%= gender[0] %>%;">
                        <%= gender[0] %>%
                    </div>
                </div>
                <h5>Female</h5>
                <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: <%= gender[1] %>%;">
                        <%= gender[1] %>%
                    </div>
                </div>
            </div>
        </div>
    </div>

    <footer class="footer">
        <p>&copy; 2016 Raveleen</p>
    </footer>

</div>
</body>
</html>
