'use strict';

App.controller('companyController', [
		'$scope',
		'companyService',
		function($scope, companyService) {
			var self = this;
			self.company = {
				id : null,
				companyname : '',
				address : '',
				email : ''
			};
			self.companys = [];

			self.fetchAllcompanys = function() {
				companyService.fetchAllcompanys().then(function(d) {
					self.companys = d;
				}, function(errResponse) {
					console.error('Error while fetching Currencies');
				});
			};

			self.createcompany = function(company) {
				companyService.createcompany(company).then(
						self.fetchAllcompanys, function(errResponse) {
							console.error('Error while creating company.');
						});
			};

			self.updatecompany = function(company, id) {
				companyService.updatecompany(company, id).then(
						self.fetchAllcompanys, function(errResponse) {
							console.error('Error while updating company.');
						});
			};

			self.deletecompany = function(id) {
				companyService.deletecompany(id).then(self.fetchAllcompanys,
						function(errResponse) {
							console.error('Error while deleting company.');
						});
			};

			self.fetchAllcompanys();

			self.submit = function() {
				if (self.company.id == null) {
					console.log('Saving New company', self.company);
					self.createcompany(self.company);
				} else {
					self.updatecompany(self.company, self.company.id);
					console.log('company updated with id ', self.company.id);
				}
				self.reset();
			};

			self.edit = function(id) {
				console.log('id to be edited', id);
				for (var i = 0; i < self.companys.length; i++) {
					if (self.companys[i].id == id) {
						self.company = angular.copy(self.companys[i]);
						break;
					}
				}
			};

			self.remove = function(id) {
				console.log('id to be deleted', id);
				for (var i = 0; i < self.companys.length; i++) {
					if (self.companys[i].id == id) {
						self.reset();
						break;
					}
				}
				self.deletecompany(id);
			};

			self.reset = function() {
				self.company = {
					id : null,
					companyname : '',
					address : '',
					email : ''
				};
				$scope.myForm.$setPristine(); //reset Form
			};

		} ]);
