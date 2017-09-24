<!DOCTYPE html>
<html lang="en-US">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<body>

<div ng-app="myApp" ng-controller="myCtrl"> 

<p>Today's welcome message is --:</p>
{{mahiFirstObject.address.state}}
</div>

<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
    $http.get("/custrestws/customer")
    .then(function(response) {
    	console.log("Response Data - ", response.data)
    	$scope.mahiFirstObject = response.data;
    });
});
</script>

</body>
</html>