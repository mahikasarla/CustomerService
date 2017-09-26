'use strict';
App.controller('controller1',function($http, $scope, $rootScope, $state) {
	console.log('in controller1')
	$scope.getCust=function(){
		$http.post(	'customer',{'customerId':$scope.customerId})
		.then(function success(response){
				$state.go('custdetails1')
				$rootScope.custdetails=response.data

				console.log('in sendPost controller1', $rootScope.custdetails)
			}, function error(response){
				console.log('response.data', response.data)
				return response.data
				
				}
		)
	}	
	});
