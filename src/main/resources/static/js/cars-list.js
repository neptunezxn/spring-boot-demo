$(document).ready(function() {
    $('#cars-table').DataTable( {
        "ajax": {
            "url": '/car/list',
            "dataType": "json",
            "dataSrc": ""
        },
        "columns": [
            { data : "id" },
            { data : "carMake" },
            { data : "model" },
            { data : "description" },
            { data : "created" }
        ]
    });
});