let puntuak = 1250;

function erosiErrekompentsa(kostua) {
    if (puntuak >= kostua) {
        puntuak = puntuak - kostua;
        document.querySelector('.puntu-zenbakia').textContent = puntuak;
        alert("Erosi duzu! " + kostua + " puntu kendu dira. Orain " + puntuak + " puntu dituzu.");
    } else {
        alert("Ez duzu puntu nahikorik. " + puntuak + " puntu besterik ez dituzu.");
    }
}