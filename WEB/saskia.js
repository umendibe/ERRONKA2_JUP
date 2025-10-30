
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
if (eguna !== 6 && eguna !== 0) {
    this.value = ''; 
    alert("Aukeratu asteburuko egun bat."); 
  }else if(eguna==0){
    this.value = '';
    alert("ikuslearen eguna da");
  }
});
const txartela = document.getElementById("txartela")
const txartelakodea = document.getElementById("txartelakodea")
const kodeaInput = document.getElementById('kodea');
const bidali = document.getElementById("bidalikodea")
txartela.addEventListener('change', function() {
 if (txartela.value !== "deskontua4" && txartela.value !== "deskontua5") {
    txartelakodea.style.display = 'block';
  }  else {
    txartelakodea.style.display = 'none'; 
    kodeaInput.value = '';                 
  }
})
bidali.addEventListener('click', function(){
    txartelakodea.style.display = 'none';
})

