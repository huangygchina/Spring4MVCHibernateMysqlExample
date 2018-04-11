'use strict';

App.factory('companyService', ['$http', '$q', function($http, $q){

	return {
		
			fetchAllcompanys: function() {
					return $http.get('http://localhost:8080/Spring4MVCHibernateMysqlExample/company/')
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while fetching companys');
										return $q.reject(errResponse);
									}
							);
			},
		    
		    createcompany: function(company){
					return $http.post('http://localhost:8080/Spring4MVCHibernateMysqlExample/company/', company)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while creating company');
										return $q.reject(errResponse);
									}
							);
		    },
		    
		    updatecompany: function(company, id){
					return $http.put('http://localhost:8080/Spring4MVCHibernateMysqlExample/company/'+id, company)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while updating company');
										return $q.reject(errResponse);
									}
							);
			},
		    
			deletecompany: function(id){
					return $http.delete('http://localhost:8080/Spring4MVCHibernateMysqlExample/company/'+id)
							.then(
									function(response){
										return response.data;
									}, 
									function(errResponse){
										console.error('Error while deleting company');
										return $q.reject(errResponse);
									}
							);
			}
		
	};

}]);
