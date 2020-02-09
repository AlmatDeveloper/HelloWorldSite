$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/message"
    }).then(function(data) {
        $('#message').append(data.message);
    });
});