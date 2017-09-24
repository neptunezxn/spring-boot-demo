$(document).ready(function() {
    $("#add-camera-submit").click(function() {

        var cameraAddForm = {}
        cameraAddForm["name"] = $("#camera-name-input").val();
        cameraAddForm["description"] = $("#camera-description-input").val();
        cameraAddForm["brand"] = $("#camera-brand-select").val();

         $.ajax({
         type : "POST",
         		contentType : "application/json",
         		url : "/camera/add",
         		data : JSON.stringify(cameraAddForm),
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