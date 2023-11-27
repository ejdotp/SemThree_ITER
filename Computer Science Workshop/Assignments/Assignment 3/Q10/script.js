$(document).ready(function(){
    $(".expand").click(function(){
        $(this).siblings(".bio").toggle();
        if($(this).text() === '+')
        {
            $(this).text('-');
        } else {
            $(this).text('+');
        }
    });
});