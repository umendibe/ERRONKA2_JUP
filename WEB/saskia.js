
function irekiDialogoa(){
document.getElementById("popup").style.display = "block";
}
function itxiDialogoa(){
    document.getElementById("popup").style.display = "none";
}
const dataEguna = document.getElementById("data");
dataEguna.addEventListener('input', function() {
 const data = new Date (this.value);
 const eguna = data.getDay();
 if(eguna !== 0 && eguna !== 6);{
    this.value = '';
 alert("Aukeratu asteburuko egun bat.");
 }

});