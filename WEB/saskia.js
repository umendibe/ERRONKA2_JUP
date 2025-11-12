/**
 * Deskribapena:
 * Erabiltzailearen interakzioak kontrolatzen ditu:
 * - Popup leihoa ireki eta ixtea
 * - Data eta deskontuaren balidazioa
 * - Txartel kodearen egiaztapena
 * - Pertsona kopuruaren egiaztapena
 */


/**
 * Popup leihoa irekitzen du ("Sarrerak erosi dituzu" mezua erakusten da).
 */
function irekiDialogoa() {
  document.getElementById("popup").style.display = "block";
}

/**
 * Popup leihoa ixten du.
 */
function itxiDialogoa() {
  document.getElementById("popup").style.display = "none";
}

/**Data eta txartel aukerak jasotzen dira*/
const dataEguna = document.getElementById("data");
const txartela = document.getElementById("txartela");

/**
 * Data aldatu denean balidazioak egiten dira:
 * -Ikuslearen eguna deskontua igandean (0) bakarrik erabil daiteke.
 * -Zinea asteburuetan (larunbata 6, igandea 0) bakarrik irekitzen da.
 */
dataEguna.addEventListener('input', function () {
  const data = new Date(this.value);
  const eguna = data.getDay();

  /**Ikuslearen eguna bakarrik igandean*/
  if (txartela.value === "deskontua4") {
    if (eguna !== 0) {
      alert("Ikuslearen eguna bakarrik igandean egin daiteke!");
      this.value = "";
    }
  }

  // Asteburuak soilik
  if (eguna !== 0 && eguna !== 6) {
    alert("Bakarrik asteburuetan irekitzen dugu.");
    this.value = "";
  }
});

// Txartel kodearekin lotutako elementuak
const txartelakodea = document.getElementById("txartelakodea");
const kodeaInput = document.getElementById('kodea');
const bidali = document.getElementById("bidalikodea");

/**
 * Deskontuaren arabera kodearen inputa erakusten edo ezkutatzen du.
 * - Deskontuak 1, 2 eta 3: kodea sartu behar da.
 * - Deskontuak 4 eta 5: kodea ez da beharrezkoa.
 */
txartela.addEventListener('change', function () {
  if (txartela.value !== "deskontua4" && txartela.value !== "deskontua5") {
    txartelakodea.style.display = 'block';
  } else {
    txartelakodea.style.display = 'none';
    kodeaInput.value = '';
  }
});

/**
 * Botoia sakatzean, kodearen atala ezkutatzen da.
 */
bidali.addEventListener('click', function () {
  txartelakodea.style.display = 'none';
});

/**
 * Txartel kodea balidatzen duen funtzioa.
 * - Kodea hutsik badago edo ez bada zenbakizkoa, errorea erakusten du.
 * - Bestela, "DESKONTUA DUZU!" mezua bistaratzen du.
 */
function balidatuKodea() {
  const kodea = document.getElementById("bidalikodea");

  bidali.addEventListener("click", () => {
    const valor = kodeaInput.value.trim();

    if (valor === "" || isNaN(Number(valor))) {
      alert("Ez dago zenbakirik edo balio okerra!");
    } else {
      alert("DESKONTUA DUZU!");
    }
  });
}

// Funtzioa exekutatzen da
balidatuKodea();

// Pertsona kopuruaren inputa
const pertsonaKopurua = document.getElementById("perkop");

/**
 * Pertsona kopurua 1 eta 4 artekoa dela egiaztatzen du.
 * Balio okerra sartzen bada, abisua erakusten du eta inputa garbitzen du.
 */
pertsonaKopurua.addEventListener('input', function () {
  const kopurua = parseInt(this.value);
  if (kopurua < 1 || kopurua > 4) {
    alert("Mesedez, sartu 1 eta 4 arteko pertsona kopurua.");
    this.value = "";
  }
});