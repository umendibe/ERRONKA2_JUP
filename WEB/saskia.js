function irekiDialogoa() {
  document.getElementById("popup").style.display = "block";
}

function itxiDialogoa() {
  document.getElementById("popup").style.display = "none";
}


const dataEguna = document.getElementById("data");
const txartela = document.getElementById("txartela");

dataEguna.addEventListener('input', function () {
  const data = new Date(this.value);
  const eguna = data.getDay();

  if (txartela.value === "deskontua4") {
    if (eguna !== 0) {
      alert("Ikuslearen eguna bakarrik igandean egin daiteke!");
      this.value = "";
    }
  }
  if (eguna !== 0 && eguna !== 6) {
    alert("Bakarrik asteburuetan irekitzen dugu.");
    this.value = "";
  }
});

const txartelakodea = document.getElementById("txartelakodea");
const kodeaInput = document.getElementById('kodea');
const bidali = document.getElementById("bidalikodea");

txartela.addEventListener('change', function () {
  if (txartela.value !== "deskontua4" && txartela.value !== "deskontua5") {
    txartelakodea.style.display = 'block';
  } else {
    txartelakodea.style.display = 'none';
    kodeaInput.value = '';
  }
});

bidali.addEventListener('click', function () {
  txartelakodea.style.display = 'none';
});

function balidatuKodea() {
  const kodea = document.getElementById("bidalikodea");

  kodea.addEventListener("click", () => {
    alert("DESKONTUA DUZU!");
  });
} balidatuKodea();
const pertsonaKopurua = document.getElementById("perkop");

pertsonaKopurua.addEventListener('input', function () {
  const kopurua = parseInt(this.value);
  if (kopurua < 1 || kopurua > 4) {
    alert("Mesedez, sartu 1 eta 4 arteko pertsona kopurua.");
    this.value = "";
  }
});
