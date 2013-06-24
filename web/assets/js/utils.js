$(document).ready(function() {
    
    $('.date-utils').datepicker({
        format: 'dd-mm-yyyy'
    });
    
    $('.date-utils').click(function(){
       alert("data"); 
    });

    $('.date-utils').mask('99-99-9999');

    $('.btn-danger').click(function() {
        if (confirm("Deseja realmente executar esta operação?")) {
            return true;
        } else {
            return false;
        }
    });

});

