/**
 * "Gora Bueltatu" botoia kudeatzen duen funtzioa.
 *
 * Deskribapena:
 * - Botoia pantailan agertzen da erabiltzaileak 200px baino gehiago
 *   behera scroll egiten duenean.
 * - Botoia klik egiten denean, web-orriaren goialdera itzultzen du
 *   "smooth" animazioarekin.
 *
 * @function
 */
function goraBueltatu() {
    /**
     * Gora Bueltatu botoia lortu.
     */
    const goraBueltatu = document.getElementById("goraBueltatu");

    /**
     * Scroll eventua: erabiltzaileak behera scroll egiten duenean
     * botoia erakutsi edo ezkutatu.
     */
    window.addEventListener("scroll", () => {
        goraBueltatu.style.display = window.scrollY > 200 ? "block" : "none";
    });

    /**
     * Click eventua: botoia klik egiten denean,
     * goialdera itzuli "smooth" animazioarekin.
     */
    goraBueltatu.addEventListener("click", () => {
        window.scrollTo({ top: 0, behavior: "smooth" });
    });
}

/**
 * Orri kargatu bezain pronto funtzioa exekutatzen da.
 */
goraBueltatu();
