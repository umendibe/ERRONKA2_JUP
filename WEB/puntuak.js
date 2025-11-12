/**
 * Erabiltzailearen puntu kopurua gordetzen duen aldagaia
 */
let puntuak = 1250;

/**
 * Errekompentsa bat erosteko funtzioa
 */
function erosiErrekompentsa(kostua) {
    /**Egiaztatu ea erabiltzaileak puntu nahikoa dituen */ 
    if (puntuak >= kostua) {
        /**Kendu puntuak erabiltzailearen kontutik */ 
        puntuak = puntuak - kostua;
        
        /** Eguneratu puntuak puntu berriekin*/ 
        document.querySelector('.puntu-zenbakia').textContent = puntuak;
        
        /* Erakutsi baieztapen-mezu arrakastatsuaren kasuan */
        alert("Erosi duzu! " + kostua + " puntu kendu dira. Orain " + puntuak + " puntu dituzu.");
    } else {
        /* Erakutsi alerta mezua puntu nahikorik ez dagoenean */
        alert("Ez duzu puntu nahikorik. " + puntuak + " puntu besterik ez dituzu.");
    }
}
