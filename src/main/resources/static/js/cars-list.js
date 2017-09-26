$(document).ready(function() {
    $('#cars-table').DataTable( {
        "ajax": {
            "url": '/car/list',
            "dataType": "json",
            "dataSrc": ""
        },
        "aoColumns": [
            { "mDataProp": "id" },
            { "mDataProp": "carMake" },
            { "mDataProp": "model" },
            { "mDataProp": "description" },
            { "mDataProp": "created" }
        ]
    });
});