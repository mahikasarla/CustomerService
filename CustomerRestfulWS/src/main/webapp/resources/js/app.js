'use strict';
var App = angular.module('app', [ 'ui.router' ]);
App.config(function($stateProvider, $urlRouterProvider) {

	// console.log('hi in app config')
	// $urlRouterProvider.otherwise(function ($injector){
	// var $state = $injector.get('$state');
	// console.log('in otherwise');
	// $state.go('home')
	// });

	$urlRouterProvider.otherwise('/');
	$stateProvider.state('/', {
		url : '/',
		templateUrl : "resources/templates/customer.html",
		controller : function() {
		}
	}).state('login', {
		url : '/login',
		templateUrl : "resources/templates/login.html",
		controller : 'logincontroller'
	}).state('register', {
		url : '/register',
		templateUrl : "resources/templates/register.html",
		controller : 'registercontroller'
	}).state('homepage1', {
		url : '/homepage',
		templateUrl : "resources/templates/homepage.html",
		controller : 'controller1'
	}).state('homepage2', {
		url : '/homepage',
		templateUrl : "resources/templates/homepage.html",
		controller : 'controller2'
	})
	.state('custdetails1',{
		url:'/custdetails',
		templateUrl : "resources/templates/custdetails.html",
		
	})
	.state('custdetails2',{
		url:'/custdetails/:id',
		templateUrl : "resources/templates/custdetails.html",
		controller: function($scope, custdet) {
			$scope.customerdet = custdet;
			console.log('customerdet',custdet,  $scope.customerdet);
		},
		resolve: {
			custdet:function($http, $stateParams){
				return $http.get('customer/' +$stateParams.id)
				.then(function sucess(response){
				console.log('response.data', response.data)
						return response.data
					
				}, function error(response){
				console.log('response.data', response.data)
				return response.data
				
				})
			}
		}
		
	});
});