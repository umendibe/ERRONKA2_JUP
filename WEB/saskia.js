function irekiDialogoa() {
  document.getElementById("popup").style.display = "block";
}

function itxiDialogoa() {
  document.getElementById("popup").style.display = "none";
}


const dataEguna = document.getElementById("data");
const txartela = document.getElementById("txartela");

dataEguna.addEventListener('input', function() {
  const data = new Date(this.value);
  const eguna = data.getDay(); 

   if(eguna !==0 && eguna !== 6){
      alert("Bakarrik asteburuetan irikitzen dugu.");
      this.value = "";
  if (txartela.value === "deskontua4") {
    if (eguna !== 0) { 
      alert("Ikuslearen eguna bakarrik igandean egin daiteke!");
      this.value = "";
    }}
  }
});

const txartelakodea = document.getElementById("txartelakodea");
const kodeaInput = document.getElementById('kodea');
const bidali = document.getElementById("bidalikodea");

txartela.addEventListener('change', function() {
  if (txartela.value !== "deskontua4" && txartela.value !== "deskontua5") {
    txartelakodea.style.display = 'block';
  } else {
    txartelakodea.style.display = 'none'; 
    kodeaInput.value = '';                 
  }
});

bidali.addEventListener('click', function(){
  txartelakodea.style.display = 'none';
});