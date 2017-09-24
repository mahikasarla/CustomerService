'use strict';
App.controller('controller2', function( $scope, $state) {
	
	$scope.getCust = function() {
		console.log('in controller2')
		$state.go('custdetails2', {
			id : $scope.customerId
		})

	}
});