/* ==========================
   IRUDIEN MULTZOA
========================== */
/* Irudiak eta haien testuak objektuetan definituta daude */
const images = [
    { src: 'img2/pelikulak2/blackphone2_handia.png', text: 'BLACKPHONE 2' },
    { src: 'img2/pelikulak2/maspalomas_handia.png', text: 'MASPALOMAS' },
    { src: 'img2/pelikulak2/crepusculo_handia.jpg', text: 'CREPUSCULO: Nada Volverá a Ser Lo Mismo' },
    { src: 'img2/pelikulak2/los_domingos_handia.jpg', text: 'LOS DOMINGOS' },
    { src: 'img2/pelikulak2/tom_y_jerry_Handia.jpg', text: 'TOM Y JERRY: Aventura En El Tiempo' }
];

/* ==========================
   HASIERAKO ALDAGAIK
========================== */
/* Index aldagaiak zein irudi erakutsi behar den kontrolatzen du */
let index = 0;

/* HTML dokumentutik irudi elementua hartu */
const img = document.getElementById('hasierakoArgazkia');

/* ==========================
   IRUDIA EGUNERATZEKO FUNTZIOA
========================== */
/* Argazkia eta testua eguneratzen ditu */
function eguneratuArgazkia() {
    if (!img) return; // Elementua ez badago, ez egin ezer
    img.src = images[index].src; // Irudi berriaren bidea jarri
    tituluak.textContent = images[index].text; // Testua eguneratu

    img.classList.add('fade-out'); // Fade efektua gehitu

    /* 200ms geroago irudi berria aplikatu eta efektua kendu */
    setTimeout(() => {
        img.src = images[index].src;
        img.classList.remove('fade-out');
    }, 200);
}

/* ==========================
   NABIGAZIO FUNTZIOAK
========================== */
/* Hurrengo irudia erakusten du */
function hurrengoIrudia() {
    if (index < images.length - 1) { // Azken irudira heldu gabe
        index++;
        eguneratuArgazkia();
    }
}

/* Aurreko irudia erakusten du */
function atzeraIrudia() {
    if (index > 0) { // Lehen irudira heldu gabe
        index--;
        eguneratuArgazkia();
    }
}

/* ==========================
   HASIERAKO ESKU-HARTZEA
========================== */
/* DOM guztia kargatu ondoren irudia lehenengo aldiz erakutsi */
document.addEventListener('DOMContentLoaded', eguneratuArgazkia);
