App.controller('logincontroller', function($http, $scope, $state) {
			$scope.login = {}
			$scope.sendPost = function() {
				console.log($scope.login)
				$http.post('signin', $scope.login )
				.then(
						function success(response){
							$state.go('homepage2');
						}, 
				function error(response){
							$state.go('login');
					$scope.errorMessage = response.statusText;
				});
			}

});