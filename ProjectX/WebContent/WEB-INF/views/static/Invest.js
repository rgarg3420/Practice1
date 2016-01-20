	
//var app = angular.module('AppOne',[]); --- For date picker using jquery ui
/*app.directive('jqdatepicker', function () {
	alert("called");
    return {
        restrict: 'A',
        require: 'ngModel',
         link: function (scope, element, attrs, ngModelCtrl) {
            element.datepicker({
                dateFormat: 'DD, d  MM, yy',
                onSelect: function (date) {
                    scope.date = date;
                    scope.$apply();
                }
            });
        }
    };
});*/
	
	var app = angular.module('AppOne',['ngFileUpload']);
	app.controller('myController',['$scope', 'Upload', '$timeout', function ($scope, Upload, $timeout) {
    $scope.uploadPic = function(file) {
    file.upload = Upload.upload({
      url: 'file:///C:/Users/Rohit Garg/Downloads',
      data: {file: file},
    });

    file.upload.then(function (response) {
      $timeout(function () {
        file.result = response.data;
      });
    }, function (response) {
      if (response.status > 0)
        $scope.errorMsg = response.status + ': ' + response.data;
    }, function (evt) {
      // Math.min is to fix IE which reports 200% sometimes
      file.progress = Math.min(100, parseInt(100.0 * evt.loaded / evt.total));
    });
    }

     





		$scope.firstName = "First Name";
		$scope.lastName = "Last Name";
        $scope.userAge = 'Age';
        $scope.userPlace = "Location";
        $scope.pCard = "PanCard";
        $scope.email="Email";
        $scope.contact="contact"
        $scope.image = "ca_image.jpg"
        $scope.pflag =true;
        $scope.inversepflag = true;



$scope.toggle = function(){
      $scope.pflag = !$scope.pflag;
      $scope.inversepflag = !$scope.inversepflag;
        };
        $scope.investmentList =[

        ];

$scope.data = {
    repeatSelect: null,
    availableOptions: [
      {id: 'Equity', name: 'Equity Type'},
      {id: 'Debt', name: 'Debt Type'}
    ],
   };


$scope.AddRows = function(){
	$scope.investmentList.push({'iType':$scope.iType, 'investName':$scope.investName,'unitNum':$scope.unitNum,'premium':$scope.premium,'unitPrice':$scope.unitPrice,'assurSum':$scope.assurSum});
	$scope.iType='';
	$scope.investName='';
	$scope.unitNum='';
	$scope.unitPrice='';
	$scope.premium='';
	$scope.assurSum='';
         };
$scope.removeRow = function(investName){				
		var index = -1;		
		var comArr = eval( $scope.investmentList );
		for( var i = 0; i < comArr.length; i++ ) {
			if( comArr[i].investName === investName ) {
				index = i;
				break;
			}
		}
		if( index === -1 ) {
			alert( "Something gone wrong" );
		}
		$scope.investmentList.splice( index, 1 );		
	       };


$scope.totalPremmium = function(){
     var total = 0;
      for(var i = 0; i < $scope.investmentList.length; i++){
        var investObj = $scope.investmentList[i];
        
        total=total - -investObj.premium;
       }
     return total;
      };


$scope.totalSumAssurred = function(){
   var total = 0;
   for(var i = 0; i < $scope.investmentList.length; i++){
        var investObj = $scope.investmentList[i];
        
        total= total - -investObj.assurSum;
    }
    return total;
	};



}] );

function demoFromHTML() {
 $("button").click(function(){
  $("#invest_table").table2excel({
    // exclude CSS class
    exclude: ".noExl",
    name: "invesment"
  });
  });

  }

/*var app = angular.module('AppOne',['ngFileUpload']);
	app.controller('myController',function($scope){

		$scope.firstName = "First Name";
		$scope.lastName = "Last Name";
        $scope.userAge = 'Age';
        $scope.userPlace = "Location";
        $scope.pCard = "PanCard";
        $scope.email="Email";
        $scope.contact="contact"
        $scope.image = "ca_image.jpg"
        $scope.pflag =true;
        $scope.inversepflag = true;*/