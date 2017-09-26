$(document).ready(function() {
    $("#add-car-submit").click(function() {

        var carAddForm = {}
        carAddForm["model"] = $("#car-model-input").val();
        carAddForm["description"] = $("#car-description-input").val();
        carAddForm["carMake"] = $("#car-make-select").val();

         $.ajax({
         type : "POST",
         		contentType : "application/json",
         		url : "/car/add",
         		data : JSON.stringify(carAddForm),
         		dataType : 'json',
         		timeout : 100000,
         		success : function(data) {
         			console.log("SUCCESS: ", data);
         			display(data);
         		},
         		error : function(e) {
         			console.log("ERROR: ", e);
         			display(e);
         		},
         		done : function(e) {
         			console.log("DONE");
         		}
         });
     });
});