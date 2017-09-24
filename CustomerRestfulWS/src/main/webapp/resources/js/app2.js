var app = angular.module('app', []); 

app.controller("loginController", [ '$scope', '$http', function($scope, $http) {
      
    $scope.sendPost = function() {
        $http({
            url : 'http://localhost:8080/custrestws/signin',
            method : "POST",
            data : {
                'loginId' : $scope.loginId,
                'userName': $scope.userName,
                'password': $scope.password
            }
        }).then(function(response) {
            console.log(response.data);
            $scope.message = response.data;
        }, function(response) {
            //fail case
            console.log(response);
            $scope.message = response;
        });
    };
} ]);