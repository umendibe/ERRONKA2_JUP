// =======================================================
// Deskribapena:
//   - Funtzio honek "Gora Bueltatu" botoia kudeatzen du.
//   - Botoia pantailan agertzen da erabiltzaileak 200px baino gehiago 
//     behera scroll egiten duenean.
//   - Botoia klik egiten denean, web-orriaren goialdera itzultzen du
//     "smooth" animazioarekin.
// =======================================================
function goraBueltatu() {
    // Gora Bueltatu botoia lortu
    const goraBueltatu = document.getElementById("goraBueltatu");

    // =======================================================
    // SCROLL EVENTUA
    // =======================================================
    // Erabiltzaileak behera scroll egiten duenean
    // botoia erakutsi edo ezkutatu.
    window.addEventListener("scroll", () => {
        // scrollY > 200 bada, erakutsi; bestela ezkutatu
        goraBueltatu.style.display = window.scrollY > 200 ? "block" : "none";
    });

    // =======================================================
    // CLICK EVENTUA
    // =======================================================
    // Botoia klik egiten denean, goialdera itzuli "smooth" animazioarekin
    goraBueltatu.addEventListener("click", () => {
        window.scrollTo({ top: 0, behavior: "smooth" });
    }); 
}

// =======================================================
// FUNTZIOA DEITZEN
// =======================================================
// Orri kargatu bezain pronto funtzioa exekutatzen da
goraBueltatu();
