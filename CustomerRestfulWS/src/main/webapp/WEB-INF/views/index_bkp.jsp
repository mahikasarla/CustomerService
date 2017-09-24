<!DOCTYPE html>
<html ng-app="app">
<head>
<meta charset="ISO-8859-1">
<title>Angular Web</title>
 <script
  src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
 <script src="/custrestws/resources/js/app.js"></script>
</head>
<body ng-controller="loginController" >
 <table>
 <title>Customer</title>
 <tr>LoginId:<input type="number" ng-model="loginId"/></tr><br>
 <tr>User Name:<input type="text" ng-model="userName"/></tr><br>
 <tr>PassWord:<input type="text" ng-model="password"/></tr><br>
 <tr><a href="" ng-click= "sendPost()" >signin</a></tr>
 </table>
</body>
</html>