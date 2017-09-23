$(document).ready(function() {
    $('#cameras-table').DataTable( {
        "ajax": {
            "url": '/camera/list',
            "dataType": "json",
            "dataSrc": ""
        },
        "aoColumns": [
            { "mDataProp": "id" },
            { "mDataProp": "brand" },
            { "mDataProp": "name" },
            { "mDataProp": "description" },
            { "mDataProp": "created" }
        ]
    });
});