const url = 'http://localhost:8080/random';

function random() {
    jQuery.support.cors = true;
    $.get(url, function (data, status) {
        var img = document.getElementById("img");

        var i = 1000;
        while (i > 807) {
            i = Math.round(Math.random() * 1000);
        }
        img.src = "../images/pokemon/" + i + ".png";
    });
}